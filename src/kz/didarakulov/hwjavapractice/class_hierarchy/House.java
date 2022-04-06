package kz.didarakulov.hwjavapractice.class_hierarchy;

import java.util.Arrays;
import java.util.Objects;

public class House {
    private Room[] rooms;
    private Kitchen kitchen;
    private String address;

    public House(Room[] rooms, Kitchen kitchen, String address) {
        this.rooms = rooms;
        this.kitchen = kitchen;
        this.address = address;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + Arrays.toString(rooms) +
                ", kitchen=" + kitchen +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return Arrays.equals(getRooms(), house.getRooms()) && Objects.equals(getKitchen(), house.getKitchen()) && Objects.equals(getAddress(), house.getAddress());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getKitchen(), getAddress());
        result = 31 * result + Arrays.hashCode(getRooms());
        return result;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
