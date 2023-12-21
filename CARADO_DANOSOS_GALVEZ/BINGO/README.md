# Bingo Game
> This repository contains source code for playing a Bingo Game, made by Java, and utilized Java Swing for GUI

## Bingo Game Flow:
### Dependencies
![Dependencies](images/Dependencies.png "Code Snippet 1")

### Main Program:
* The user has the option to input (No. of Cards) how many Bingo cards to use, with maximum of 5 cards only. The input is taken by using a scanner.
* Initialize an Bingo array with size of the same number of inputted number of cards. And created a class instance for each element.
* Each iteration will then call necessary methods to prepare the card.

Cards Input & Class Instantiation
![Snippet1](images/Snippet_1.png "Code Snippet 1")

* Iterate for 35 draws, with each draw will be saved in their respective lists of B, I, N, G, O, and update the current status of the current iteration of Bingo Card.

Cards Update & Saving of Drawn Numbers
![Snippet2](images/Snippet_2.png "Code Snippet 2")

* Each iteration of the cards will be validated and checked to see if it hits the bingo.
* If bingo hits, it will create another card from that current iteration of card, and displays the numbers that hit the bingo.

Bingo!
![Bingo!](images/Snippet_3.png "Bingo!")

* If not Bingo, the user will have the choice to continue the game. But it each iteration of cards will instantiate a new class for another card. Or they can also end the game.

Repeat Program
![Repeat](images/Snippet_4.png "Repeat")

### Bingo Class:

Bingo Class Diagram
![UML Diagram](images/UMLDiagram.png "Bingo Class Diagram")