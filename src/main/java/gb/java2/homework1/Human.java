package gb.java2.homework1;

public class Human implements Jumping, Running {
    private int runlength;
    private int jumplength;

    public Human(int runlength, int jumplength) {
        this.jumplength = jumplength;
        this.runlength = runlength;
    }

    @Override
    public boolean run(Obstacles obstacles) {
        if (obstacles.getLength() <= runlength) {
            System.out.println("Human run");
            return true;
        } else {
            System.out.println("Human can't run");
            return false;
        }
    }

    @Override
    public boolean jump(Obstacles obstacles) {
        if (obstacles.getLength() <= jumplength) {
            System.out.println("Human jump");
            return true;
        } else {
            System.out.println("Human can't jump");
            return false;
        }
    }
}
