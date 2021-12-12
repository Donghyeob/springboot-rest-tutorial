package com.donghyeob.restapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // setter, getter 자동 생성
@AllArgsConstructor // 모든 파라메터를 가진 생성자를 만들어줌
public class ResultVO {
    private Integer code;
    private String messsage;
}