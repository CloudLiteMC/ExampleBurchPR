package com.burchard36.json.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.UUID;

public class JsonSaveEvent extends Event implements Cancellable {

    public static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCanceled;

    private final File file;

    public JsonSaveEvent(final File file) {
        this.isCanceled = false;
        this.file = file;
    }

    public final File getSavedFile() {
        return this.file;
    }

    @Override
    public boolean isCancelled() {
        return this.isCanceled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCanceled = true;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}