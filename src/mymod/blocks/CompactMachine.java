package mymod.blocks;

import mindustry.world.blocks.storage.*;
import mindustry.world.*;
import mindustry.gen.*;
import arc.graphics.*;

public class CompactMachine extends StorageBlock {
    public float shrinkScale = 0.5f;
    public float growScale = 1.0f;
    public float transformSpeed = 0.1f;

    public CompactMachine(String name) {
        super(name);
        this.size = 2;
        this.health = 200;
        this.itemCapacity = 200;
    }

    @Override
    public void load() {
        super.load();
    }

    public static class CompactMachineEntity extends StorageEntity {
        public float scaleLevel = 1.0f;
        public boolean isCompressed = false;

        @Override
        public void update() {
            super.update();
            // Handle shrinking/growing animations
            updateScale();
        }

        private void updateScale() {
            float targetScale = isCompressed ? 0.5f : 1.0f;
            if (Math.abs(scaleLevel - targetScale) > 0.01f) {
                scaleLevel += (targetScale - scaleLevel) * 0.1f;
            }
        }
    }
}
