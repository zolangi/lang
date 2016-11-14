import Data.List
import System.IO

times9 :: Int -> Int
times9 x = x*9

getAddFunc :: Int -> (Int -> Int)

getAddFunc x y = x + y

adds3 = getAddFunc 3

ninePlus3 = adds3 9

threePlusList = map adds3 [1, 2, 3, 4, 5]


