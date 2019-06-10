public class Piano implements IInstrument {

private String name;
private int priceInitial;
private int price;

//constructor
public Piano(String name, int priceInitial, int price){
  this.name = name;
  this.priceInitial = priceInitial;
  this.price = price;
}

public String playTune(){
  return "piano sound";
}


}
