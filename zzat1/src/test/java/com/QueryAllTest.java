package com;

import com.demo.dao.ZzAtDao;
import com.demo.entity.ZzAt;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

public class QueryAllTest extends  DemoApplicationTests {
    @Autowired
    private ZzAtDao zz;
    @Test
    public void QueryAll(){
       System.out.println("成功查询所有数据!");
       List<ZzAt> z=zz.queryAll();
      for(int i=0;i<z.size();i++){
          System.out.println("{id:"+z.get(i).getId()+"  groupid:"+z.get(i).getGroupid()+"  receiverid:"+z.get(i).getReceiverid()+"}");
      }

    }
}
