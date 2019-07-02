package com.lianrong.myspringbootdemo.entity;

import javax.persistence.*;

// entity是指这个类映射有数据库表，当不使用这个类的时候，后台不会对其进行处理。
// 只有从数据库读取数据时，由于要读取的表映射有实体类 ，后台会自动实例化一个对象，然后将数据库中的数据填充到对象中。
@Entity // @Entity定义的类对象将会成为JPA管理的实体，将映射到指定的数据库表
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uuid;

    private String name;

    @Column(name = "is_company_account")
    private Boolean isCompanyAccount;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsCompanyAccount() {
        return isCompanyAccount;
    }
    public void setIsCompanyAccount(Boolean isCompanyAccount) {
        this.isCompanyAccount = isCompanyAccount;
    }
}
