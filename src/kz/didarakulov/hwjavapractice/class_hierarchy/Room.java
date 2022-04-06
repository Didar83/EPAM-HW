package kz.didarakulov.hwjavapractice.class_hierarchy;

import java.util.Objects;

public class Room {
    private int length;
    private int width;
    private int high;

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", high=" + high +
                '}';
    }

    public Room(int length, int width, int high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getLength() == room.getLength() && getWidth() == room.getWidth() && getHigh() == room.getHigh();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHigh());
    }
}
