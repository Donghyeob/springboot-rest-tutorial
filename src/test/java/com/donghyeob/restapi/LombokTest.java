package com.donghyeob.restapi;

import org.junit.jupiter.api.Test;
import com.donghyeob.restapi.domain.ResultVO;

public class LombokTest {
	 
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO(0, "hong");
        System.out.println(result);
    }
}
