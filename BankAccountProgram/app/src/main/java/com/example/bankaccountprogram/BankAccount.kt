package com.example.bankaccountprogram

class BankAccount(var accountHolder: String,  var balance: Double) {
   private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")

    }


    fun withdraw(amount: Double){
        if (amount >= balance){
            println("Your balance is too low to withdraw that amount")
        }else{
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }

    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)

        }

    }
    fun acctBalance(): Double {
        return  balance
    }
}