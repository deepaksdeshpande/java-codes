package enums;

public enum Direction {
	NORTH(10) {
		@Override
		void displayDirection() {
			// TODO Auto-generated method stub
			System.out.println("Direction is "+Direction.NORTH+" Angle is : "+Direction.NORTH.getAngle());
		}
	},
	SOUTH(20) {
		@Override
		void displayDirection() {
			// TODO Auto-generated method stub
			System.out.println("Direction is : "+Direction.valueOf("SOUTH"));
		}
	}, 
	EAST(30) {
		@Override
		void displayDirection() {
			// TODO Auto-generated method stub
			
		}
	},
	WEST(40) {
		@Override
		void displayDirection() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private int angle;
	
	private Direction(final int angle) {
		this.setAngle(angle);
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	abstract void displayDirection();
	
}
