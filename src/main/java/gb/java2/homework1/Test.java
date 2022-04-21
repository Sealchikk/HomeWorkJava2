package gb.java2.homework1;

public class Test {

    public static void main(String[] args) {
        Obstacles[] obstacless = {
                new Wall(5),
                new Treadmill(10),
                new Wall(10),
                new Treadmill(15),
                new Wall(15),
                new Treadmill(20),
                new Wall(20),
                new Treadmill(25)
        };

        Running[] runnings = {
                new Human(10, 15),
                new Cat(10, 6),
                new Robot(25, 14),
        };
        boolean i = true;
        for (Running running : runnings) {
            for (Obstacles obstacles : obstacless) {
                if (obstacles instanceof Treadmill) {
                    i = running.run(obstacles);
                } else {
                    i = ((Jumping) running).jump(obstacles);
                }
                if (!i) {
                    break;
                }
            }
        }
    }
}


