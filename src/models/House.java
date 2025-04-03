package models;

import enums.HouseType;

public class House {
        private long id;
        private String address;
        private int price;
        private int room;
        private HouseType houseType;
        private boolean isBooked;
        private String country;

    public House() {
    }

    public House(long id, String address, int price, int room, HouseType houseType, boolean isBooked, String country) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.room = room;
        this.houseType = houseType;
        this.isBooked = isBooked;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", room=" + room +
                ", houseType=" + houseType +
                ", isBooked=" + isBooked +
                ", country='" + country + '\'' +
                '}';
    }
}
