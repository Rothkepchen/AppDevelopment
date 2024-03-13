package com.example.rockpaperscissores

fun main() {
    var computerchoice = ""

    println("Rock, Paper or Scissors? Enter your choice")
    var userInput = readln()
    while (userInput != "Rock" && userInput != "Paper" && userInput != "Scissors") {
        println("Please pick either: Rock, Paper or Scissors ")
        userInput = readln()
    }
     var playerchoice = userInput

        val randomnNumber = (1..3).random()

        if (randomnNumber == 1) {
            computerchoice = ("Rock")
        } else if (randomnNumber == 2) {
            computerchoice = ("Paper")
        } else if (randomnNumber == 3) {
            computerchoice = ("Scissors")
        }
        println(computerchoice)

        val winner = when {
            playerchoice == computerchoice -> "Tie"
            playerchoice == "Rock" && computerchoice == "Scissors" -> "Player wins"
            playerchoice == "Scissors" && computerchoice == "Paper" -> "Player wins"
            playerchoice == "Paper" && computerchoice == "Rock" -> "Player wins"
            else -> "Computer"
        }
        if (winner == "Tie") {
            println("The game is a Tie!")
        } else if (winner == "Player wins") {
            println("Player Wins!")
        } else {
            println("Computer Wins!")
        }

        println("Tak for at spille med")
    }
