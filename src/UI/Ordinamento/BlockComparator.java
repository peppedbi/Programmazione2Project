package UI.Ordinamento;

import Blocks.Block;


import java.util.Comparator;

public class BlockComparator implements Comparator<Block> {
    public int compare(Block b, Block c) {
        if(b.getId() > c.getId()) {
            return 1;
        } else if(b.getId() == c.getId()) {
            return 0;
        } else return -1;
    }
}
