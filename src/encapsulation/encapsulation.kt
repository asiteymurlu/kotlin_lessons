package encapsulation

class BankAccount {
    private var balance: Double = 0.0

    fun getBalance(): Double {
        return balance
    }

    fun setBalance(balance: Double) {

        if(balance < 0) {
            println("0 dan kicik mebleg daxil edile bilmez!")
        } else {
            this.balance = balance
        }

    }
}

fun main() {
    val account = BankAccount()
    account.setBalance(1.11)
    account.setBalance(-1.9)

    println("Balance: ${account.getBalance()}")
}