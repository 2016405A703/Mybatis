package com.demo.entity;

import java.io.Serializable;

/**
 * (ZzAt)实体类
 *
 * @author makejava
 * @since 2019-09-25 15:07:28
 */
public class ZzAt implements Serializable {
    private static final long serialVersionUID = -46937695075357278L;
    //id
    private String id;
    //群组ID
    private String groupid;
    //被@人ID
    private String receiverid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

}