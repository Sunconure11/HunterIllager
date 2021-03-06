package baguchan.hunterillager;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = HunterIllagerCore.MODID)
public final class HunterSounds {
    public static final SoundEvent HUNTER_ILLAGER_LAUGH = createEvent("mob.hunterillager.laugh");

    private static SoundEvent createEvent(String sound) {

        ResourceLocation name = new ResourceLocation(HunterIllagerCore.MODID, sound);

        return new SoundEvent(name).setRegistryName(name);
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> evt) {

        evt.getRegistry().register(HUNTER_ILLAGER_LAUGH);
    }

    private HunterSounds() {

    }
}