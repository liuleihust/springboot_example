package com.example.springboot_example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: springboot_example
 * @description: 订单
 * @author: liulei
 * @create: 2019-03-29 19:53
 **/

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long sid;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String createTime;

    public Orders(Long sid, String name, String createTime) {
        this.sid = sid;
        this.name = name;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
