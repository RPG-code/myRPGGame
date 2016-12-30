# myRPGGame
Source code for RPG Game written by ShadowMole, edited by Salamander2

=================

## Versions.

Please see the "Version info.txt" file for a list of the versions and what has been done. Versions are shown as "Releases" in Github.

Version 1.0: ShadowMole's code as of Dec 20, 2016 (not in this repository)

Version 2.0: Minor reorganization. See "Version info.txt"

:large_orange_diamond: **ShadowMole**  Dec 29, 2016

I'm working on FileReader and Character to reduce the amount of code repetitions. The massive constructor in Character needs to be split up into methods. You also have a ton of variables, instance variables. Many of them could probably be local variables. Keep your variables in as restricted a scope as possible -- it's good programming style as it prevents problems later on.

I don't like having to type 20 words when you have 20 points to add to various attributes. There's got to be a better way to do this.

I'm also going to put all of the race info into the data files, so that you can just change the data file (to add or delete a race) without having to modify the code.
