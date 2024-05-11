package UI.GUI;

import Blocks.Block;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class BlockPane extends StackPane {
    private Block b;
    public static final int DIM_SQUARE = 50;
    private static final String FONT_NAME = "Verdana";
    private static final int FONT_SIZE = 18;
    private static final FontWeight FONT_WEIGHT = FontWeight.BOLD;
    private static final Color BLOCK_BORDER = Color.BLACK;
    private static final Color FONT_FILL = Color.BLACK;
    private static final Color FONT_BORDER = Color.BLACK;

    public BlockPane(Block block) {
//        changeBlock(block);
        initialise(block);
    }
    private void initialise(Block block) {
        Rectangle r = new Rectangle(DIM_SQUARE,DIM_SQUARE);
        r.setFill(block.getColor());
        Text text = new Text(block.getBlockname());
        getChildren().addAll(r,text);


    }
    public void changeBlock(Block block) {
        this.b = block;
        initialise(block);
    }
}
