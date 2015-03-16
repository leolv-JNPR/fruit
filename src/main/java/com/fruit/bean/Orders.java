package com.fruit.bean;

/**
 * Created by lveyo on 3/16/15.
 */
public class Orders {
    private int id;
    private int user_id;
    private int times;
    private int fruit_id;
    private int totalprice;
    private String diemeter;
    private String deliverinfo_id;
    private String paymethod;
    private String timeseachweek;
    private int invoice_id;
    private String createTime;
    private int amount;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getFruit_id() {
        return fruit_id;
    }

    public void setFruit_id(int fruit_id) {
        this.fruit_id = fruit_id;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public String getDiemeter() {
        return diemeter;
    }

    public void setDiemeter(String diemeter) {
        this.diemeter = diemeter;
    }

    public String getDeliverinfo_id() {
        return deliverinfo_id;
    }

    public void setDeliverinfo_id(String deliverinfo_id) {
        this.deliverinfo_id = deliverinfo_id;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getTimeseachweek() {
        return timeseachweek;
    }

    public void setTimeseachweek(String timeseachweek) {
        this.timeseachweek = timeseachweek;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
