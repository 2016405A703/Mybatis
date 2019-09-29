package com;

import com.demo.dao.ZzAtDao;
import com.demo.entity.ZzAt;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertTest extends  DemoApplicationTests {

    //注入dao层
    @Autowired
    ZzAtDao z1;

    @Test
    public void Insert(){
        ZzAt zz=new ZzAt("009","733","345");
        z1.insert(zz);
        System.out.print("添加成功");
    }
}
