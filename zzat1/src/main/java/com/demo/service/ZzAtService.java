package com.demo.service;

import com.demo.entity.ZzAt;
import java.util.List;

/**
 * (ZzAt)表服务接口
 *
 * @author makejava
 * @since 2019-09-25 15:07:30
 */
public interface ZzAtService {


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ZzAt queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
   /* List<ZzAt> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param zzAt 实例对象
     * @return 实例对象
     */
    ZzAt insert(ZzAt zzAt);

    /**
     * 修改数据
     *
     * @param zzAt 实例对象
     * @return 实例对象
     */
   ZzAt update(ZzAt zzAt);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(String id);

    /*查询所有*/
   List<ZzAt> findAll();
}