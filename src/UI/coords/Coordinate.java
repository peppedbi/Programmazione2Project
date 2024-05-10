package UI.coords;

import UI.Map;


public class Coordinate {
    public static final int MAX_ROWS = 9;
    public static final int MAX_COLUMNS = 9;

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean checkBounds() {
        return (this.x >= MAX_COLUMNS || this.y >= MAX_ROWS);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }
}




