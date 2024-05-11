package UI.GUI;

import Blocks.Block;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class InventoryPane extends HBox {

    private Text text;
    private HBox inventory;

    public InventoryPane() {
        super();
        inventory = new HBox();
        text = new Text("Inventory: ");
        super.getChildren().addAll(inventory,text);
    }




}
