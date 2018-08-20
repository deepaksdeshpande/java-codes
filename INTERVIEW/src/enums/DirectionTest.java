package enums;

public class DirectionTest {
	enum Direction {
		NORTH(10),
		SOUTH(20),
		EAST(30), 
		WEST(40);
		
		private int angle;
		private Direction(final int angle) {
			this.angle = angle;
		}
		
		public void setAngle(int angle) {
			this.angle = angle;
		}
		
		public int getAngle() {
			return angle;
		}
		
	};
	
	public static void main(String[] args) {
		Direction.NORTH.setAngle(400);
		System.out.println(Direction.EAST.getAngle());
		System.out.println(DirectionTest.Direction.EAST);
		System.out.println(DirectionTest.Direction.NORTH.getAngle());
		System.out.println(DirectionTest.Direction.SOUTH.getAngle() == Direction.SOUTH.getAngle());
		System.out.println(DirectionTest.Direction.NORTH.equals(DirectionTest.Direction.NORTH));
	}
}
