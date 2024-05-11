package UI.GUI;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FurnacePane extends VBox {
    BlockPane input;
    BlockPane output;

    public FurnacePane(BlockPane input, BlockPane output) {
        super();
        Text t = new Text("Furnace");
        Text y = new Text("-->");
        getChildren().addAll(t,input,y,output);
    }
}
