var even = false;

var isEven = function(x){
	if(x == 0)
		return even = true;
	else if (x == 1)
		return even;
	else if (x < 0)
		isEven(-x);
	else
		isEven(x-2);
}
