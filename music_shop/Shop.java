import java.util.*;

public class Shop {

  private ArrayList<IInstrument> myInstruments;
  private String myName;

private String name;

//constructor
public Shop(String name){
  this.name = name;
  this.myInstruments = new ArrayList<IInstrument>();
}

public void addInstrument(IInstrument instrument){
  this.myInstruments.add(instrument);
}

public String getName(){
  return this.name;
}

public ArrayList<IInstrument> getInstruments(){
  return this.myInstruments;
}

public static void main(String[] args) {

  Shop classicalTune = new Shop("Classical Tune");

  Guitar g = new Guitar("Classical", 280, 400);
  Piano p = new Piano("Grand", 1500, 2300);

  classicalTune.addInstrument(g);
  classicalTune.addInstrument(p);

  for (int i=0; i<classicalTune.getInstruments().size(); i++){
    System.out.println(classicalTune.getInstruments().get(i).playTune());
  }


}

}
