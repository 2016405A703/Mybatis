package com;

import com.demo.dao.ZzAtDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteTest extends  DemoApplicationTests {
    //注入Dao层
    @Autowired
    private ZzAtDao zz;

    @Test
    public void delete(){
        zz.deleteById("009");
        System.out.println("删除成功!");
    }
}
