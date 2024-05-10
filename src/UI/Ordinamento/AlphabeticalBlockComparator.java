package UI.Ordinamento;

import Blocks.Block;

import java.util.Comparator;

public class AlphabeticalBlockComparator implements Comparator<Block> {
    public int compare(Block b, Block c) {
        return b.toString().compareTo(c.toString());
    }

}
