package UI.GUI;

import Blocks.SandBlock;
import UI.MainView;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class ButtonListPane extends VBox {
//    MapPane mp;
    public ButtonListPane(MapPane m) {
        Button button = new Button("Add Sand!");
        getChildren().add(button);
        button.setOnAction(e -> {m.setCell(0,0,new SandBlock());});
    }
}
