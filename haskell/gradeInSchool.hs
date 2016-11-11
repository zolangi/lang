import Data.List
import System.IO

whatGrade :: Int -> String

whatGrade age
	| (age >= 5) && (age <= 6) = "Kindergarten"
	| (age > 6) && (age <= 10) = "Elementary School"
	| (age > 10) && (age <= 13) = "Middle School"
	| (age > 13) && (age <= 18) = "High School"
	| otherwise = "You need College"
