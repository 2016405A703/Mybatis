package com.demo.controller;

import com.demo.entity.ZzAt;
import com.demo.service.ZzAtService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ZzAt)表控制层
 *
 * @author makejava
 * @since 2019-09-25 15:07:31
 */
@RestController
@RequestMapping("zzAt")
public class ZzAtController {
    /**
     * 服务对象
     */
    @Resource
    private ZzAtService zzAtService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ZzAt selectOne(String id) {
        return this.zzAtService.queryById(id);
    }


    /*增加单条记录*/
    @RequestMapping (value = "/insert",method=RequestMethod.POST)
    public ZzAt insert(ZzAt zz){
        return zzAtService.insert(zz);
    }

    /*删除单条记录*/
   @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public int deleteById(String id){
       int result=zzAtService.deleteById(id);
       if(result>=1){
           System.out.println("删除成功");
           return 0;
       }
       else{
           System.out.println("删除失败");
           return 0;
       }
    }


    /*根据id修改某条记录*/
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ZzAt  update(ZzAt zz){
        return this.zzAtService.update(zz);
    }

    /*查询所有数据*/
    @RequestMapping(value="/findAll",method = RequestMethod.GET)
    public List<ZzAt> findAll(){
        return zzAtService.findAll();
    }

}