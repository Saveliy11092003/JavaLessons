#!/bin/bash

# Check for the presence of an argument - the path to the executable file
if [ $# -ne 1 ]; then
    echo "Usage: $0 <path_to_executable>"
    exit 1
fi

# Path to the executable program file obtained from script arguments
EXECUTABLE="$1"

# Initialize counts
TOTAL_TESTS=0
SUCCESSFUL_TESTS=0

# Test parameters in the form of five-number tuples (a b c delta epsilon)
TEST_CASES=(
  "-7.07 15.1012 -9.73914 0.2 0.000000001"
  "-19.9 85.43 47.815 0.2 0.000000001"
  "4.1 0.79 -7.161 0.2 0.000000001"
  "175 7343 7169 0.2 0.000000001"
  "0 0 0 0.2 0.000000001"
  "-4.1234 0 0 0.2 0.000000001"
  "4.1234 0 0 0.2 0.000000001"
  "0 -169 0 0.2 0.000000001"
  "8.89 7.12 0 0.2 0.000000001"
  "-1973 0.0147975 0 0.2 0.000000001"
  "12 48 64 0.2 0.000000001"
  "-21 147 -343 0.2 0.000000001"
  "19 99 81 0.2 0.000000001"
  "62 481 -16428 0.2 0.000000001"
  "-42 41.25 -10.25 0.2 0.000000001"
  "-5.2 -6.4 44.8 0.2 0.000000001"
)

# Function to test the program with given parameters
run_test() {
    # Split the parameters into separate variables
    IFS=" " read -r A B C DELTA EPSILON <<< "$1"

    echo "Testing with a=$A, b=$B, c=$C, delta=$DELTA, epsilon=$EPSILON"

    # Run the program with the specified parameters and capture the OUTPUT
    OUTPUT=$("$EXECUTABLE" "$A" "$B" "$C" "$DELTA" "$EPSILON")

    # Initialize a flag to check if all ROOTs satisfy the equation within epsilon
    ALL_ROOTS_OK=true

    # Search for lines with results in the program's OUTPUT and display them
    while IFS= read -r OUTPUT_LINE; do
        if [[ $OUTPUT_LINE == "Root:"* ]]; then
            # Extract the found ROOT from the line
            ROOT=$(echo "$OUTPUT_LINE" | cut -d' ' -f2)

            # Evaluate the equation with the ROOT within the script
            EQUATION_RESULT=$(bc -l <<< "$ROOT^3 + $A*$ROOT^2 + $B*$ROOT + $C")

            # Check if the absolute value of the equation result is less than epsilon
            if (( $(echo "$EQUATION_RESULT < $EPSILON || $EQUATION_RESULT > -$EPSILON" | bc -l) )); then
                echo "  $OUTPUT_LINE OK."
            else
                echo "  $OUTPUT_LINE NO OK."
                ALL_ROOTS_OK=false
            fi
        fi
    done <<< "$OUTPUT"

    if $ALL_ROOTS_OK ; then
        ((SUCCESSFUL_TESTS++))
    fi

    ((TOTAL_TESTS++))

    echo "---------------------------------------------------------"
}

# Run tests for all sets of parameters
for TEST_CASE in "${TEST_CASES[@]}"; do
    run_test "$TEST_CASE"
done

# Display the total number of tests and successful tests
echo "Total tests: $TOTAL_TESTS"
echo "Successful tests: $SUCCESSFUL_TESTS"
