package com.donghyeob.restapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // setter, getter �ڵ� ����
@AllArgsConstructor // ��� �Ķ���͸� ���� �����ڸ� �������
public class ResultVO {
    private Integer code;
    private String messsage;
}