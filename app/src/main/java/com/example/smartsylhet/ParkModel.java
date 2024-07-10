package com.example.smartsylhet;

public class ParkModel
{
    private String id;
    private String driverName;
    private String driverNumber;
    private String numberPlate;
    private String vehicleType;
    private String parkingArea;
    private String amount;
    private long date;

    private String userId;

    public ParkModel()
    {

    }

    public ParkModel(String id, String driverName, String driverNumber, String numberPlate, String vehicleType, String parkingArea, String amount, long date, String userId) {
        this.id = id;
        this.driverName = driverName;
        this.driverNumber = driverNumber;
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
        this.parkingArea = parkingArea;
        this.amount = amount;
        this.date = date;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(String parkingArea) {
        this.parkingArea = parkingArea;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
