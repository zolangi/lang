var boardSize = 8;
var boardBoxes = "";

for(var row = 0; row < 8; row++){

	for(var col = 0; col < boardSize; col++){
	    if( (row + col) %2 == 0)
		boardBoxes = boardBoxes + "   ";
	    
	    else
		boardBoxes = boardBoxes + "##";
	}


	boardBoxes = boardBoxes + "\n";
}

console.log(boardBoxes);
