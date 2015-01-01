package in.itsvenkis.scala.restaurant.actors

import in.itsvenkis.scala.restaurant.Order

import scala.actors.Actor


/**
 * Created by itsvenkis on 01/01/15.
 */
class Waiter extends Actor{
  
  def act():
  Unit ={
    while ( true ){
      receive{
        case Order(tableNumber:Int,dishName:String) => println("Order received")
        case _ => println("For now I am just taking orders")
      }
    }  
  }
}
