package com.qcw.flowermanagerment.Model;

public class Flower {
    private String id;

    private String type;

    private String planttime;

    private String farming;

    private String nongzi;

    private String location1;

    private String location2;

    private String location3;

    private String location4;

    private String company;

    private String contactperson;

    private String contactnum;

    private String quantity;

    private Double costperplant;

    private Double cost;

    private String operator;

    private String fertilization;

    private String watering;

    private String growth;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPlanttime() {
        return planttime;
    }

    public void setPlanttime(String planttime) {
        this.planttime = planttime == null ? null : planttime.trim();
    }

    public String getFarming() {
        return farming;
    }

    public void setFarming(String farming) {
        this.farming = farming == null ? null : farming.trim();
    }

    public String getNongzi() {
        return nongzi;
    }

    public void setNongzi(String nongzi) {
        this.nongzi = nongzi == null ? null : nongzi.trim();
    }

    public String getLocation1() {
        return location1;
    }

    public void setLocation1(String location1) {
        this.location1 = location1 == null ? null : location1.trim();
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2 == null ? null : location2.trim();
    }

    public String getLocation3() {
        return location3;
    }

    public void setLocation3(String location3) {
        this.location3 = location3 == null ? null : location3.trim();
    }

    public String getLocation4() {
        return location4;
    }

    public void setLocation4(String location4) {
        this.location4 = location4 == null ? null : location4.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum == null ? null : contactnum.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public Double getCostperplant() {
        return costperplant;
    }

    public void setCostperplant(Double costperplant) {
        this.costperplant = costperplant;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getFertilization() {
        return fertilization;
    }

    public void setFertilization(String fertilization) {
        this.fertilization = fertilization == null ? null : fertilization.trim();
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering == null ? null : watering.trim();
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth == null ? null : growth.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}