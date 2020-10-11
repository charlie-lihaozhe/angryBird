//: angrybird.util/pets/ForNameCreator.java
package angrybird.util.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "angrybird.util.pets.Mutt",
    "angrybird.util.pets.Pug",
    "angrybird.util.pets.EgyptianMau",
    "angrybird.util.pets.Manx",
    "angrybird.util.pets.Cymric",
    "angrybird.util.pets.Rat",
    "angrybird.util.pets.Mouse",
    "angrybird.util.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
