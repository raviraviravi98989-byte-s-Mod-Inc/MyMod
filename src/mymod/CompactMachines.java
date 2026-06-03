package mymod;

import mindustry.mod.*;
import mindustry.game.EventType.*;
import mindustry.world.*;
import mindustry.gen.*;
import mymod.blocks.*;

public class CompactMachines extends Mod {
    public static final float SHRINK_SCALE = 0.5f;
    public static final float GROW_SCALE = 1.0f;
    
    public static CompactMachine compactMachine;

    public CompactMachines() {
        super();
    }

    @Override
    public void loadContent() {
        // Register custom blocks
        compactMachine = new CompactMachine("compact-machine");
        
        // Register event listeners for unit touch/untouch
        Events.on(UnitControlEvent.class, e -> handleUnitControl(e));
    }

    /**
     * Handle unit touch and untouch events for shrinking/growing
     */
    private void handleUnitControl(UnitControlEvent event) {
        if (event.unit != null && event.unit.isPlayer()) {
            // Check if unit is on a Compact Machine block
            Building building = event.unit.tileOn().build;
            if (building instanceof CompactMachine.CompactMachineEntity) {
                CompactMachine.CompactMachineEntity entity = (CompactMachine.CompactMachineEntity) building;
                entity.isCompressed = !entity.isCompressed;
            }
        }
    }
}
