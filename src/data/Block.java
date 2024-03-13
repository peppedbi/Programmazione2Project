package data;

public class Block {
    private char contenuto;
    private boolean falls_with_gravity;
    private boolean fall_through;

    public Block() {
        this.contenuto = '.';
        this.falls_with_gravity = false;
        this.fall_through = true;
    }
    public Block(char c) {
        this.contenuto = c;
        this.fall_through = false;
        this.falls_with_gravity = true;
    }
    public char display() {
        return contenuto;
    }

    public boolean isFall_through() {
        return fall_through;
    }

    public boolean isFalls_with_gravity() {
        return falls_with_gravity;
    }
}
