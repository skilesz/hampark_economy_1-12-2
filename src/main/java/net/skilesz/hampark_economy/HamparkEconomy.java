package net.skilesz.hampark_economy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = HamparkEconomy.MOD_ID, name = HamparkEconomy.NAME, version = HamparkEconomy.VERSION)
public class HamparkEconomy
{
    public static final String MOD_ID = "hampark_economy";
    public static final String NAME = "Hampark Economy";
    public static final String VERSION = "0.0.1-1.12.2";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
