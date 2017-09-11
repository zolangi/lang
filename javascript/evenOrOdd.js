<<<<<<< HEAD
boolean even = true;

var isEven = function(x){
    return even;
}

console.log("50: " + isEven(50));
console.log("75: " + isEven(75));
console.log("-1: " + isEven(-1));
=======
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
>>>>>>> 1dd814e944b5d4ab3956bc684de574b0eccdd0ee
