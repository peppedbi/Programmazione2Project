package Blocks;

import javafx.scene.paint.Color;

public interface Block extends InventoryBlock{
    public char display();
    public boolean isFall_through();
    public boolean isFalls_with_gravity();
    public boolean isPickable();
    public int getId();
    public Color getColor();
    public String getBlockname();


}


