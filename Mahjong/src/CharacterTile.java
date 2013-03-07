import java.io.IOException;


public class CharacterTile extends Tile
{
	private char symbol;
	
	public CharacterTile(char symbol)
	{
		this.symbol = symbol;
	}
	

	
	 public boolean matches(Object otherObject)
	 {
		  if (this == otherObject) return true;

	      if (otherObject == null) return false;

	      if (getClass() != otherObject.getClass()) return false;

	      CharacterTile other = (CharacterTile) otherObject;

	      return symbol == other.symbol;
	 }
	 
	public String toString()
	{

		if (symbol == '1' || symbol =='2' || symbol =='3' || symbol =='4' || symbol =='5' || symbol =='6' || symbol =='7' || symbol =='8' || symbol =='9' )
			return "Character " + String.valueOf(symbol);
		
		switch(symbol)
		{
			case 'N':
				return "North Wind";
			case 'E':
				return "East Wind";
			case 'W':
				return "West Wind";
			case 'S':
				return "South Wind";
			case 'C':
				return "Red Dragon";
			case 'F':
				return "Green Dragon";
				
		}
		
		//only if a condition is not met
		return null;
		
	}

}
