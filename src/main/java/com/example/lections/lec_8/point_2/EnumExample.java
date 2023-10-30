package com.example.lections.lec_8.point_2;

public class EnumExample {

    public static void main(String[] args) {

        HouseWithEnum house1 = new HouseWithEnum(HouseType.SKYTOWER, 4, 4, true);
        HouseWithEnum house2 = new HouseWithEnum(HouseType.INDIVIDUAL, 4, 4, true);
        HouseWithEnum house3 = new HouseWithEnum(HouseType.SKYTOWER, 4, 4, true);

        HouseWithEnum[] houses = new HouseWithEnum[] {house1, house2, house3};
        for (int i = 0; i < houses.length; i++) {
            HouseWithEnum house = houses[i];
            if(HouseType.SKYTOWER.equals(house.getType())) {
                house.setHeatingOn(false);
                System.out.println("Heating OFF! " + house);
            }
        }
    }
}
