package org.alexdev.unlimitednametags.format;

import com.hera.craftkit.paper.minimessage.CraftKitMiniMessageTags;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import org.jetbrains.annotations.NotNull;

public final class NametagMiniMessage {

    private static final MiniMessage MINI_MESSAGE = MiniMessage.builder()
            .editTags(tags -> tags.resolver(CraftKitMiniMessageTags.playerHead()))
            .build();

    private NametagMiniMessage() {
    }

    @NotNull
    public static Component deserialize(@NotNull String text) {
        return MINI_MESSAGE.deserialize(text);
    }

    @NotNull
    public static Component deserialize(@NotNull String text, @NotNull Audience audience,
            @NotNull TagResolver resolver) {
        return MINI_MESSAGE.deserialize(text, audience, resolver);
    }
}
