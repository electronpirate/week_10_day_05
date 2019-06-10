public class Dog implements IPet {

private String name;

//constructor
public Dog(String name){
  this.name = name;
}

public String makeNoise(){
  return "Woof";

}
}
