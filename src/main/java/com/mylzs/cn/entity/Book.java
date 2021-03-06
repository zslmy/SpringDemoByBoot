package com.mylzs.cn.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 17/12/3.
 */
@Entity
@Table(name ="t_book" )
public class Book {
    @Id
    @GeneratedValue
    private  Integer id;
    @Column(length = 100)
    private  String name;
    @Column(length = 50)
    private  String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
