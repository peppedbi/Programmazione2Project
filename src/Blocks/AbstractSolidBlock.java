package Blocks;

public abstract class AbstractSolidBlock extends AbstractBlock {
    public AbstractSolidBlock() {
        fall_through = false;
        falls_with_gravity = false;
        is_pickable = true;
    }
}
