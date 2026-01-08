////Banking System – Multiple Accounts
////Create an abstract class BankAccount with constructor (accountNumber: String, balance: Double).
////Add abstract functions deposit(amount: Double) and withdraw(amount: Double).
////Create SavingsAccount (with interest calculation) and CheckingAccount (with overdraft support).
////Define an interface Taxable with method deductTax(). Only SavingsAccount should implement it.
////Write a demo that keeps accounts in a list, performs operations, and shows polymorphism.
//
//abstract class BankAccount{
//    abstract val accountNumer: String
//    abstract var balance: Double
//    abstract fun deposit(amount:Double)
//    abstract fun withdraw(amount: Double)
//
//}
//
//interface Taxable{
//    fun deductTax()
//}
//
//class SavingsAccount(override val accountNumer: String, override var balance: Double): BankAccount(), Taxable{
//    override fun deposit(amount: Double) {
//        balance+=amount
//
//        println("Deposit to Savings Account: Balance: $balance")
//    }
//
//    override fun withdraw(amount: Double) {
//        balance-=amount
//        deductTax()
//        println("withdraw to Savings Account: Balance: $balance")
//    }
//
//    override fun deductTax() {
//        balance-=10
//    }
//
//}
//
//class  CheckingAccount(override val accountNumer: String, override var balance: Double):BankAccount(){
//
//    override fun deposit(amount: Double) {
//        balance+=amount
//        println("Deposit to Checking Account: Balance: $balance")
//    }
//
//    override fun withdraw(amount: Double) {
//        balance -=amount
//        println("Withdraw to Account: Balance: $balance")
//
//    }
//
//}
//
//fun main(){
//
//    val accs= listOf(CheckingAccount("123456", balance = 1000.00),
//        SavingsAccount("1234567", balance = 1200.00),
//        SavingsAccount("1234578", balance = 1000.00)
//    )
//
//    for(i in accs){
//        val f=i.deposit(100.0)
//        val w=i.withdraw(200.00)
//
//    }
//}