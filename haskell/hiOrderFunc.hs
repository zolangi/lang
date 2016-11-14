import Data.List
import System.IO

times9 :: Int -> Int
times9 x = x * 9

listTimes9 = map times9 [1, 2, 3, 4 , 5]

multBy9 :: [Int] -> [Int]
multBy9 [] = []
multBy9 (x:xs) = times9 x : multBy9 xs

{-[1, 2,3 , 4] : x = 1 | xs = [2, 3,4 ]
[2, 3, 4] : x = 2 | xs = [3, 4]
-}


