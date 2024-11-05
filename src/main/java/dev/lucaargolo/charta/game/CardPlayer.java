package dev.lucaargolo.charta.game;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface CardPlayer {

    List<Card> getHand();

    void handUpdated();

    CompletableFuture<Card> getPlay(CardGame<?> game);

    void setPlay(CompletableFuture<Card> play);

    void tick(CardGame<?> game);

    void openScreen(CardGame<?> game, BlockPos pos, CardDeck deck);

    ResourceLocation getTexture();

    boolean isPreComputed();

}
