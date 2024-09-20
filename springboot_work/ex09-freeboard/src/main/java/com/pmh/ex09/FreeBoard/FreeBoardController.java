package com.pmh.ex09.FreeBoard;

import com.pmh.ex09.error.BizException;
import com.pmh.ex09.error.ErrorCode;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<FreeBoardResPageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
            , @RequestParam(name = "size", defaultValue = "5") int size) {


        Sort sort = Sort.by(Sort.Direction.DESC, "idx");

        Pageable pageable = PageRequest.of(pageNum, size, sort);

        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);


        System.out.println("elements = " + page.getTotalElements());
        System.out.println("pages = " + page.getTotalPages());

        FreeBoardResPageDto freeBoardResPageDto
                = new ModelMapper()
                .map(page, FreeBoardResPageDto.class);

        List<FreeboardResponseDto> list = new ArrayList<>();
        for (FreeBoard freeBoard : freeBoardResPageDto.getContent()) {
            FreeboardResponseDto freeboardResponseDto
                    = new ModelMapper().map(freeBoard, FreeboardResponseDto.class);
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy년MM월dd일 hh:mm");

            freeboardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeboardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

            list.add(freeboardResponseDto);
        }
        ;
        freeBoardResPageDto.setList(list);

        return ResponseEntity.ok(freeBoardResPageDto);
//        return ResponseEntity.ok(list.get().toList());
    }

    @GetMapping("view/{idx}")
    public ResponseEntity<FreeboardResponseDto> findOne(@PathVariable(name = "idx") long idx) {

        FreeBoard freeBoard = freeBoardRepository.findById(idx).orElseThrow(()-> new BizException(ErrorCode.Not_Found));

        FreeboardResponseDto freeboardResponseDto = modelMapper.map(freeBoard, FreeboardResponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy년MM월dd일 hh:mm");

        freeboardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeboardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

        return ResponseEntity.ok(freeboardResponseDto);
    }

    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        System.out.println(freeBoard);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);

    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> deleteById(@PathVariable(name="idx")long idx){
        freeBoardRepository.findById(idx).orElseThrow(()-> new BizException(ErrorCode.Not_Found));
        freeBoardRepository.deleteById(idx);
        return  ResponseEntity.ok("삭제되었습니다");
    }

}
