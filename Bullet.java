import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Bullet {

    private Ellipse2D bullet;
    private Rectangle r = new Rectangle (8, -15, 10, 15);
    private int s = 5;

    public Bullet () {
        bullet = new Ellipse2D.Double();
        bullet.setFrame (r);
    }
    public Bullet (int x, int y) {
        this ();
        r.x += x;
        r.y += y;
        bullet.setFrame (r);
    }
    public void draw (Graphics2D g2) {
        g2.setColor (Color.YELLOW);
        g2.fill (bullet);
        g2.setColor (Color.BLACK);
        g2.draw (bullet);
    }

    public void move() {
        r.y -= s;
        bullet.setFrame(r);
    }

    public void setBulletY (int y) {
        r.y = y;
        bullet.setFrame (r);
    }
    public int getBulletY () {
        return r.y;
    }
}