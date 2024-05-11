package UI.GUI;

import javafx.scene.layout.BorderPane;

public class MainGui extends BorderPane {

    public MainGui(MapPane map, ButtonListPane button, FurnacePane furnace) {
        setRight(furnace);
        setCenter(map);
        setLeft(button);
    }
}
