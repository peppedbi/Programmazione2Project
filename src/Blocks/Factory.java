package Blocks;

public class Factory {
    public SandBlock sand_block() {
        return new SandBlock();
    }
    public WaterBlock water_block() {
        return new WaterBlock();
    }
    public RawIronBlock rawIron_block() {
        return new RawIronBlock();
    }
    public NullBlock null_block() {
        return new NullBlock();
    }
    public Furnace furnace(){
        return new Furnace();
    }
}
