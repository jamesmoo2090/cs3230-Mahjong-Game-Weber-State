
public class Tile 
{
	 public boolean matches(Object otherObject)
	 {
		  if (this == otherObject) return true;

	      if (otherObject == null) return false;

	      if (getClass() != otherObject.getClass()) return false;

	      Tile other = (Tile) otherObject;

	      return true;
	   }

}
