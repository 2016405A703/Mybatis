package com;

import com.demo.dao.ZzAtDao;
import com.demo.entity.ZzAt;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateTest extends DemoApplicationTests {
    @Autowired
    private ZzAtDao zz;

    @Test
    public void Update(){
        ZzAt z1=new ZzAt("001","400","800");
        zz.update(z1);
        System.out.println("修改成功!");
    }
}
