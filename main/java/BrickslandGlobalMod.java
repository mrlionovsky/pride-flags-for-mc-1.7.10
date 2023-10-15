import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BrickslandGlobalMod.MODID, version = BrickslandGlobalMod.VERSION)
public class BrickslandGlobalMod<brickslandru_prideDemiboy> implements IFuelHandler /*IWorldGenerator DEBUG!*/ {



    public static final String MODID = "BrickslandRu Pride flags";
    public static final String VERSION = "001";

    @SidedProxy(clientSide="ClientProxyBrickslandGlobalMod", serverSide="CommonProxyBrickslandGlobalMod")
    public static CommonProxyBrickslandGlobalMod proxy;
    public static BrickslandGlobalMod modInstance;
    public static BrickslandGlobalMod instance;

    //Pride flags
    brickslandru_prideLgbt brickslandru_01 = new brickslandru_prideLgbt();
    brickslandru_prideTrans brickslandru_02 = new brickslandru_prideTrans();
    brickslandru_prideNonbinary brickslandru_03 = new brickslandru_prideNonbinary();

    brickslandru_prideAll brickslandru_04 = new brickslandru_prideAll();
    brickslandru_prideBisexual brickslandru_05 = new brickslandru_prideBisexual();
    brickslandru_pridePansexual brickslandru_06 = new brickslandru_pridePansexual();
    brickslandru_prideAsexual brickslandru_07 = new brickslandru_prideAsexual();

    brickslandru_prideLesby brickslandru_08 = new brickslandru_prideLesby();
    brickslandru_prideQueer brickslandru_09 = new brickslandru_prideQueer();
    brickslandru_pridePolysexual brickslandru_10 = new brickslandru_pridePolysexual();
    brickslandru_prideHeterosexual brickslandru_11 = new brickslandru_prideHeterosexual();

    brickslandru_prideDemysexual brickslandru_12 = new brickslandru_prideDemysexual();
    brickslandru_prideAgender brickslandru_13 = new brickslandru_prideAgender();
    brickslandru_prideDeboy brickslandru_14 = new brickslandru_prideDeboy();
    brickslandru_prideDemigirl brickslandru_15 = new brickslandru_prideDemigirl();

    brickslandru_pridePolyamory brickslandru_16 = new brickslandru_pridePolyamory();
    brickslandru_prideBdsm brickslandru_17 = new brickslandru_prideBdsm();
    brickslandru_prideBear brickslandru_18 = new brickslandru_prideBear();
    brickslandru_prideAromantic brickslandru_19 = new brickslandru_prideAromantic();

    @Override
    public int getBurnTime(ItemStack fuel) {
        return 0;
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        GameRegistry.registerFuelHandler(this);
        /* GameRegistry.registerWorldGenerator(this, 1); DEBUG */
        this.brickslandru_01.load();
        this.brickslandru_02.load();
        this.brickslandru_03.load();
        this.brickslandru_04.load();
        this.brickslandru_05.load();
        this.brickslandru_06.load();
        this.brickslandru_07.load();
        this.brickslandru_08.load();
        this.brickslandru_09.load();
        this.brickslandru_10.load();
        this.brickslandru_11.load();
        this.brickslandru_12.load();
        this.brickslandru_13.load();
        this.brickslandru_14.load();
        this.brickslandru_15.load();
        this.brickslandru_16.load();
        this.brickslandru_17.load();
        this.brickslandru_18.load();
        this.brickslandru_19.load();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        //Auto
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        this.brickslandru_01.preInit(event);
        this.brickslandru_02.preInit(event);
        this.brickslandru_03.preInit(event);
        this.brickslandru_04.preInit(event);
        this.brickslandru_05.preInit(event);
        this.brickslandru_06.preInit(event);
        this.brickslandru_07.preInit(event);
        this.brickslandru_08.preInit(event);
        this.brickslandru_09.preInit(event);
        this.brickslandru_10.preInit(event);
        this.brickslandru_11.preInit(event);
        this.brickslandru_12.preInit(event);
        this.brickslandru_13.preInit(event);
        this.brickslandru_14.preInit(event);
        this.brickslandru_15.preInit(event);
        this.brickslandru_16.preInit(event);
        this.brickslandru_17.preInit(event);
        this.brickslandru_18.preInit(event);
        this.brickslandru_19.preInit(event);
        proxy.registerRenderers(this);
    }

}


