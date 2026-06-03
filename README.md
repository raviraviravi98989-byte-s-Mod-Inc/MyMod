# Compact Machines Mod for Mindustry

A Mindustry mod that introduces Compact Machines - powerful contraptions that can be toggled between two states using unit interactions.

## Features

- **Unit Touch**: Touch units to shrink compact machines
- **Unit Untouch**: Untouch units to grow compact machines back to normal size
- Dynamic size transformation system
- Compatible with Mindustry 158.1+

## Installation

1. Download the mod files
2. Place in your Mindustry mods directory
3. Enable the mod in Mindustry's mod menu
4. Restart the game

## Building

This is a Java-based Mindustry mod. To build:

```bash
gradle build
```

The compiled JAR will be available in the `build/libs/` directory.

## Project Structure

```
MyMod/
├── mod.hjson                      # Mod metadata and configuration
├── src/
│   └── mymod/
│       └── CompactMachines.java  # Main mod class
├── build.gradle                  # Gradle build configuration
├── README.md                      # This file
└── LICENSE                        # MIT License
```

## Development

The mod uses Mindustry's event system to detect unit interactions:
- `UnitControlEvent`: Triggered when units are touched/untouched
- Event handlers manage the shrink/grow transformations

### Compact Machine Mechanics

- **Default State**: Machines start at normal size (GROW_SCALE = 1.0)
- **Touched State**: When a unit touches the machine, it shrinks (SHRINK_SCALE = 0.5)
- **Untouched State**: When the unit is removed, the machine grows back to normal

## License

MIT License - See LICENSE file for details
