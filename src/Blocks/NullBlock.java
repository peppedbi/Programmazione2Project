package Blocks;

public class NullBlock extends AbstractSolidBlock implements SmeltableBlock{
    @Override
    public Block smelt() {
        return new NullBlock();
    }
    public NullBlock() {
        super();
        is_pickable = false;
    }
}
