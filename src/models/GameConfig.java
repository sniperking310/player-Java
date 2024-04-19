package models;

import java.util.Vector;

public record GameConfig(Vector<BaseLevel> baseLevels, PathConfig paths) {
}
