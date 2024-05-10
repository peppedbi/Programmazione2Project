package Blocks;

public class AirBlock extends AbstractBlock {
//    private char contenuto;
//    private boolean falls_with_gravity;
//    private boolean fall_through;

    public AirBlock() {
        contenuto = '.';
        falls_with_gravity = false;
        fall_through = true;
        color = null;
    }
//    public char display() {
//        return contenuto;
//    }
//
//    public boolean isFall_through() {
//        return fall_through;
//    }
//
//    public boolean isFalls_with_gravity() {
//        return falls_with_gravity;
//    }
}
