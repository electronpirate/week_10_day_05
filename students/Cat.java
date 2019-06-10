public class Cat implements IPet {

private String name;

//constructor
public Cat(String name){
  this.name = name;
}

public String makeNoise(){
  return "Miaooww";
}

}
