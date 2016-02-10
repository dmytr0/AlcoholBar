# AlcoholBar

Write a Java SE application that solves the following problem:

You are in an empty room with only the following objects:
• One tube, coming out of the wall, with a valve (V1), which produces infinite amounts of pure alcohol
(100%),
• One tube, coming out of the wall, with a valve (V2), which produces infinite amounts of pure water
(0%),
• Two empty canisters (similar to gasoline canisters), with volume 3 liters (C1) and 5 liters (C2)
respectively.

Calculate step-by-step instructions on how to get exactly 1 liter of vodka in either C1 or C2. 1 liter of vodka
here is a 1 liter of solution that contains 40% pure alcohol. 1 liter of vodka must be measured precisely.

Problem conditions:
• Imagine that the activity takes place in a simple empty room with Earth gravity,
• There are no other objects in the room,
• You are free to use any amount of liquid from V1 and V2, you are free to dispose of any amount at
any time,
• Filling 1/2 or 1/3 of a canister with any liquid is not allowed, since it can’t be considered precise.

Expected output:
Step-by-step instructions (example):

Action C1 (State) C2 (State)

Initial state Empty Empty

Fill C1 with V2 3L (0%) Empty

Transfer C1 content to C2 Empty 3L (0%)

Fill C1 with V1 3L (100%) 3L (0%)

Transfer C1 content to C2 1L (100%) 5L (40%)

Purge C1 Empty 5L (40%)

Acceptance criteria:
• Solution must be provided in an executive *.jar file and run in command line
• 3rd party libraries may not be used
• Comment coverage should be at least 20%
• Code style should be applied (e.g. Google or a well-known convenient alternative)
• The code should run on Windows and Linux
