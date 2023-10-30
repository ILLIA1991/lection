package com.example.lections.lec_8.point_2;

public class HouseWithEnum {

    private HouseType type;
    private int floorNumber;
    private int residentsNumber;
    private boolean heatingOn;


    public HouseWithEnum(HouseType type, int floorNumber, int residentsNumber, boolean heatingOn) {
        this.type = type;
        this.floorNumber = floorNumber;
        this.residentsNumber = residentsNumber;
        this.heatingOn = heatingOn;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getResidentsNumber() {
        return residentsNumber;
    }

    public void setResidentsNumber(int residentsNumber) {
        this.residentsNumber = residentsNumber;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public void setHeatingOn(boolean heatingOn) {
        this.heatingOn = heatingOn;
    }

    @Override
    public String toString() {
        return "HouseWithEnum{" +
                "type=" + type +
                ", floorNumber=" + floorNumber +
                ", residentsNumber=" + residentsNumber +
                ", heatingOn=" + heatingOn +
                '}';
    }
}
