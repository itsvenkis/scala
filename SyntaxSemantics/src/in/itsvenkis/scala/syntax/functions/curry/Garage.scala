package in.itsvenkis.scala.syntax.functions.curry

/**
 * Created by itsvenkis on 06/01/15.
 */
class Garage {
  
  def repair(car : Car) = {
    (mechanic : Mechanic) =>
      mechanic.drive(car)
  }
  
}

trait Mechanic{
  def drive(car:Car) : Unit
}


class HondaMechanic extends Mechanic{
  
  override def drive(car:Car): Unit = {
    println("repairing car "+car.name)
    println("test driving car " + car.name)
    println("repaired your car successfully.Oh yes!! by the way I charge less")
  }
  
}

class BMWMechanic extends Mechanic{

  override def drive(car:Car): Unit = {
    println("repairing car "+car.name)
    println("test driving car " + car.name)
    println("repaired your car successfully.Oh yes!! by the way I charge more")
  }

}
