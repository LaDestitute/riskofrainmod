package io.github.colochampre.riskofrainmod.events;

import io.github.colochampre.riskofrainmod.RoRmod;
import io.github.colochampre.riskofrainmod.client.models.LemurianModel;
import io.github.colochampre.riskofrainmod.client.renderer.LemurianRenderer;
import io.github.colochampre.riskofrainmod.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RoRmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
  @SubscribeEvent
  public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
    event.registerEntityRenderer(EntityInit.LEMURIAN_ENTITY.get(), LemurianRenderer::new);
  }

  @SubscribeEvent
  public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions events) {
    events.registerLayerDefinition(LemurianModel.LAYER_LOCATION, LemurianModel::createBodyLayer);
  }
}
