package ml.derek.gdx.turnbased.models.tiles;

import ml.derek.gdx.turnbased.models.Tile;
import ml.derek.gdx.turnbased.util.Vector2i;
import ml.derek.gdx.turnbased.util.Vector3i;

public class Plain extends Tile
{
	public Plain(Vector3i position)
	{
		super(position);
	}

	public Plain(int x, int y, int z)
	{
		super(x, y, z);
	}

	public Plain(Vector2i position2)
	{
		super(position2);
	}

	public Plain(int x, int y)
	{
		super(x, y);
	}

	@Override
	public boolean isSolid()
	{
		return false;
	}
}
