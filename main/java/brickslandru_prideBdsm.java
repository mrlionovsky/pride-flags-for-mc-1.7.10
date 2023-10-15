import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.init.*;

import java.util.*;

import net.minecraft.client.renderer.texture.*;
public class brickslandru_prideBdsm{

    public brickslandru_prideBdsm(){}

    public static BlockPrideBdsm block;

    public static Object instance;public int addFuel(ItemStack fuel){return 0;}
    public void serverLoad(FMLServerStartingEvent event){}
    public void preInit(FMLPreInitializationEvent event){

        GameRegistry.registerBlock(block, "PrideBdsm");
    }
    public void registerRenderers(){}
    public void load(){
        GameRegistry.addShapedRecipe(new ItemStack(block, 6), new Object[]{
            "111", "XXX", "234",
            Character.valueOf('X'), new ItemStack(Items.paper, 1),
            Character.valueOf('1'), new ItemStack(Items.stick, 1),
            Character.valueOf('2'), new ItemStack(Items.dye, 1, 0),
            Character.valueOf('3'), new ItemStack(Items.dye, 1, 1),
            Character.valueOf('4'), new ItemStack(Items.dye, 1, 0),

        });
    }


    static{

        block = (BlockPrideBdsm)(new BlockPrideBdsm().setHardness(0.1F)
                .setResistance(0.1F)
                .setLightLevel(0.3F)
                .setBlockName("PrideBdsm")
                .setBlockTextureName("PrideBdsm")
                .setStepSound(Block.soundTypeCloth)
                .setCreativeTab(CreativeTabs.tabBlock)
                );
        //;block.setBlockBounds(0.0F,0.0F,0.0F,1.0F,1.0F,1.0F);
        Block.blockRegistry.addObject(183, "PrideBdsm", block);
    }

    public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
    static class BlockPrideBdsm extends Block
    {
        int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;

        IIcon gor = null, dol = null, st1 = null, st2 = null, st3 = null, st4 = null;

        boolean red = false;


        @Override
        public void addCollisionBoxesToList (World world, int x, int y, int z, AxisAlignedBB axisalignedbb, List arraylist, Entity entity)
        {
            this.setBlockBoundsBasedOnState(world, x, y, z);
            super.addCollisionBoxesToList(world, x, y, z, axisalignedbb, arraylist, entity);
        }

        @Override
        public void setBlockBoundsForItemRender ()
        {
            this.setBlockBounds(0.2f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override
        public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
            // Вычисляем направление блока на основе поворота сущности
            int direction = MathHelper.floor_double(entity.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

            // Устанавливаем соответствующую метадату блока в зависимости от направления
            if (direction == 0) {
                world.setBlockMetadataWithNotify(x, y, z, 6, 2);
            } else if (direction == 1) {
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
            } else if (direction == 2) {
                world.setBlockMetadataWithNotify(x, y, z, 9, 2);
            } else if (direction == 3) {
                world.setBlockMetadataWithNotify(x, y, z, 0, 2);
            }

            // Если у предмета есть имя, то устанавливаем его для блока
            // (этот код был закомментирован в оригинальном варианте)
            // if (itemStack.hasDisplayName()) {
            //     ((TileEntityFurnace)world.getTileEntity(x, y, z)).func_145951_a(itemStack.getDisplayName());
            // }
        }

        @Override
        public void setBlockBoundsBasedOnState (IBlockAccess world, int x, int y, int z)
        {
            int meta = world.getBlockMetadata(x, y, z); // 8;
            if ( (meta == 0) || (meta == 1) || (meta == 2) ) {
                this.setBlockBounds(0.9f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else if ((meta == 3) || (meta == 4) || (meta == 5) )  {
                this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.1f, 1.0f, 1.0f);
            } else if ( (meta == 6) || (meta == 7) || (meta == 8)) {
                this.setBlockBounds(0.0f, 0.0f, 0.9f, 1.0f, 1.0f, 1.0f);
            } else if ((meta == 9) || (meta == 10) || (meta == 11)) {
                this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1f);
            }
        }

        @Override
        public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entity, int l, float m, float n, float o){

            if(true){
                //Смотрим мету блока
                int metaf;
                metaf = (world.getBlockMetadata(x, y, z));
                //Сторона 0
                if (metaf == 0)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 1, 2);
                }
                if (metaf == 1)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 0, 2);
                }

                //Сторона 1
                if (metaf == 3)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 4, 2);
                }

                if (metaf == 4)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 3, 2);
                }
                //Сторона 2
                if (metaf == 6)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 7, 2);
                }

                if (metaf == 7)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 6, 2);
                }
                //Сторона 3
                if (metaf == 9)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 10, 2);
                }
                if (metaf == 10)
                {
                    world.setBlockMetadataWithNotify(x, y, z, 9, 2);
                }

            }
            return true;
        }

        @Override
        public boolean isOpaqueCube ()
        {
            return false;
        }

        @Override
        public boolean renderAsNormalBlock ()
        {
            return false;
        }

        @Override
        public int damageDropped (int meta)
        {
            return meta % 8;
        }


        protected BlockPrideBdsm()
        {
            super(Material.ground);

        }

        @SideOnly(Side.CLIENT)
        //Объявляем текстуры для сторон
        protected IIcon BlockIconDown;
        protected IIcon BlockIconRight;
        protected IIcon BlockIconNone;


        @SideOnly(Side.CLIENT)
        @Override
        public void registerBlockIcons(IIconRegister par1IconRegister)
        {
            // Регистрируем путь до png-текстур для разных сторон блока

            this.BlockIconDown = par1IconRegister.registerIcon("PrideBdsmDown");
            this.BlockIconRight = par1IconRegister.registerIcon("PrideBdsmRight");
            this.BlockIconNone = par1IconRegister.registerIcon("garland_none");
        }

        @SideOnly(Side.CLIENT)
        @Override
        public IIcon getIcon(int i, int par2){
            //Сторона 0
            if (par2 == 0 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconNone;
                else if (i == 3)
                    return this.BlockIconNone;
                else if (i == 4)
                    return this.BlockIconDown;
                else if (i == 5)
                    return this.BlockIconDown;
                else
                    return this.gor;
            }
            if (par2 == 1 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconNone;
                else if (i == 3)
                    return this.BlockIconNone;
                else if (i == 4)
                    return this.BlockIconRight;
                else if (i == 5)
                    return this.BlockIconRight;
                else
                    return this.gor;
            }
            //Сторона 1
            if (par2 == 3 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconNone;
                else if (i == 3)
                    return this.BlockIconNone;
                else if (i == 4)
                    return this.BlockIconDown;
                else if (i == 5)
                    return this.BlockIconDown;
                else
                    return this.gor;
            }
            if (par2 == 4 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconNone;
                else if (i == 3)
                    return this.BlockIconNone;
                else if (i == 4)
                    return this.BlockIconRight;
                else if (i == 5)
                    return this.BlockIconRight;
                else
                    return this.gor;
            }
            //Сторона 3
            if (par2 == 6  ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconDown;
                else if (i == 3)
                    return this.BlockIconDown;
                else if (i == 4)
                    return this.BlockIconNone;
                else if (i == 5)
                    return this.BlockIconNone;
                else
                    return this.gor;
            }
            if (par2 == 7  ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconRight;
                else if (i == 3)
                    return this.BlockIconRight;
                else if (i == 4)
                    return this.BlockIconNone;
                else if (i == 5)
                    return this.BlockIconNone;
                else
                    return this.gor;
            }
            //Сторона 4
            if (par2 == 9 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconDown;
                else if (i == 3)
                    return this.BlockIconDown;
                else if (i == 4)
                    return this.BlockIconNone;
                else if (i == 5)
                    return this.BlockIconNone;
                else
                    return this.gor;
            }
            if (par2 == 10 ){
                if (i == 0)
                    return this.BlockIconNone;
                else if (i == 1)
                    return this.BlockIconNone;
                else if (i == 2)
                    return this.BlockIconRight;
                else if (i == 3)
                    return this.BlockIconRight;
                else if (i == 4)
                    return this.BlockIconNone;
                else if (i == 5)
                    return this.BlockIconNone;
                else
                    return this.gor;
            }

            return this.gor;

        }
        @Override
        public int getRenderType(){
            return 0;
        }
        public int tickRate()
        {
            return 10;
        }


        @Override
        public int quantityDropped(Random par1Random){
            return 1;
        }

    }
}