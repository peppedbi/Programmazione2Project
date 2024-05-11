package main;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import Blocks.*;
import UI.GUI.*;
import UI.Inventory;
import UI.MainView;
import UI.Map;
import UI.coords.Coordinate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    BlockPane blockpane;
    Block block = new RawIronBlock();

    InventoryPane inventorypane;
    Collection<Block> inv = new ArrayList<>();
    public void start(Stage stage) {
        //blocchi
        blockpane = new BlockPane(block);
        stage = new Stage();
        stage.setTitle("mockup");
//        blockpane.changeBlock(new TorchBlock());

        //inventario
        inventorypane = new InventoryPane();
        inv.add(new TorchBlock());
        inv.add(new GlassBlock());
        inv.add(new RawIronBlock());
        Iterator<Block> it = inv.iterator();
        while(it.hasNext()) {
            inventorypane.getChildren().add(new BlockPane(it.next()));
        }
//        Scene scene = new Scene(inventorypane);
//        stage.setScene(scene);

        //furnace
        FurnacePane fp = new FurnacePane(new BlockPane(new SandBlock()),
                new BlockPane(new GlassBlock()));
        inventorypane.getChildren().add(fp);

        //map
        MapPane mp = new MapPane();
        MainView map = new MainView();


        for(int i = 0; i < MapPane.MAX_WIDTH; i++) {
            for(int j = 0; j < MapPane.MAX_HEIGHT; j++) {
                BlockPane bp = new BlockPane(map.getElement(i,j));
                MapPane.setConstraints(bp,i,j);
                mp.getChildren().add(bp);
            }
        }

        //main GUI
        ButtonListPane button = new ButtonListPane(mp);
        MainGui gui = new MainGui(mp,button,fp);
        Scene scene = new Scene(gui);
        stage.setScene(scene);




        stage.show();


    }
    public static void main(String[] args) {
        launch();


//        MainView m = new MainView();
//        m.display();
//        for (int i = 0; i < 9; i++) {
//            System.out.println("Enter row and then column to pick that block");
//            System.out.println("Enter '9' and the item number to move the item to the furnace");
//            System.out.println("Enter '99' and then '9' to smelt");
//            System.out.println("Enter '99' and then '0' to toggle the inventory sorting");
//            System.out.println("Enter '99' and then any number to take from the furnace into the inventory");
//            Scanner myObj = new Scanner(System.in);
//            int row = myObj.nextInt();
//            int col = myObj.nextInt();
//            if (row == 9) {
//                m.moveInvFurn(col);
//            } else if (row == 99) {
//                if (col == 9) {
//                    m.smelt();
//                } else if (col == 0) {
//                    m.toggle_inventory_comparator();
//                } else {
//                    m.moveFurnInv();
//                }
//            } else {
//                Coordinate c = new Coordinate(row, col);
//                m.pickup_block(c.getX(), c.getY());
//            }
//            m.display();
//            Button b = new Button();
//        }
    }


    @Override
    public void handle(ActionEvent event) {

    }
}



