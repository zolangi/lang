import Data.List
import System.IO

maxInt = maxBound :: Int

minInt = minBound :: Int

bigFloat = 3.99999999999 + 0.00000000005

always5 :: Int

always5 = 5

sumOfNums = sum[1..1000]

addNums x y = x + y
subNums x y = x - y
multNums x y = x * y
divNums x y = x/y

modNums x y = mod x y
modAlt x y = x `mod` y

negNumEx = 5 + (-4) --Has to be in parantheses or else Haskell will get confused

num9 = 9 :: Int
sqrtOf9 = sqrt(fromIntegral num9) --fromIntegral casts an int to a float

--Built in Functions

piVal = pi
ePow9 = exp 9
logOf9 = log 9
squared9 = 9**2
truncateVal = truncate 9.999
roundVal = round 9.999
ceilingVal = ceiling 9.999
floorVal = floor 9.999

tANDf = True && False
tORf  = True || False
notT = not(True)

zeroToTen = [0..10]
evenList = [2,4..20]

letterEvery = ['A','C'..'Z']

--Functions Haskell Uses
--Useful tools
