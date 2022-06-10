package vorgaben;

/**
 * @param xSize Breite des Kartons
 * @param ySize Länge des Kartons
 * @param zSize Höhe des Kartons
 * @param material material des Karton
 */
public record Box(float xSize, float ySize, float zSize, Material material) {}
