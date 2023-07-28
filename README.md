# Mine Sweeper Game

## *Game Features: 

-The game is text based.
-The user determines the size of the matrix, that is, the number of rows and columns.
-Random mines are placed as a quarter of the number of elements of the array (number of elements / 4). For example, if the array is 4x3 in size, the number of elements is calculated with the formula (number of rows * number of columns) and its size is 12. In this case, the number of mines becomes 12 / 4 = 3 pieces.
-The user selects a point on the matrix. Enters row and column values ​​for point selection.
-It is checked whether the selected point is within the boundaries of the array and if the condition is not met, the point is requested again.
-If there is a mine at the point where the user enters, gamer loses the game.
-If there are no mines, all positions touching the relevant point are checked (right, left, up, down) and the sum of the number of mines around is written on the relevant point. If there is no mine touching the point, the value "0" is assigned.
-If the gamer can select all the points without pressing any mines, gamer wins the game.
