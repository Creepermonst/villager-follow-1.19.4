package colorizedblock.vf.Villagers;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.world.World;

public class FFOL extends VillagerEntity {
    public FFOL(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        // Change the behavior of the villager
        this.goalSelector.add(1, new WanderAroundFarGoal(this, 0.5D));
        // The above code adds a new goal to make the villager wander around randomly.
    }
}
