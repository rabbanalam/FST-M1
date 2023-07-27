# Activity to demo parametrization and fixtures in pytest
import pytest

@pytest.fixture
def wallet_amount():
    return 0

@pytest.mark.parametrize("earned, spent, expected", [(30,10,20),(40,20,20)])
def test_walletTransaction(wallet_amount, earned, spent, expected):
    # earned money
    wallet_amount+=earned

    #Spent money
    wallet_amount-=spent

    #Assertion
    assert wallet_amount == expected