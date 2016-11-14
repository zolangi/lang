import Data.List
import System.IO

sayHi = do
	putStrLn "What is your name?"
	name <- getLine
	putStrLn $ "Hello " ++ name

writeToFile = do
	theFile <- openFile "test.txt" WriteMode
	hPutStrLn theFile ("Random line of text")
	hClose theFile

readFromFile = do
	theFile2 <- openFile "test.txt" ReadMode
	contents <- hGetContents theFile2
	putStr contents
	hClose theFile2


