//: angrybird.util/pets/LiteralPetCreator.java
// Using class literals.
package angrybird.util.pets;
import java.util.*;

public class LiteralPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> allTypes =
    Collections.unmodifiableList(Arrays.asList(
      Pet.class, Dog.class, Cat.class,  Rodent.class,
      Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
      Cymric.class, Rat.class, Mouse.class,Hamster.class));
  // Types for random creation:
  private static final List<Class<? extends Pet>> types =
    allTypes.subList(allTypes.indexOf(Mutt.class),
      allTypes.size());
  public List<Class<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class angrybird.util.pets.Mutt, class angrybird.util.pets.Pug, class angrybird.util.pets.EgyptianMau, class angrybird.util.pets.Manx, class angrybird.util.pets.Cymric, class angrybird.util.pets.Rat, class angrybird.util.pets.Mouse, class angrybird.util.pets.Hamster]
*///:~
