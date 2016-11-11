addMe :: Int -> Int -> Int ->

addMe x y = x + y

sumMe x y  = x + y

addTuples :: (Int, Int) -> (Int, Int)

addTuples (x, y) (x2, y2) = (x + x2, y + y2)

whatAge :: Int -> String

whatAge 16 = "You can drive"
whatAge 18 = "You can vote"
whatAge 21 = "You are an adult"
whatAge x = "Nothing important"



