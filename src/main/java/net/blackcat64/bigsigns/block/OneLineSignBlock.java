package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.blackcat64.bigsigns.block.entity.OneLineSignEditScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundOpenSignEditorPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;

public class OneLineSignBlock extends StandingSignBlock {

    public OneLineSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new OneLineSignBlockEntity(pPos, pState);
    }

    @Override
    public void openTextEdit(Player pPlayer, SignBlockEntity pSignEntity, boolean isFrontText) {
        if (pPlayer.level().isClientSide) {
            pSignEntity.setAllowedPlayerEditor(pPlayer.getUUID());
            Minecraft.getInstance().setScreen(new OneLineSignEditScreen(pSignEntity, isFrontText, Minecraft.getInstance().isTextFilteringEnabled()));
        }
        else {
            pPlayer.openTextEdit(pSignEntity, isFrontText);
        }
    }
}
