import stanford.karel.SuperKarel; //Per Chen it is good practice to specify the class you are using for debugging purposes.

public class VotingBox extends SuperKarel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		move();
		
			while(frontIsClear()) {
			checkMiddle();
			checkBallot();
			returnToMiddle();
			}
	}
	
	public void checkMiddle() {
		while(beepersPresent()) {
			skipNext();
		}
	}
	
	public void checkBallot() {
		if(noBeepersPresent()) {
			checkBottom();
			cleanBeeper();
			checkTop();
			cleanBeeper();
			}
		}
		
	public void returnToMiddle() {
			turn90Degrees();
			move();
			turnLeft();
			move();
			if(frontIsClear()) {
				move();
			}
		}	
	
	private void skipNext() {
		move();
		move();
		
	}
	
	public void cleanBeeper() {
		if(beepersPresent()) {
			pickBeeper();
			if(beepersPresent()) {
				pickBeeper();
				}
			}
		}
	
	public void checkBottom() {
		turnRight();
		move();
	}
	
	public void checkTop() {
		turn90Degrees();
		moveToWall();
	}
	
	public void turn90Degrees() {
		turnRight();
		turnRight();
	}
	
	public void moveToWall() {
		while(frontIsClear()) {
			move();	
		}
	}
}

