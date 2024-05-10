package Blocks;

import javafx.scene.paint.Color;

public class GlassBlock extends AbstractSolidBlock{

    public GlassBlock() {
        super();
        contenuto = 'G';
        blockname = "Glass";
        is_pickable = true;
        id = 1;
        color = Color.ANTIQUEWHITE;
    }
}
