package com.lhrlyn.cn.lhrlynadmin.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 日目标完成表
 *
 * @author emlyn babamu@126.com
 * @since 1.0.0 2023-08-02
 */
@Data
@TableName("keep_task_plan")
public class KeepTaskPlan {
	@Id
	@TableId(type = IdType.ID_WORKER,value = "id")
	@TableField(value = "id")
	@Column(name = "id")
	private String id;

	@TableField(value = "create_by")
	@Column(name = "create_by")
	private String createBy;

	@TableField(value = "create_time")
	@Column(name = "create_time")
	private Date createTime;

	@TableField(value = "update_by")
	@Column(name = "update_by")
	private String updateBy;

	@TableField(value = "update_time")
	@Column(name = "update_time")
	private Date updateTime;

	/**
	* 当前日期
	*/
	@JsonFormat(pattern = "yyyy-MM-dd")
	@TableField(value = "current_date")
	@Column(name = "current_date")
	private Date currentDate;

	/**
	* 是否训练
	*/
	@TableField(value = "is_train")
	@Column(name = "is_train")
	private String isTrain;

	/**
	* 是否完成训练
	*/
	@TableField(value = "is_finish_train")
	@Column(name = "is_finish_train")
	private String isFinishTrain;

	/**
	* 是否已经打卡
	*/
	@TableField(value = "is_punch_clock")
	@Column(name = "is_punch_clock")
	private String isPunchClock;

	/**
	* 打卡时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@TableField(value = "punch_clock_time")
	@Column(name = "punch_clock_time")
	private Date punchClockTime;

	/**
	* 图片地址id
	*/
	@TableField(value = "picture_address_id")
	@Column(name = "picture_address_id")
	private String pictureAddressId;

	/**
	* 归属用户
	*/
	@TableField(value = "user_name")
	@Column(name = "user_name")
	private String userName;

}