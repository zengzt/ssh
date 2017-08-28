package com.tao;

import java.util.Date;

public class TbCollection {
    private Integer id;

    private Integer userid;

    private Integer commodityid;

    private String shoppingcatCollection;

    private Date createdtime;

    private Date updatedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getShoppingcatCollection() {
        return shoppingcatCollection;
    }

    public void setShoppingcatCollection(String shoppingcatCollection) {
        this.shoppingcatCollection = shoppingcatCollection == null ? null : shoppingcatCollection.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }
}