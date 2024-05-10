package Blocks;

import Blocks.AbstractBlock;
import javafx.scene.paint.Color;

public class WaterBlock extends AbstractBlock {
    public WaterBlock() {
        blockname = "Water";
        contenuto = 'W';
        falls_with_gravity = true;
        fall_through = true;
        is_pickable = false;
        color = Color.RED;
    }
}
