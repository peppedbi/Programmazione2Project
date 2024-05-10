package main;
import java.awt.*;
import java.util.Scanner;

import Blocks.*;
import UI.GUI.BlockPane;
import UI.Inventory;
import UI.MainView;
import UI.Map;
import UI.coords.Coordinate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    BlockPane blockpane;
    Block block = new RawIronBlock();
    public void start(Stage stage) {
        blockpane = new BlockPane(block);
        stage = new Stage();
        stage.setTitle("TRY");
        Scene scene = new Scene(blockpane);
        stage.setScene(scene);
        blockpane.changeBlock(new TorchBlock());
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
}



