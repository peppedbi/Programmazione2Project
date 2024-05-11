package UI.GUI;

import Blocks.AirBlock;
import Blocks.Block;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class MapPane extends GridPane {

    static public final int MAX_WIDTH = 9;
    static public final int MAX_HEIGHT = 9;
    public MapPane() {
        super(MAX_WIDTH,MAX_HEIGHT);
        initialise_air();

    }
    public void initialise_air() {
        for(int i = 0; i < MAX_WIDTH; i++) {
            for(int j = 0; j < MAX_HEIGHT;j++) {
                getChildren().add(new BlockPane(new AirBlock()));
            }
        }
    }
    public static Node getElementAt(GridPane gp, int i, int j) {
        for (Node x :gp. getChildren()) {
            if ((GridPane.getRowIndex(x) == i) && (GridPane.getColumnIndex(x) == j)) {
                return x;
            }
        }
        return null;
    }
    public BlockPane get_block_at_coord(int i, int j) {
        if(i > MAX_WIDTH && j > MAX_HEIGHT) {
            return null;
        } else {
            return (BlockPane) getElementAt(this,i,j);
        }
     }
    public void setCell(int i, int j, Block block) {
        for (Node x :this. getChildren()) {
            if ((GridPane.getRowIndex(x) == i) && (GridPane.getColumnIndex(x) == j)) {
                this.getChildren().clear();
                this.getChildren().add(new BlockPane(block));
            }
        }
    }
}
