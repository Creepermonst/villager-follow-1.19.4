package colorizedblock.vf;

import colorizedblock.vf.Villagers.FFOL;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillagerFollow implements ModInitializer {
	public static final String MOD_ID = "vf";
	public static final Logger LOGGER = LoggerFactory.getLogger("vf");

	private static final EntityType<FFOL> CUSTOM_VILLAGER = EntityType.Builder.create(FFOL::new, EntityClassification.MISC)
			.setDimensions(EntityDimensions.fixed(0.6f, 1.95f))
			.setCustomClientFactory((spawnEntity, world) -> new FFOL(CUSTOM_VILLAGER, world))
			.build(new ResourceLocation("MOD", "custom_villager").toString());


	@Override
	public void onInitialize() {
	}
}