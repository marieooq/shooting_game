import java.awt.*;

public class Gun {

	private Polygon p;
	private int direction;
	public static int STAY_HERE = 0;
	public static int RIGHT_MOVE = 1;
	public static int LEFT_MOVE = 2;

	public Gun () {
		int [] xlist = {0, 0, 8, 13, 18, 26, 26, 0};
		int [] ylist = {15, 5, 5, 0, 5, 5, 15, 15};
		p = new Polygon (xlist, ylist, xlist.length);
		direction = STAY_HERE;
	}

	public Gun (int x, int y) {
		this ();
		for (int i = 0; i <p.xpoints.length; i ++) {
			p.xpoints [i] += x;
			p. ypoints [i] += y;
		}
	}

	public void draw (Graphics2D g2) {
		g2.setColor (Color.YELLOW);
		g2.fill (p);
		g2.setColor (Color.BLACK);
		g2.draw (p);
	}
	private void moveLeftGun () {
		for (int i = 0; i <p.xpoints.length; i ++) {
			p. xpoints[i] -= 5;
		}
	}
	private void moveRightGun () {
		for (int i = 0; i <p.xpoints.length; i ++) {
			p. xpoints[i] += 5;
		}
	}

	public void move () {
		if (direction == RIGHT_MOVE) {
			moveRightGun ();
		} else if (direction == LEFT_MOVE) {
			moveLeftGun ();
		}
	}

	public void setGun () {
	}

	public Point getGun () {
		return new Point (p.xpoints [0], p.ypoints [0]);
	}

	public void setDirection (int direction) {
		this.direction = direction;
	}
}