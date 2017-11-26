package com.globot.hmi.attendance.domain;

import java.util.Date;

public class Menu implements Comparable<Menu>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.resource_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Integer resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.add_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.modify_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.status
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.mome
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private String mome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    private Integer parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.resource_id
     *
     * @return the value of menu.resource_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.resource_id
     *
     * @param resourceId the value for menu.resource_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.add_time
     *
     * @return the value of menu.add_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.add_time
     *
     * @param addTime the value for menu.add_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.modify_time
     *
     * @return the value of menu.modify_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.modify_time
     *
     * @param modifyTime the value for menu.modify_time
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.status
     *
     * @return the value of menu.status
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.status
     *
     * @param status the value for menu.status
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.mome
     *
     * @return the value of menu.mome
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public String getMome() {
        return mome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.mome
     *
     * @param mome the value for menu.mome
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setMome(String mome) {
        this.mome = mome == null ? null : mome.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentId the value for menu.parent_id
     *
     * @mbggenerated Sat Nov 25 21:49:04 CST 2017
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public int compareTo(Menu o) {
        return this.id.compareTo(o.getId());
    }
}