package models;

import java.util.UUID;

public record BoardAction(int src, int dest, int amount, UUID uuid, int player, Progress progress) {
}
