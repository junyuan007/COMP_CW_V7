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

4. Refactor image link
    - Create a string variable with the image link before the creating an object 
    - Example: main.java (line 57-58) 
    - Easier to make modification instead of tediously changing one by one

5. Remove unnecessary expression as parameters
    - Remove expression when creating an instance of "End" object and replace it with answer(int) after evaluating.
    - Less confusion and simplify the code

6. Throws IllegalStateException
    - Added to start method in main.java .
    - To prevent method has been invoked at an illegal or inappropriate time.

7. Remove codes commented by the previous programmer
    - Mainly removed in main.java .
    - To make code tidier and less unwanted code while programming.

### Extension
