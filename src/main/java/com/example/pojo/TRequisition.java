package com.example.pojo;


public class TRequisition {

  private String billno;
  private String callOut;
  private String callIn;
  private java.sql.Date billdate;
  private String maker;
  private String permitter;
  private String remark;


  public String getBillno() {
    return billno;
  }

  public void setBillno(String billno) {
    this.billno = billno;
  }


  public String getCallOut() {
    return callOut;
  }

  public void setCallOut(String callOut) {
    this.callOut = callOut;
  }


  public String getCallIn() {
    return callIn;
  }

  public void setCallIn(String callIn) {
    this.callIn = callIn;
  }


  public java.sql.Date getBilldate() {
    return billdate;
  }

  public void setBilldate(java.sql.Date billdate) {
    this.billdate = billdate;
  }


  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }


  public String getPermitter() {
    return permitter;
  }

  public void setPermitter(String permitter) {
    this.permitter = permitter;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
