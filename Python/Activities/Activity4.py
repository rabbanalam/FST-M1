#Game of Rock, Paper & Scissors Part 2
while True:
    #Input choice
    player1Choice = input("Player 1 --> Choose between Rock , Paper or scissors:  ").lower()
    player2Choice = input("Player2 --> Choose between Rock , Paper or scissors:  ").lower()

    if player1Choice == player2Choice:
        print("Its a Draw!!")
    elif player1Choice == "rock":
        if player2Choice == "scissors":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1Choice == "scissors":
        if player2Choice == "paper":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif player1Choice == "Paper":
        if player2Choice == "rock":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    else:
        print("Invalid choice! Try again.")

    ## Repeat condition
    reGame = input("Do you want to play another round? Yes/No: ").lower()

    if reGame == "yes":
        pass
    elif reGame == "no":
        print("Thanks for playing!!")
        raise SystemExit
    else:
        print("Invalid choice, Bye! ")
        raise SystemExit
