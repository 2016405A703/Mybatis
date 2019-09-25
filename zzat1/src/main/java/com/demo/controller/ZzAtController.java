package com.demo.controller;

import com.demo.entity.ZzAt;
import com.demo.service.ZzAtService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

}