package com.example.bankaccountprogram

import android.window.BackEvent

fun main(){
    val jacobsBankAccount = BankAccount(accountHolder = "Jacob M", balance = 1000.00)
    val kirstensBankAccount = BankAccount(accountHolder = "Kirsten R", balance = 0.0)
    jacobsBankAccount.deposit(200.00)
    jacobsBankAccount.withdraw(300.00)
    kirstensBankAccount.deposit(300.00)
    kirstensBankAccount.deposit(300.00)

    jacobsBankAccount.displayTransactionHistory()
    kirstensBankAccount.displayTransactionHistory()
    println("")
    println("")

    println("${jacobsBankAccount.accountHolder}'s" + " balance is ${jacobsBankAccount.acctBalance()}")
    println("${kirstensBankAccount.accountHolder}'s" + " balance is ${kirstensBankAccount.acctBalance()}")
}