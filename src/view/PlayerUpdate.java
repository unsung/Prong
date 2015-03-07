package view;

public class PlayerUpdate {

	public static final int UPDATE_PLAYER1= 0x1;
	public static final int UPDATE_PLAYER2= 0x2;
	public static final int UPDATE_PLAYER3= 0x3;
	public static final int UPDATE_PLAYER4= 0x4;
	public static final int UPDATE_DRONE= 0x5;
	public static final int UPDATE_NONE = 0x0;
	
	private int updateType;
	
	public PlayerUpdate(int update) {
		if (update < 6)
			updateType = update;
		else
			updateType = UPDATE_NONE;
	}
	
	public int getUpdateType() {
		return updateType;
	}
}
