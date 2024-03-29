package com.example.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Cnarea2018 implements Serializable {
    private Integer id;

    /**
    * 层级
    */
    private Boolean level;

    /**
    * 父级行政代码
    */
    private Long parentCode;

    /**
    * 行政代码
    */
    private Long areaCode;

    /**
    * 邮政编码
    */
    private Integer zipCode;

    /**
    * 区号
    */
    private String cityCode;

    /**
    * 名称
    */
    private String name;

    /**
    * 简称
    */
    private String shortName;

    /**
    * 组合名
    */
    private String mergerName;

    /**
    * 拼音
    */
    private String pinyin;

    /**
    * 经度
    */
    private BigDecimal lng;

    /**
    * 纬度
    */
    private BigDecimal lat;

    private static final long serialVersionUID = 1L;
}