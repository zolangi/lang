import Data.List
import System.IO

stringEqual :: [Char] -> [Char] -> Bool

stringEqual [] [] = True
stringEqual (x:xs)(y:yx) = x == y && stringEqual xs ys
stringEqual _ _ = False

