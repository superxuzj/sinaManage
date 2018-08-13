package com.boliangshenghe.sina.entity;

import java.util.Date;

public class Earthquake {
    private Integer id;

    private String eqname;

    private String eqid;

    private String location;

    private String magnitude;

    private String longitude;

    private String latitude;

    private String eqtime;

    private String depth;

    private String earthtype;

    private String type;

    private String status;

    private Date createtime;

    private String creator;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEqname() {
        return eqname;
    }

    public void setEqname(String eqname) {
        this.eqname = eqname == null ? null : eqname.trim();
    }

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid == null ? null : eqid.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude == null ? null : magnitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getEqtime() {
        return eqtime;
    }

    public void setEqtime(String eqtime) {
        this.eqtime = eqtime == null ? null : eqtime.trim();
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth == null ? null : depth.trim();
    }

    public String getEarthtype() {
        return earthtype;
    }

    public void setEarthtype(String earthtype) {
        this.earthtype = earthtype == null ? null : earthtype.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}