package in.itsvenkis.scala.syntax.functions.curry

/**
 * Created by itsvenkis on 06/01/15.
 */
object CurryMain extends App{
  
  //Test
  
  val carRepair = new Car("Honda")
  val garage = new Garage
  
  val hondaRepair = garage.repair(carRepair)
  
  hondaRepair(new HondaMechanic with Mechanic)
  
  val bmwCar = new Car("BMW")
  
  val bmwRepair = garage.repair(bmwCar) {
    new BMWMechanic with Mechanic
  }
  
  bmwRepair
}
