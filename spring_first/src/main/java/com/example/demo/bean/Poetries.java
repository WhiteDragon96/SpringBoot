package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Poetries implements Serializable {
    private Integer id;

    private Integer poetId;

    private String content;

    private String title;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}