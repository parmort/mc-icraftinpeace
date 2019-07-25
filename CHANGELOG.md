# *I Craft in Peace* Changelog

The format is based on [Keep a Changelog][1].
Versioning is based on the system described in the [Forge Docs][2]

[1]:https://keepachangelog.com/en/1.0.0/
[2]:https://mcforge.readthedocs.io/en/1.13.x/conventions/versioning/#versioning

## [1.14.3-1.2.0.0] - 2019-07-25

### Removed
- Shulker Shell recipe
    - Realized that shulkers and the dragon still spawn in despite peaceful mode
- Ender Flesh
    - For reasons stated above

## [1.14.3-1.1.0.0] - 2019-07-23

### Added
- ModItem class
    - Reduce code duplication, like setting the creative tab
- Shulker Shell recipe
- Ender Flesh
    
### Changed
- Refactored items to be a `ModItem`
- Refactored to use method refs wherever possible
- Refactored Sulfur Block to it's own class
    - Reduce code in `ModBlocks`

## [1.14.3-1.0.0.0] - 2019-07-23

### Added
- Trident recipe
- Prismarine Staff
    - Used to make tridents
- Quartz Blade
    - Used to make tridents
- Totem of Undying recipe
- Nether Star recipe
- Prismarine Shard decompression recipe
- Ghast Tear recipe
- Music Disc recipes
- Pigments
    - Used to make music discs
- Record Blank
    - Used to make music discs
- Ender Pearl recipe
- Nether Powder
    - Used to make ender pearls
- Spider Eye recipe
- Poisonous Potato duplication recipe
    - To make getting rotten flesh easier
- Phantom Membrane recipe
- Membrane Piece item
    - Used to make phantom membranes
- Rotten Flesh recipe
- Slime Ball recipe
- String recipe
- Blaze Rod recipe
- Nether Rod item
    - Used to make blaze rods
- Gunpowder recipe
- Sulfur and Sulfur Block item
    - Used to make gunpowder and nether rods
- Bone recipe
