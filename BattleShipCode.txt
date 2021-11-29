#BattleShip game using matrices and random
#Using functions to spawn boats onto a blank 10 x 10 matrix
#Create a function to test guess coordinates with ship coordinates to test for a "hit"

import random

rows = 10
cols = 10

board = []
board2 = []
sub = 2
def print_board(board):
    for row in board:                                              #Creates board
        for col in row:
            print(" {} ".format(col), end="")
        print("")

def hit_board(board2):                                             #Creates board to track guesses
    for row in board2:
        for col in row:
            print(" {} ".format(col), end="")
        print("")

def add_Sub(board):
    global rows
    global cols
    row = random.randint(0,rows - 2)
    col = random.randint(0,cols - 2)
    ori = random.randint(0,2)                                       #Functions to add each type of boat on the board at random coordinates and orientation
    if ori == 0:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col] = 'X'
    if ori == 1:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row][col + 1] = 'X'

    if ori == 2:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col + 1] = 'X'

def add_Destroyer(board):
    global rows
    global cols
    row = random.randint(0,rows - 2)
    col = random.randint(0,cols - 2)
    ori = random.randint(0,2)
    if ori == 0:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col] = 'X'
    if ori == 1:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row][col + 1] = 'X'

    if ori == 2:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col + 1] = 'X'

def add_Cruiser(board):
    global rows
    global cols
    row = random.randint(0,rows - 3)
    col = random.randint(0,cols - 3)
    ori = random.randint(0,2)
    if ori == 0:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col] = 'X'
            board[row + 2][col] = 'X'
    if ori == 1:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row][col + 1] = 'X'
            board[row][col + 2] = 'X'
    if ori == 2:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col + 1] = 'X'
            board[row + 2][col + 2] = 'X'

def add_AC(board):
    global rows
    global cols
    row = random.randint(0,rows - 4)
    col = random.randint(0,cols - 4)
    ori = random.randint(0,2)
    if ori == 0:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col] = 'X'
            board[row + 2][col] = 'X'
            board[row + 3][col] = 'X'
    if ori == 1:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row][col + 1] = 'X'
            board[row][col + 2] = 'X'
            board[row][col + 3] = 'X'
    if ori == 2:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col + 1] = 'X'
            board[row + 2][col + 2] = 'X'
            board[row + 3][col + 3] = 'X'

def add_Battleship(board):
    global rows
    global cols
    row = random.randint(0,rows - 5)
    col = random.randint(0,cols - 5)
    ori = random.randint(0,2)
    if ori == 0:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col] = 'X'
            board[row + 2][col] = 'X'
            board[row + 3][col] = 'X'
            board[row + 3][col] = 'X'
    if ori == 1:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row][col + 1] = 'X'
            board[row][col + 2] = 'X'
            board[row][col + 3] = 'X'
            board[row][col + 4] = 'X'
    if ori == 2:
        while board[row][col] == 0:
            board[row][col] = 'X'
            board[row + 1][col + 1] = 'X'
            board[row + 2][col + 2] = 'X'
            board[row + 3][col + 3] = 'X'
            board[row + 4][col + 4] = 'X'

board = [[0] * cols for i in range(rows)]
board2 = [[0] * cols for i in range(rows)]

print("Welcome to Battleship!")                                 #Print welcom message and spawn all the boats onto the board
add_Battleship(board)
add_Cruiser(board)
add_AC(board)
add_Destroyer(board)
add_Sub(board)


def hit_or_miss(board,board2):                                  #Calculate whether your coordinates hit or miss a boat within 40 turns
    for turn in range(40):
        hit_board(board2)
        print('Turn:',turn + 1)
        guess_row = int(input("Guess Row:"))
        guess_col = int(input("Guess Col:"))
        if board[guess_row][guess_col] == 'X':
            board2[guess_row][guess_col] = 'S'
            print("You hit my ship!")
        else:
            if (guess_row < 0 or guess_row > 9) or (guess_col < 0 or guess_col > 9):
                print("You're out of bounds!")
            elif board[guess_row][guess_col] == 0:
                board2[guess_row][guess_col] = 'X'
                print("You missed my ship!")
        if turn == 40:
            print("Game Over You Lose")
            turn =+ 1
            break

hit_or_miss(board,board2)
