bmiType :: (RealFloat a) => a -> a -> String
bmiType weight height
	| bmi <= underweight = "You are underweight"
	| bmi <= normal = "You are at a normal weight"
	| bmi <= overweight = "You are overweight"
	| otherwise = "See a doctor"
	where	bmi = weight/height ^2
		underweight = 18.5
		normal = 25.0
		overweight = 30.0
