//E-Commerce Order Processing
//Create an abstract class Order with constructor (orderId: String, amount: Double).
//Add an abstract method calculateFinalAmount(): Double.
//Create subclasses OnlineOrder and StoreOrder. Online orders should add a delivery fee, while store orders should apply a discount.
//Create an interface Trackable with fun trackStatus(): String. Let OnlineOrder implement this.
//Write a function processOrders(orders: List<Order>) that prints polymorphic results.

abstract class OrderEC {
    abstract var orderId:String
    abstract var amount: Double
    abstract  fun calculateFinalAmount()
}

interface Trackable{
    fun track(status: String)
}

class OnLineOrder(override var orderId: String, override var amount: Double): OrderEC(), Trackable{
    override fun track(status: String) {
        val trackingNumber= "orderId ${Math.random()*10000}"
        println("Your tracking ID: $trackingNumber")
    }

    override fun calculateFinalAmount() {
        val del_fee=5
        val amt=amount+del_fee
        println("Online order total is $amt")
        track(orderId)

    }
}

class StoreOrder(override var orderId: String, override var amount: Double): OrderEC() {
    override fun calculateFinalAmount() {
        val amt= amount - 10
       println("Store order Prce: $amt")
    }
}

fun main(){
    val orders= listOf(OnLineOrder("ID123", 101.5),
    StoreOrder("ID124", amount = 250.0)
    )
    fun processOrder(ords: List<OrderEC>){
        for(i in ords){
            val fa= i.calculateFinalAmount()
        }
    }

    processOrder(orders)
}