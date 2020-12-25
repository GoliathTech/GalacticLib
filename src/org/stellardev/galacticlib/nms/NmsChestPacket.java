package org.stellardev.galacticlib.nms;

import com.massivecraft.massivecore.mixin.Mixin;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class NmsChestPacket extends Mixin {

    private static final NmsChestPacket d = new NmsChestPacket().setAlternatives(
            NmsChestPacket18R1P.class
    );
    private static final NmsChestPacket i = d;
    public static NmsChestPacket get() { return i; }

    public void playOpenChest(Player player, Block block) {
        throw notImplemented();
    }

    public void playCloseChest(Player player, Block block) {
        throw notImplemented();
    }
}
