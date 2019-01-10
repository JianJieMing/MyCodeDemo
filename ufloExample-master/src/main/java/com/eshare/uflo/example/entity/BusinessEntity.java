package com.eshare.uflo.example.entity;

import javax.persistence.*;

/**
 * @Classname BusinessEntity 业务实体类
 * @Date 2019/1/9 11:31
 * @Created by jianjieming
 */
@Entity
@Table(name = "jl_db_business_tbl")
public class BusinessEntity {

    @Id
    @Column(name = "id_", length = 60)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "name_", length = 60)
    private String name;

    @Column(name = "desc_", length = 60)
    private String desc;

    public BusinessEntity() {
    }

    public BusinessEntity(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BusinessEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
