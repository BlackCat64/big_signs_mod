# Big Signs Mod

Overview
--------
This mod aims to improve Sign functionality in Minecraft, mainly by offering variants of Signs that have bigger text.

Initial Features
----------------
In the initial release, I added two new variants of sign: The **One-Line Sign** and **One-Line Hanging Sign**.
These sign blocks have only 1 line of text, as opposed to the usual 4, however the text is large enough to fill the entire sign.
Only a few characters may be entered, due to the larger text size and the sign being phyiscally the same size as the vanilla Sign block.

Planned Features
----------------
In future, I plan to overhaul the vanilla Sign's GUI by making it more like a traditional text editor. This includes:
* Different text size options for each line
* Text alignment options
* Bold, italic and underlined text
* Coloured text, with different colours on each line, or even within one line
* Hyperlinks to websites, or to run commands (Creative mode only)

Also, I plan to add physically different-sized Sign blocks:
* Billboard block - Essentially a resizable sign. If many of these are placed in a rectangle shape, the sign will adapt to become the size of this rectangle.
* Thin Sign - Like the vanilla Sign text-wise, but with only 1 line, and with a much thinner body.
  * Ends can be toggled between square or pointed, to allow for pointing signs.
  * Can be placed either on the top, middle or bottom parts of a block.

Development
-----------
I am using IntelliJ IDEA with Java and Gradle to develop this mod. I am also using the [SpongePowered/Mixin](https://github.com/SpongePowered/Mixin) library to allow modification of the existing vanilla code.
This is a different approach to my main mod, [Better Tools and Armor](https://github.com/BlackCat64/better_tools_and_armor_remote_1.20.1), since I can now directly modify existing vanilla features.

Download and Install
--------------------
Big Signs is available to download on [CurseForge](https://curseforge.com/minecraft/mc-mods/big-signs) and [Modrinth](https://modrinth.com/mod/big-signs).
There are no dependencies required - simply add the JAR file to your `.minecraft/mods` folder, load up Minecraft 1.20.1 with the Forge mod loader, and you're good to go!
