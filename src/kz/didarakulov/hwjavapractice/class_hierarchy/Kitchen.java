package kz.didarakulov.hwjavapractice.class_hierarchy;

import java.util.Objects;

public class Kitchen {
    private int length;
    private int width;
    private int high;

    @Override
    public String toString() {
        return "Kitchen{" +
                "length=" + length +
                ", width=" + width +
                ", high=" + high +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kitchen)) return false;
        Kitchen kitchen = (Kitchen) o;
        return getLength() == kitchen.getLength() && getWidth() == kitchen.getWidth() && getHigh() == kitchen.getHigh();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHigh());
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

    public Kitchen(int length, int width, int high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }
}
