function countChar(word, letter){
	var counter = 0;
  	for(var x = 0; x < word.length; x++){
    	if (word.charAt(x) == letter)	
      	  counter++;
    }
  return counter;
}

function countBs(word){
	return countChar(word, "B")
}
