package lesson13.composition;

import java.util.List;

public class Room {

    private int area;

    private String type;

    public Room(int area, String type) {
        this.area = area;
        this.type = type;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", type='" + type + '\'' +
                '}';
    }
}
