package com.zs.springboot.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * create by Mybatis-generator
 */
@Table(name = "house_comm")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class houseComm implements Serializable {
    /**
     * 房源评价表的唯一标识
     */
    @Id
    private String id;

    /**
     * 用户的编号，是房源评价表的外键
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 房源表的唯一标识，是房源评价表的外键
     */
    @Column(name = "house_id")
    private String houseId;

    /**
     * 房源评价内容
     */
    @Column(name = "comm_content")
    private String commContent;

    /**
     * 数据的创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 数据修改的时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * 冗余字段，防失误操作
     */
    private String redun;

    /**
     * 数据状态
     */
    @Column(name = "data_status")
    private Integer dataStatus;

    private static final long serialVersionUID = 1L;
}