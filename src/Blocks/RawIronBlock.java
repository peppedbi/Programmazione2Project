package Blocks;

import javafx.scene.paint.Color;

public class RawIronBlock extends AbstractSolidBlock implements SmeltableBlock {
    public RawIronBlock() {
        super();
        contenuto = 'I';
        blockname = "Raw Iron Block";
        is_pickable = true;
        id = 3;
        color = Color.BROWN;
    }
    public IronSwordBlock smelt() {
        return new IronSwordBlock();
    }
}
