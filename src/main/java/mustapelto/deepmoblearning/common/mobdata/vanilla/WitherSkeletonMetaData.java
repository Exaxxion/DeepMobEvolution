package mustapelto.deepmoblearning.common.mobdata.vanilla;

import mustapelto.deepmoblearning.common.enums.EnumLivingMatterType;
import mustapelto.deepmoblearning.common.mobdata.MobMetaData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class WitherSkeletonMetaData extends MobMetaData {
    private static WitherSkeletonMetaData instance;

    private WitherSkeletonMetaData() {
        super("Wither Skeleton",
                10,
                33,
                5,
                10,
                EnumLivingMatterType.HELLISH,
                new String[]{"Inflicts the Wither effect.", "Bring milk!"}
                );
    }

    public static WitherSkeletonMetaData getInstance() {
        if (instance == null)
            instance = new WitherSkeletonMetaData();
        return instance;
    }

    @Override
    public Entity getEntity(World world) {
        EntityWitherSkeleton entity = new EntityWitherSkeleton(world);
        entity.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.STONE_SWORD));
        return entity;
    }
}
