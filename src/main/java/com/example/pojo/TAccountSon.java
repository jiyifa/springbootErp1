package com.example.pojo;


public class TAccountSon {

  private String billid;
  private String billtypeid;
  private String custid;
  private java.sql.Date billdate;
  private String beforeprice;
  private String nowprice;


  public String getBillid() {
    return billid;
  }

  public void setBillid(String billid) {
    this.billid = billid;
  }


  public String getBilltypeid() {
    return billtypeid;
  }

  public void setBilltypeid(String billtypeid) {
    this.billtypeid = billtypeid;
  }


  public String getCustid() {
    return custid;
  }

  public void setCustid(String custid) {
    this.custid = custid;
  }


  public java.sql.Date getBilldate() {
    return billdate;
  }

  public void setBilldate(java.sql.Date billdate) {
    this.billdate = billdate;
  }


  public String getBeforeprice() {
    return beforeprice;
  }

  public void setBeforeprice(String beforeprice) {
    this.beforeprice = beforeprice;
  }


  public String getNowprice() {
    return nowprice;
  }

  public void setNowprice(String nowprice) {
    this.nowprice = nowprice;
  }

}
