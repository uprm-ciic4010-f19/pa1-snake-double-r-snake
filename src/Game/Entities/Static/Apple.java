package Game.Entities.Static;

import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;
    public boolean isGood;
    
    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
        isGood = true;
   
    }

	public boolean isGood() {
		return isGood;
	}

	public void setIsGood(boolean isGood) {
		this.isGood = isGood;
	}


}
