package gb.java2.homework1;

public class Cat implements Running, Jumping {
    private int runlength;
    private int jumplength;

    public Cat(int runlength, int jumplength) {
        this.runlength = runlength;
        this.jumplength = jumplength;
    }

    @Override
    public boolean run(Obstacles obstacles) {
        if (obstacles.getLength() <= runlength) {
            System.out.println("Cat run");
            return true;
        } else {
            System.out.println("Cat can't run");
            return false;
        }
    }

    @Override
    public boolean jump(Obstacles obstacles) {
        if (obstacles.getLength() <= jumplength) {
            System.out.println("Cat jump");
            return true;
        } else {
            System.out.println("Cat can't jump");
            return false;
        }
    }
}
