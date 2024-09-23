package com.pmh.ex08.FreeBoard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.TypeCache;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<FreeBoardResPageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum
            , @RequestParam(name = "size",defaultValue = "5") int size) {


        // select * from freeboard oder by idx desc, name desc,
        Sort sort = Sort.by(Sort.Direction.DESC, "idx");

//        int pageNum = 0;
//        int size = 10;

        // Page List
        Pageable pageable = PageRequest.of(pageNum, size, sort);

        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);


        System.out.println("elements = " + page.getTotalElements());
        System.out.println("pages = " + page.getTotalPages());

        FreeBoardResPageDto freeBoardResPageDto
                = new ModelMapper()
                .map(page, FreeBoardResPageDto.class);

        List<FreeboardResponseDto> list = new ArrayList<>();
        for (FreeBoard freeBoard : freeBoardResPageDto.getContent()){
            FreeboardResponseDto freeboardResponseDto
                    = new ModelMapper().map(freeBoard,FreeboardResponseDto.class);
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy년MM월dd일 hh:mm");

            freeboardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeboardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

                list.add(freeboardResponseDto);
        };
        freeBoardResPageDto.setList(list);

        return ResponseEntity.ok(freeBoardResPageDto);
//        return ResponseEntity.ok(list.get().toList());
    }


    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        System.out.println(freeBoard);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);

    }
}
