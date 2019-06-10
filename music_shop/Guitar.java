public class Guitar implements IInstrument {

private String name;
private int priceInitial;
private int price;

//constructor
public Guitar(String name, int priceInitial, int price){
  this.name = name;
  this.priceInitial = priceInitial;
  this.price = price;
}

public String playTune(){
  return "guitar sound";
}

}
