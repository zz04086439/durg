package com.github.binarywang.demo.wx.mp.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lzx on 2018/12/22.
 */
@Getter
@Setter
@Table(name = "TT_DURG")
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Durg {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private Long id;
    /**
     * 编码
     */
    private String name;


    private String place;

    /**
     * 拼音全拼
     */
    private String pNameFull;

    /**
     * 拼音简拼
     */
    private String pNameShort;

}
