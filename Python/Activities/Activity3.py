#Game of rock paper scissors
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