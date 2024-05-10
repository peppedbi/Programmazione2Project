package Blocks;

import javafx.scene.paint.Color;



class IronSwordBlock extends AbstractSolidBlock implements IronSwordInterface{
    public IronSwordBlock() {
        super();
        blockname = "Iron Sword";
        contenuto = 'O';
        is_pickable = true;
        id = 2;
        color = Color.GRAY;
    }

}
