package com.example.smartsylhet;


public class BookAppModel {
    private String id;
    private  String dName;
    private String specialist;
    private String chamber;
    private String fee;
    private String pname;
    private String pphn;
    private String date;
    private  String userId;

    public BookAppModel() {

    }

    public BookAppModel(String id,String dName,String specialist,String chamber,String fee,String pname,String pphn,String date,String userId){
        this.id = id;
        this.dName = dName;
        this.specialist = specialist;
        this.fee = fee;
        this.pname = pname;
        this.pphn = pphn;
        this.date = date;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPphn() {
        return pphn;
    }

    public void setPphn(String pphn) {
        this.pphn = pphn;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
