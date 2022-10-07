package com.study.mvc20220927ms.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
//@Setter
//@Getter
//@ToString
//위에 4개가 하나로 표현가능 @Data
@Data
public class TestReqDto {
    private String strData;
    private String name;
    private int number;


}
