#two.py
import one

print("Top level in TWO.py")

one.func()

#built-in variable, gets assigned a string depending on how you run the script
if __name__ == "__main__":
    #Run the script
    print("TWO.py is being run directly")
else:
    print("TWO.py is imported")