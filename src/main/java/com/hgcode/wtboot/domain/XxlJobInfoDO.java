package com.hgcode.wtboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

@TableName(value = "xxl_job_info")
public class XxlJobInfoDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 执行器主键ID
     */
    @TableField(value = "job_group")
    private Integer jobGroup;

    /**
     * 任务执行CRON
     */
    @TableField(value = "job_cron")
    private String jobCron;

    @TableField(value = "job_desc")
    private String jobDesc;

    @TableField(value = "add_time")
    private Date addTime;

    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 作者
     */
    @TableField(value = "author")
    private String author;

    /**
     * 报警邮件
     */
    @TableField(value = "alarm_email")
    private String alarmEmail;

    /**
     * 执行器路由策略
     */
    @TableField(value = "executor_route_strategy")
    private String executorRouteStrategy;

    /**
     * 执行器任务handler
     */
    @TableField(value = "executor_handler")
    private String executorHandler;

    /**
     * 执行器任务参数
     */
    @TableField(value = "executor_param")
    private String executorParam;

    /**
     * 阻塞处理策略
     */
    @TableField(value = "executor_block_strategy")
    private String executorBlockStrategy;

    /**
     * 任务执行超时时间，单位秒
     */
    @TableField(value = "executor_timeout")
    private Integer executorTimeout;

    /**
     * 失败重试次数
     */
    @TableField(value = "executor_fail_retry_count")
    private Integer executorFailRetryCount;

    /**
     * GLUE类型
     */
    @TableField(value = "glue_type")
    private String glueType;

    /**
     * GLUE源代码
     */
    @TableField(value = "glue_source")
    private String glueSource;

    /**
     * GLUE备注
     */
    @TableField(value = "glue_remark")
    private String glueRemark;

    /**
     * GLUE更新时间
     */
    @TableField(value = "glue_updatetime")
    private Date glueUpdatetime;

    /**
     * 子任务ID，多个逗号分隔
     */
    @TableField(value = "child_jobid")
    private String childJobid;

    /**
     * 调度状态：0-停止，1-运行
     */
    @TableField(value = "trigger_status")
    private Integer triggerStatus;

    /**
     * 上次调度时间
     */
    @TableField(value = "trigger_last_time")
    private Long triggerLastTime;

    /**
     * 下次调度时间
     */
    @TableField(value = "trigger_next_time")
    private Long triggerNextTime;

    public static final String COL_ID = "id";

    public static final String COL_JOB_GROUP = "job_group";

    public static final String COL_JOB_CRON = "job_cron";

    public static final String COL_JOB_DESC = "job_desc";

    public static final String COL_ADD_TIME = "add_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_AUTHOR = "author";

    public static final String COL_ALARM_EMAIL = "alarm_email";

    public static final String COL_EXECUTOR_ROUTE_STRATEGY = "executor_route_strategy";

    public static final String COL_EXECUTOR_HANDLER = "executor_handler";

    public static final String COL_EXECUTOR_PARAM = "executor_param";

    public static final String COL_EXECUTOR_BLOCK_STRATEGY = "executor_block_strategy";

    public static final String COL_EXECUTOR_TIMEOUT = "executor_timeout";

    public static final String COL_EXECUTOR_FAIL_RETRY_COUNT = "executor_fail_retry_count";

    public static final String COL_GLUE_TYPE = "glue_type";

    public static final String COL_GLUE_SOURCE = "glue_source";

    public static final String COL_GLUE_REMARK = "glue_remark";

    public static final String COL_GLUE_UPDATETIME = "glue_updatetime";

    public static final String COL_CHILD_JOBID = "child_jobid";

    public static final String COL_TRIGGER_STATUS = "trigger_status";

    public static final String COL_TRIGGER_LAST_TIME = "trigger_last_time";

    public static final String COL_TRIGGER_NEXT_TIME = "trigger_next_time";

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取执行器主键ID
     *
     * @return job_group - 执行器主键ID
     */
    public Integer getJobGroup() {
        return jobGroup;
    }

    /**
     * 设置执行器主键ID
     *
     * @param jobGroup 执行器主键ID
     */
    public void setJobGroup(Integer jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * 获取任务执行CRON
     *
     * @return job_cron - 任务执行CRON
     */
    public String getJobCron() {
        return jobCron;
    }

    /**
     * 设置任务执行CRON
     *
     * @param jobCron 任务执行CRON
     */
    public void setJobCron(String jobCron) {
        this.jobCron = jobCron;
    }

    /**
     * @return job_desc
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * @param jobDesc
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取报警邮件
     *
     * @return alarm_email - 报警邮件
     */
    public String getAlarmEmail() {
        return alarmEmail;
    }

    /**
     * 设置报警邮件
     *
     * @param alarmEmail 报警邮件
     */
    public void setAlarmEmail(String alarmEmail) {
        this.alarmEmail = alarmEmail;
    }

    /**
     * 获取执行器路由策略
     *
     * @return executor_route_strategy - 执行器路由策略
     */
    public String getExecutorRouteStrategy() {
        return executorRouteStrategy;
    }

    /**
     * 设置执行器路由策略
     *
     * @param executorRouteStrategy 执行器路由策略
     */
    public void setExecutorRouteStrategy(String executorRouteStrategy) {
        this.executorRouteStrategy = executorRouteStrategy;
    }

    /**
     * 获取执行器任务handler
     *
     * @return executor_handler - 执行器任务handler
     */
    public String getExecutorHandler() {
        return executorHandler;
    }

    /**
     * 设置执行器任务handler
     *
     * @param executorHandler 执行器任务handler
     */
    public void setExecutorHandler(String executorHandler) {
        this.executorHandler = executorHandler;
    }

    /**
     * 获取执行器任务参数
     *
     * @return executor_param - 执行器任务参数
     */
    public String getExecutorParam() {
        return executorParam;
    }

    /**
     * 设置执行器任务参数
     *
     * @param executorParam 执行器任务参数
     */
    public void setExecutorParam(String executorParam) {
        this.executorParam = executorParam;
    }

    /**
     * 获取阻塞处理策略
     *
     * @return executor_block_strategy - 阻塞处理策略
     */
    public String getExecutorBlockStrategy() {
        return executorBlockStrategy;
    }

    /**
     * 设置阻塞处理策略
     *
     * @param executorBlockStrategy 阻塞处理策略
     */
    public void setExecutorBlockStrategy(String executorBlockStrategy) {
        this.executorBlockStrategy = executorBlockStrategy;
    }

    /**
     * 获取任务执行超时时间，单位秒
     *
     * @return executor_timeout - 任务执行超时时间，单位秒
     */
    public Integer getExecutorTimeout() {
        return executorTimeout;
    }

    /**
     * 设置任务执行超时时间，单位秒
     *
     * @param executorTimeout 任务执行超时时间，单位秒
     */
    public void setExecutorTimeout(Integer executorTimeout) {
        this.executorTimeout = executorTimeout;
    }

    /**
     * 获取失败重试次数
     *
     * @return executor_fail_retry_count - 失败重试次数
     */
    public Integer getExecutorFailRetryCount() {
        return executorFailRetryCount;
    }

    /**
     * 设置失败重试次数
     *
     * @param executorFailRetryCount 失败重试次数
     */
    public void setExecutorFailRetryCount(Integer executorFailRetryCount) {
        this.executorFailRetryCount = executorFailRetryCount;
    }

    /**
     * 获取GLUE类型
     *
     * @return glue_type - GLUE类型
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * 设置GLUE类型
     *
     * @param glueType GLUE类型
     */
    public void setGlueType(String glueType) {
        this.glueType = glueType;
    }

    /**
     * 获取GLUE源代码
     *
     * @return glue_source - GLUE源代码
     */
    public String getGlueSource() {
        return glueSource;
    }

    /**
     * 设置GLUE源代码
     *
     * @param glueSource GLUE源代码
     */
    public void setGlueSource(String glueSource) {
        this.glueSource = glueSource;
    }

    /**
     * 获取GLUE备注
     *
     * @return glue_remark - GLUE备注
     */
    public String getGlueRemark() {
        return glueRemark;
    }

    /**
     * 设置GLUE备注
     *
     * @param glueRemark GLUE备注
     */
    public void setGlueRemark(String glueRemark) {
        this.glueRemark = glueRemark;
    }

    /**
     * 获取GLUE更新时间
     *
     * @return glue_updatetime - GLUE更新时间
     */
    public Date getGlueUpdatetime() {
        return glueUpdatetime;
    }

    /**
     * 设置GLUE更新时间
     *
     * @param glueUpdatetime GLUE更新时间
     */
    public void setGlueUpdatetime(Date glueUpdatetime) {
        this.glueUpdatetime = glueUpdatetime;
    }

    /**
     * 获取子任务ID，多个逗号分隔
     *
     * @return child_jobid - 子任务ID，多个逗号分隔
     */
    public String getChildJobid() {
        return childJobid;
    }

    /**
     * 设置子任务ID，多个逗号分隔
     *
     * @param childJobid 子任务ID，多个逗号分隔
     */
    public void setChildJobid(String childJobid) {
        this.childJobid = childJobid;
    }

    /**
     * 获取调度状态：0-停止，1-运行
     *
     * @return trigger_status - 调度状态：0-停止，1-运行
     */
    public Integer getTriggerStatus() {
        return triggerStatus;
    }

    /**
     * 设置调度状态：0-停止，1-运行
     *
     * @param triggerStatus 调度状态：0-停止，1-运行
     */
    public void setTriggerStatus(Integer triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    /**
     * 获取上次调度时间
     *
     * @return trigger_last_time - 上次调度时间
     */
    public Long getTriggerLastTime() {
        return triggerLastTime;
    }

    /**
     * 设置上次调度时间
     *
     * @param triggerLastTime 上次调度时间
     */
    public void setTriggerLastTime(Long triggerLastTime) {
        this.triggerLastTime = triggerLastTime;
    }

    /**
     * 获取下次调度时间
     *
     * @return trigger_next_time - 下次调度时间
     */
    public Long getTriggerNextTime() {
        return triggerNextTime;
    }

    /**
     * 设置下次调度时间
     *
     * @param triggerNextTime 下次调度时间
     */
    public void setTriggerNextTime(Long triggerNextTime) {
        this.triggerNextTime = triggerNextTime;
    }
}