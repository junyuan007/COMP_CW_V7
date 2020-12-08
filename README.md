# COMP2042_CW_JunYuan
## Frogger by Jun Yuan


## Maintainance 
### 1. Refactor of naming
    - Class name are rename
        - Example: Obstcale.java -> Vehicle.java, Animal.java -> Frog_player.java
    - Variable & method name are changed to make it maeningful
    - Snake case is used as case style for method and variable name
![variable_method_name](./README_image/maintain_1.png)<br><br><br>

### 2. Comments 
    - Javadoc auto documentation (Developers can read the documentation to understand the code better)
![javadoc](./README_image/maintain_2.png)<br>

    - Comment added at end of complex code
![comments](./README_image/maintain_3.png)<br><br><br>

### 3. Image
    - Image source name is changed (Make it meaningful)
        * Example: iKogsKW.png -> game_back_image.png
    - Correct image links which are wrongly defined
    - Image links are factorise into string variables (Easier modification to image link)
![image_links](./README_image/maintain_4.png)<br><br><br>

### 4. Remove unused code commented by previous programmer
    - To make code tidier and less disruption while coding

### 5. Refactor of method
    - Example: Remove the the part where animations are created in the main.java file into another class called Create_animations
        - Reduce length of code in main.java
![image_links](./README_image/maintain_5.png)<br><br><br>

#### 6. Animation
    - Size of animation are adjusted to make GUI better
![image_links](./README_image/maintain_6.png)<br><br> 

    - Background image is edited
![image_links](./README_image/maintain_7.png)<br><br><br>       

///////////////////////////////////////////////////////////////////////////////////////////////////////

## Extension

#### 1. Start Screen
        - Start Page Overall
![start_page](./README_image/start_page.png)<br><br> 

        - Enter Game Button 
![start_button](./README_image/start_button.png)<br><br>    

        - Info Page Button 
![info_button](./README_image/info_button.png)<br><br>   

        - Instruction Button (Pressable)
            - Alert will pop up
![instruction_button](./README_image/instruction_button.png)<br><br>   

        - Animations
            - Moveable
![start_animation](./README_image/start_animation.png)<br><br>   

#### 2. Information Screen
        - Info Page Overall
            - Text are stored in text file called frogger_info.txt
            - Details about game operation
![info_page](./README_image/info_page.png)<br><br>

        - Back button 
            - Back to start screen
![back_button](./README_image/info_back_button.png)<br><br>

#### 3. Game Screen
        - Game Page Overall
![game_page](./README_image/game_page.png)<br><br>

        - Play & Pause Button
            - Will stop and resume game timer
![play_pause_button](./README_image/play_pause_button.png)<br><br>

        - Current Level Display
            - Will update according to player's current level
![level_display](./README_image/level_display.png)<br><br>

        - High Score
            - Everytime game start it will be reset to zero
            - Will update live according to player current high score
![high_score](./README_image/highscore.png)<br><br>

            - High Score is pressable button
            - When press:
                - It will update the high score list according to the rank if the current high score is greater than scores in high score list else it will not update high score list
                - Alert will pop up
                - Updated high score list display in alert
![highscore_button](./README_image/highscore_button.png)<br><br>              

**Score is saved condition**<br>
![save_condition](./README_image/highscore_list_saved.png)<br><br>

**Score is unsaved condition**<br>
![unsave_condition](./README_image/highscore_list_unsaved.png)<br><br>

        - Game Levels Implemented
            - Total 10 levels as each time frog lands on the goal the level will increase by one.
            - As level get higher, the animation becomes faster & more complex.
            - New animation added: crocodiles and snakes
            - Details of game level can be read in information screen of game.

**Crocodiles**<br>
![animation_crocodiles](./README_image/animation_croc.png)<br>

**Snakes**<br>
![animation_snakes](./README_image/animation_snake.png)<br><br>

#### 4. Maven Implementation
        - Converted initial project to Maven project
        - Added dependencies for Javafx (Does not need to import library from Javafx)
![Maven_dependencies](./README_image/Maven_dependencies.png)<br><br>

#### 5. JUnit Test
        - Added tests to perform unit testing for game
        - All test are successful without any error
![JUnit_test](./README_image/JUnit_test.png)
            