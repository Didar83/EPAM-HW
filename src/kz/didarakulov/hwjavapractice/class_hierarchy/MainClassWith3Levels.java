package kz.didarakulov.hwjavapractice.class_hierarchy;

public class MainClassWith3Levels {
    public static void main(String[] args) {
        Room[] livingRooms = {new Room(10, 8, 3), new Room(12, 10, 3)};
        Kitchen kitchen = new Kitchen(12, 10, 3);
        House house = new House(livingRooms, kitchen, "Astana, Republic str., 1");
        System.out.println(house.toString());
    }
}
