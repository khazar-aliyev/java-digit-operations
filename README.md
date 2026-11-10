# Digit Operations Java Program (Lab05_Q1)

This Java application provides an interactive menu-driven interface to process and analyze the digits of a given positive integer without converting the number into a `String` or using arrays.

## Features

The program offers four main operations:

1. **Find Largest Digit:** Identifies the maximum digit in the number.
2. **Find Second Smallest Digit:** Returns the second smallest *distinct* digit in the integer. If no such digit exists, it returns `10`.
3. **Count Even Digits:** Calculates the total count of even digits within the number.
4. **Local Peak Detection:** Checks if the number contains at least one local peak. A local peak is defined as a digit that is strictly greater than both of its immediate neighboring digits (the first and last digits are excluded).

## Technical Requirements & Constraints

- Developed in pure **Java**.
- Strictly relies on arithmetic operators (`%`, `/`), loops (`while`), and conditional statements (`if-else`).
- Includes input validation to ensure only positive integers ($>0$) are processed.
- No `String` conversions or arrays are used.

## How to Run

1. Clone this repository:
   ```bash
   git clone [https://github.com/](https://github.com/)<your-username>/java-digit-operations-lab.git
