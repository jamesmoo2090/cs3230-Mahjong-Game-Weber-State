
public class RankTile extends Tile
{
	//had to change from private to protected to be visible by circletile
	protected int rank;
	
	public RankTile(int rank)
	{
		this.rank = rank;
	}
	
	 public boolean matches(Object otherObject)
	 {
		  if (this == otherObject) return true;

	      if (otherObject == null) return false;

	      if (getClass() != otherObject.getClass()) return false;

	      RankTile other = (RankTile) otherObject;

	      return rank == other.rank;
	   }
}
