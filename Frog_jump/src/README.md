# COMP2042_CW_JunYuan
## Maintainance made to Frogger game


### Maintainance

1. Name of variables are changed 
    - Parameters of methods and part of defining variables
    - To make variable's name more meaningful and easier to understand

2. Comments are added for Javadoc auto documentation (/**...*/)
    - Added to beggining of class, method and constructor
    - To create a maintainable code including in built testing help

3. Add comments to end of line of specific code (//...)
    - To understand what the line of code does.
    - To identify end of statements of code (if...else, for loop)
    - Code will be easy for new programmer to understand.

4. Image link
    - Create a string variable with the image link before the creating an object 
        - Example in Create_animations.java 
        - Easier to make modification to image link instead of tediously changing one by one
    - Some of the image links are wrongly defines 
        - Background image of game and car / water death image
    - Image source name is change
        - To make image name more meaningful 
        - Easier to trace back image
        - Example: iKogsKW.png -> game_back_image.png

5. Remove unnecessary expression as parameters
    - Remove meaningless expression when creating an instance of "End" object and replace it with answer(int) after evaluating.
    - Less confusion and simplify the code

6. Throws IllegalStateException
    - Added to start method in main.java .
    - To prevent method has been invoked at an illegal or inappropriate time.

7. Remove codes commented by the previous programmer and unused ones
    - Remove unused variables as well as codes
        - To make code tidier and less unwanted code while programming.

8. Some of the existing image is edited using Paint 3D 

9. Refactor
    - Class name are rename to be more meaningful
        - Example: Obstcale.java -> Vehicle.java, Animal.java -> Frog_player.java
    - Remove the the part where animations are created in the main.java file into another class called Create_animations
        - So that main.java would not be too long and easier to trace for error 

10. Animations are adjusted size accordingly
    - Changes made while creating the object as well as in constructor
    - To make visual game effect better

11. Files are categorize into different package
    - Java files moved to newly created package accordingly 
        - Package created: All_animation, All_button, Files_IO
    - Images and music source are moved to another folder
        - Files created: Files, graphic_animation, frogger_music
    - Part of refactor process to manage all files better instead of clumping everything in one package

12. Added animations
    - One more row of cars is added to make a total of 5 lanes of vehicle
    - To make game more complicated as well as to make use of empty space of the scene

### Extension

1. Menu page created (Start scene)
    - To make game more completed 
        - Class created: Menu_info_page.java, Menu_page
        - Scene is set to start scene before player will be able to play game
        - Simple WASD control instruction is added
        - Buttons added: Start game button, info button
            - Start button will set the scene to game scene
            - Info button will set scene to info scene

2. Info Page created (Info scene)
    - To understand more about the game 
        - Class created: Menu_info_page.java, Info_page, Info_text
        - Buttons added: Back button
            - Back button will set scene to start scene
        - Textarea was used to display the game operations and instructions
            - All text from textarea are stored in a text file

3. Button
    - Button for all scene was created in a seperate class
        - Button are formed from images
        - Buttons have transparent background
        - Button will form shadow when cursor is on button
            - Better visual effect 

4. HighScore
    - High score system added to game 
        - Score stored in text file (read write method)
        - Updated with timer
    - High score animation in game is a button
        - Alert is produce when high score button is press
            - Alert list of previous high score list (top 3)


            