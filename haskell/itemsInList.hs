import Data.List
import System.IO

getItemsInList :: [Int] -> String

getItemsInList [] = "Your List is Empty"
getItemsInList (x:[]) = "Your list begins with " ++ show x
getItemsInList (x:y:[]) = "Your list contains " ++ show x ++ " and " ++ show y
getItemsInList (x:xs) = "The 1st item is " ++ show x ++ " and the rest are" show xs

getFirstItem :: String -> String

getFirstItem [] = "Empty String"
getFirstItem all@(x:xs) = "The first letter in " ++ all ++ " is " ++ [x]


