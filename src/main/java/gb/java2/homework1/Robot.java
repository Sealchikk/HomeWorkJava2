package gb.java2.homework1;

public class Robot implements Jumping, Running {
    private int runlength;
    private int jumplength;

    public Robot(int runlength, int jumplength) {
        this.runlength = runlength;
        this.jumplength = jumplength;
    }

    @Override
    public boolean run(Obstacles obstacles) {
        if (obstacles.getLength() <= runlength) {
            System.out.println("Robot run");
            return true;
        } else {
            System.out.println("Robot can't run");
            return false;
        }
    }

    @Override
    public boolean jump(Obstacles obstacles) {
        if (obstacles.getLength() <= jumplength) {
            System.out.println("Robot jump");
            return true;
        } else {
            System.out.println("Robot can't jump");
            return false;
        }
    }
}
