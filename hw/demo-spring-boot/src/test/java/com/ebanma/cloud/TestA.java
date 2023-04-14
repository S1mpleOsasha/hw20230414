package com.ebanma.cloud;/**
 * @author 盛鑫
 * @date 2023/04/12
 */

import com.ebanma.cloud.domain.SimpleBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 盛鑫
 * @version $ Id: TestA, v 0.1 2023/04/12 17:20 盛鑫 Exp $
 */
public class TestA {
    // 测试自定义starter
    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void myStarterTest(){
        System.out.println(simpleBean);
    }
}
