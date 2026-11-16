package dev.md5n.module;

public enum Category {
    COMBAT("Combat"),
    MOVEMENT("Movement"),
    VISUAL("Visual"),
    VFX("VFX"),
    VFX0("VFX0"),
    COSMETIC("Cosmetic"),
    CLIENT("Client");

    public final String label;

    Category(String label) { this.label = label; }
}
