package com.pmh.ex10.file;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<FileEntity, Long> {

    // sekect * from file where free_board_idx=?
    List<FileEntity> findByFreeBoardIdx(long freeBoardIdx);

}
