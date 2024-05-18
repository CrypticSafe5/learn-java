package com.crypticsafe5.learning.atm;

public class Account {
  private float amount = 0f;

  public Account(float amount) {
    this.amount = amount;
  }

  float getAmount() {
    return this.amount;
  }

  float updateAmount(float value) {
    float nextAmount = amount + value;
    if (nextAmount < 0) {
      // TODO: Throw error
    }
    this.amount = nextAmount;
    return nextAmount;
  }
}
