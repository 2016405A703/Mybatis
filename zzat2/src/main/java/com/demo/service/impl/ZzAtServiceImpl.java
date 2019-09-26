package com.demo.service.impl;

import com.demo.dao.ZzAtDao;
import com.demo.entity.ZzAt;
import com.demo.service.ZzAtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ZzAt)表服务实现类
 *
 * @author makejava
 * @since 2019-09-25 15:07:31
 */
@Service
public class ZzAtServiceImpl implements ZzAtService {
    @Resource
    private ZzAtDao zzAtDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ZzAt queryById(String id) {
        ZzAt res = zzAtDao.queryById(id);
        return res;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ZzAt> queryAllByLimit(int offset, int limit) {
        return this.zzAtDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param zzAt 实例对象
     * @return 实例对象
     */
    @Override
    public ZzAt insert(ZzAt zzAt) {
        this.zzAtDao.insert(zzAt);
        return zzAt;
    }

    /**
     * 修改数据
     *
     * @param zzAt 实例对象
     * @return 实例对象
     */
    @Override
    public ZzAt update(ZzAt zzAt) {
        this.zzAtDao.update(zzAt);
        return this.queryById(zzAt.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.zzAtDao.deleteById(id) > 0;
    }
}