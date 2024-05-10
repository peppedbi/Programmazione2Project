package UI;

import Blocks.AirBlock;
import Blocks.Furnace;
import Blocks.SmeltableBlock;
import Exceptions.BlockErrorException;
import UI.Ordinamento.AlphabeticalBlockComparator;
import UI.Ordinamento.BlockComparator;

public class MainView {
    private Map map = new Map();
    private Furnace furnace = new Furnace();
    private Inventory inv = new Inventory();

    public void display() {
       // map.generateRandomMap();
        map.display_on_out();
        System.out.println();
        furnace.display_on_out();
        inv.displayInventory();
        //map.gravity();

    }
    public void move_into_furnace(int x, int y) {
        if (map.isSmeltable(x, y)) {
            furnace.setInput((SmeltableBlock) map.getBlock(x, y));
            map.fillWithVoid(x, y);
        }
    }

    public void smelt() {
        furnace.smelt();
        //inv.add_block(furnace.getOutput());
    }
    public void moveInvFurn(int index) {
        furnace.setInput((SmeltableBlock)inv.get_smeltable_item(index));
        inv.remove_from_inventory(index);
    }
    public void moveFurnInv() {
        inv.add_block(furnace.getOutput());
        furnace.setOutput(new AirBlock());
        inv.sort();
    }
    public void pickup_block(int x, int y) {
        inv.add_block(map.getBlock(x,y));
        map.fillWithVoid(x,y);
        inv.sort();
    }
    public void toggle_inventory_comparator() {
        if(inv.order instanceof BlockComparator) {
            inv.order = new AlphabeticalBlockComparator();
        } else {
            inv.order = new BlockComparator();
        }
    }


}
