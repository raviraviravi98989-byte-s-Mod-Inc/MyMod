package mymod.content;

import mindustry.type.*;
import mindustry.world.Block;
import mindustry.gen.*;
import mymod.blocks.CompactMachine;

public class CompactMachineBlocks {
    public static Block compactMachine;

    public static void load() {
        compactMachine = new CompactMachine("compact-machine");
    }
}
