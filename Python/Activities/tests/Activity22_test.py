# This is the pytest activity 22, refer lms python slides for problem statement !!
import pytest

# Sum of 2 numbers - assertion
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
@pytest.mark.activity
def test_multiplication():
    num1 = 2
    num2 = 10
    mult= num1 * num2
    assert mult == 20

#Division
@pytest.mark.activity
def test_division():
    num1 = 100
    num2 = 20
    quotient = num1 / num2
    assert quotient == 5
    