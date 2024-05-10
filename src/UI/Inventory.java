package UI;
import Blocks.*;
import Exceptions.BlockErrorException;
import UI.Ordinamento.AlphabeticalBlockComparator;
import UI.Ordinamento.BlockComparator;

import java.util.Comparator;
import java.util.Iterator;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Block> inv = new ArrayList<>();
    public Comparator<Block> order = new BlockComparator();

    public void displayInventory() {
        if(order instanceof BlockComparator) {
            System.out.println("Ordering by ID");
        } else {
            System.out.println("Ordering Alphabetically");
        }
        Iterator<Block> it = inv.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().display_in_inventory());
        }
    }
    public void add_block(Block b) {
        inv.add(b);
    }
    private boolean is_smeltable(int index) throws BlockErrorException {
        return inv.get(index) instanceof SmeltableBlock;
    }
    public Block get_smeltable_item(int index) {
        try {
            if (is_smeltable(index)) {
                return inv.get(index);
            } else {
                return new NullBlock();
            }
        } catch (BlockErrorException e) {
            System.out.println("Errore!");
            return null;
        }
    }
    public void remove_from_inventory(int index) {
        inv.remove(index);
    }
    public void sort() {
        inv.sort(order);
    }


}
