import pytest
# Refer the lms python slides for problem statement !!
# Sum of 2 numbers - assertion
#@pytest.mark.activity
def test_addition():
    num1 = 11
    num2 = 30
    sum = num1 + num2
    assert sum == 41

# Subtraction assertion
def test_subtraction():
    num1 = 30
    num2 = 10
    remain= num1 - num2
    assert remain == 20

#Multiplication
def test_multiplication():
    num1 = 2
    num2 = 10
    mult= num1 * num2
    assert mult == 20

#Division
def test_division():
    num1 = 100
    num2 = 20
    quotient = num1 / num2
    assert quotient == 5
    