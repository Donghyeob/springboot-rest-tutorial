package com.donghyeob.restapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
 
@JsonInclude(JsonInclude.Include.NON_NULL) // json을 생성할 때 property가 null이면 생성하지 말라는 거
@Data
public class BoardVO {
    private Integer id;
    private String title;
    private String content;
    private String created;
    private String updated;
}
