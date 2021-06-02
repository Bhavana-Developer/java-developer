/*
* Program 7
*/

class Bike{
String bikeId;
String bikename;
double price;
String importedFrom;
public void displayBikeDetails(){
System.out.println("Bike Id:"+bikeId);
System.out.println("Bike Name:"+bikename);
System.out.println("Price:"+price);
System.out.println("ImportedFrom:"+importedFrom);
}
}
class BikeApp{
public static void main(String args[]){
 Bike bike=new Bike();
         bike.bikeId="B11331";
         bike.bikename="bhargav";
         bike.price=99000.00;
         bike.importedFrom="hyderabad";
          bike.displayBikeDetails();
}
}     