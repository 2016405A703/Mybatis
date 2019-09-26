package com.demo;

import com.demo.controller.ZzAtController;
import com.demo.entity.ZzAt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private  ZzAtController zz;


    @Test
    public void selectOne(){
        zz.selectOne("001");
    }
    @Test
    public void contextLoads() { }

}
