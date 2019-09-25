package com.demo.dao;

import com.demo.entity.ZzAt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (ZzAt)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-25 15:07:29
 */
@Mapper
public interface ZzAtDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ZzAt queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ZzAt> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param zzAt 实例对象
     * @return 对象列表
     */
    List<ZzAt> queryAll(ZzAt zzAt);

    /**
     * 新增数据
     *
     * @param zzAt 实例对象
     * @return 影响行数
     */
    int insert(ZzAt zzAt);

    /**
     * 修改数据
     *
     * @param zzAt 实例对象
     * @return 影响行数
     */
    int update(ZzAt zzAt);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}