package com;

import com.demo.dao.ZzAtDao;
import com.demo.entity.ZzAt;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SelectOne extends DemoApplicationTests {
    @Autowired
    private ZzAtDao zz;

    @Test
    public void Selectone(){
     ZzAt z=zz.queryById("001");
     System.out.println("查询结果为:"+"{id:"+z.getId()+",groupid:"+z.getGroupid()+",receiverid"+z.getReceiverid()+"}");
    }
}
