class Plane{
void fly()
{
System.out.println("Plane is Flying");
}
}
class CargoPlane extends Plane
{
void fly()
{
System.out.println("CargoPlane is Flying at low height");
}
}
class PassengersPlane extends Plane
{
void fly()
{
System.out.println("PassengersPlane is Flying at Medium height");
}
}
class FighterPlane extends Plane
{
void fly()
{
System.out.println("FighterPlane is Flying at top height");
}
}

class Airport{
public static void main(String []args)
{
CargoPlane cp=new CargoPlane();
PassengersPlane pp=new PassengersPlane();
FighterPlane fp=new FighterPlane();

cp.fly();
pp.fly();
fp.fly();

}
}






