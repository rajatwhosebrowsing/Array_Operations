# Array_Operations
# Array Operations Project

## Introduction
This project is a simple Java-based program that demonstrates various array operations, including:
- Taking user input for an integer array
- Finding even and odd numbers in the array
- Determining the smallest number in the array
- Finding the index of the smallest distance between consecutive elements
- Converting arrays to ArrayLists and vice versa

## Project Structure
The project consists of three main Java files:

1. **Main.java** - The main driver program that executes all functions.
2. **UserInput.java** - Handles user input for the integer array.
3. **Arrayfn.java** - Contains functions for array operations and conversions.

## Features
### 1. **User Input Handling**
- Prompts the user for the size of an array.
- Ensures the size is valid before proceeding.
- Accepts integer inputs from the user.

### 2. **Array Functions (Arrayfn.java)**
- **oddEven()**: Separates odd and even numbers into different lists and displays them.
- **smallest()**: Finds and prints the smallest element in the array.
- **smallestdistanceindex()**: Finds the index where the smallest distance occurs between two consecutive elements.
- **arrayToArrayList() & arrayListToArray()**: Converts between arrays and ArrayLists.

## How to Run
1. Compile the Java files using:
   ```sh
   javac Main.java UserInput.java Arrayfn.java
   ```
2. Run the main program:
   ```sh
   java Main
   ```

## Example Output
```
Enter size of array:
5
Enter 5 numbers:
3 8 1 6 7
Even numbers:
Array: [8, 6]
Odd numbers:
Array: [3, 1, 7]
The smallest number is: 1
Index of the smallest distance: 3
Array converted to ArrayList: [apple, banana, cherry]
ArrayList converted back to Array: [apple, banana, cherry]
```

## Dependencies
- Java 8 or later

## Notes
- The Scanner is kept open to avoid resource closure issues.
- Handles invalid inputs by returning an empty array.
- Includes edge case handling for small or empty arrays.

## Author
- **Rajat**

