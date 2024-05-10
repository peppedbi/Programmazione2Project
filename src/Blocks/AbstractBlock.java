package Blocks;
import javafx.scene.paint.Color;

import java.util.Scanner;

public abstract class AbstractBlock implements Block {
    protected char contenuto;

    protected String blockname;
    protected boolean falls_with_gravity;
    protected boolean fall_through;
    protected boolean is_pickable;
    protected int id;
    protected Color color;

        public AbstractBlock() {
        this.contenuto = '.';
        this.falls_with_gravity = false;
        this.fall_through = true;
        this.is_pickable = false;
        this.color = Color.WHITE;
    }
//    public AbstractBlock(char c) {
//        this.contenuto = c;
//        this.fall_through = false;
//        this.falls_with_gravity = true;
//    }
    public char display() {
        return contenuto;
    }

    public boolean isFall_through() {
        return fall_through;
    }

    public boolean isFalls_with_gravity() {
        return falls_with_gravity;
    }

    @Override
    public String toString() {
        System.out.println("Choose:");
        System.out.println("N : Name of the block");
        System.out.println("FT : Check if the block is fall through");
        System.out.println("FG : Check if the block is subject to gravity");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        return switch (choice) {
            case "N" -> blockname;
            case "FT" -> "fall_through: " + fall_through;
            case "FG" -> "falls with gravity: " + falls_with_gravity;
            default -> "Wrong choice.";
        };
    }

    public char display_in_inventory() {
        return display();
    }

    @Override
    public boolean isPickable() {
        return is_pickable;
    }
    public int getId() {
            return id;
    }
    public Color getColor() {
            return this.color;
    }

    public String getBlockname() {
        return this.blockname;
    }
}

