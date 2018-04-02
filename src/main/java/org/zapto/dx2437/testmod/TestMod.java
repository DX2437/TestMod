package com.example.testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.zapto.dx2437.testmod.proxy.CommonProxy;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION, name = TestMod.NAME)
public class TestMod {
    public static final String MODID = "testmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Test";

    @SidedProxy(clientSide = "org.zapto.dx2437.testmod.proxy.ClientProxy", serverSide = "org.zapto.dx2437.testmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TestMod instance;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preinit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postinit(event);
    }
}
