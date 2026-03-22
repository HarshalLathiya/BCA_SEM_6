class BankAccount {

    // Private data member
    private var balance: Double = 0.0

    // Public method to deposit amount
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Amount Deposited: $amount")
            println("Current Balance: $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    // Public method to withdraw amount
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Amount Withdrawn: $amount")
            println("Current Balance: $balance")
        } else {
            println("Invalid withdrawal or insufficient balance")
        }
    }
}

// Main function
fun main() {
    val account = BankAccount()

    account.deposit(5000.0)
    account.withdraw(2000.0)
}
