package com.pmh.ex08.FreeBoard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardResPageDto {

    @Schema(hidden = true) // swagger 문서에서 안보이게
    @JsonIgnore // postman 에서 안보이게
    private List<FreeBoard> content;
    private List<FreeboardResponseDto> list;
    private  int totalElements;
    private int totalPages;
    private int size;
}
