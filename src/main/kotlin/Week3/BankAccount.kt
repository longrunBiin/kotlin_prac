package Week3

class BankAccount (var holderName:String, _balance:Double){
    var balance = _balance
        private set
    val accountNumber = num
    init{
        num++
    }
    companion object{
        var num = 9
    }

    fun deposit(money:Double){
        balance+=money
    }
    fun withdraw(money:Double):Boolean{
        if(balance>=money){
            balance-=money
            return true
        }
        else{
            return false
        }
    }
}
fun main(){
        val account = BankAccount("John Smith", 100.0)
        println(account.accountNumber) // Output: 10
        println(account.balance) // Output: 100.0
        println(BankAccount("James Baker", 10.0).accountNumber) // Output: 11
        // account.balance = 10
// Compile Error (Cannot assign to 'balance': the setter is private in 'BankAccount')

        account.deposit(50.0)
        println(account.balance) // Output: 150.0

        val success = account.withdraw(75.0)
        println(success) // Output: true
        println(account.balance) // Output: 75.0

        val failure = account.withdraw(100.0)
        println(failure) // Output: false
        println(account.balance) // Output: 75.0
    }


