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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

    @GetMapping
    public ResponseEntity<List<FreeBoard>> findAll() {

        Sort sort = Sort.by(Sort.Direction.DESC,"idx");

        int page = 0;
        int size = 5;

        Pageable pageable = PageRequest.of(1,size,sort);

        Page<FreeBoard> list = (Page<FreeBoard>) freeBoardRepository.findAll(pageable);


        System.out.println("elements = "+list.getTotalElements());
        System.out.println("pages = "+list.getTotalPages());

        return ResponseEntity.ok(list.get().toList());
    }

    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        System.out.println(freeBoard);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);

    }
}
