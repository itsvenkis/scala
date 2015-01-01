package in.itsvenkis.scala.restaurant.main

import in.itsvenkis.scala.restaurant.Order
import in.itsvenkis.scala.restaurant.actors.Waiter

/**
 * Created by itsvenkis on 01/01/15.
 */
object Customer extends App{
  
  val waiter = new Waiter
  val order = new Order(123,"Non-Veg")
  
  waiter.start()
  
  waiter ! order
  
}
