package Blocks;

import Blocks.AbstractBlock;
import javafx.scene.paint.Color;

public class SandBlock extends AbstractBlock implements SmeltableBlock {
    public SandBlock() {
        fall_through = false;
        falls_with_gravity = true;
        blockname = "Sand";
        contenuto = 'S';
        is_pickable = true;
        id = 4;
        color = Color.ORCHID;
    }

    @Override
    public Block smelt() {
        return new GlassBlock();
    }
}
