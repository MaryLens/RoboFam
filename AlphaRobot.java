package robo;

public class AlphaRobot extends AbstractRobot {
	private String name;
	private String model;
	private int x;
	private int y;

//Constructors
	public AlphaRobot() {
	}

	public AlphaRobot(String name, String model) {
		setName(name);
		setModel(model);
		x=0;
		y=0;
	}
//Get/Set methods
	public void setName(String name) {
		if (!(name.equals("null"))) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setModel(String model) {
		if (!(model.equals("null"))) {
			this.model = model;
		}
	}

	public String getModel() {
		return model;
	}

	public void setX(int x) {
		if (x <= 100 && x >= 0) {
			this.x = x;
		} else if (x > 100) {
			System.err.println("X can not be more than 100!");
		} else {
			System.err.println("X can not be less than 0!");
		}
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		if (y <= 100 && y >= 0) {
			this.y = y;
		} else if (y > 100) {
			System.err.println("Y can not be more than 100!");
		} else {
			System.err.println("Y can not be less than 0!");
		}
	}

	public int getY() {
		return y;
	}

	// Methods to move
	public boolean moveRight() {
		if(x<0&&x>100) {
			setX(x++);
			return true;
		} else {
			System.err.println("Robot cannot move anymore((");
			return false;
		}
	}

	public boolean moveLeft() {
		if(x<0&&x>100) {
			setX(x--);
			return true;
		} else {
			System.err.println("Robot cannot move anymore((");
			return false;
		}
	}

	public boolean moveDown() {
		if(y<0&&y>100) {
			setX(y++);
			return true;
		} else {
			System.err.println("Robot cannot move anymore((");
			return false;
		}
	}

	public boolean moveUp() {
		if(y<0&&y>100) {
			setX(y--);
			return true;
		} else {
			System.err.println("Robot cannot move anymore((");
			return false;
		}
		
	}

}
