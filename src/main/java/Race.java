public class Race {
    String leader;
    int distance;

    //Дистанция = время (24) * скорость
    public int getDistance(int speed) {
        distance = 24 * speed;
        return speed;
    }

    public String checkLeader(Car carNumberOne,
                              Car carNumberTwo,
                              Car carNumberThree) {
        int one = getDistance(carNumberOne.speed);
        int two = getDistance(carNumberTwo.speed);
        int three = getDistance(carNumberThree.speed);

        if (one > two && one > three) {
            leader = carNumberOne.name;
        } else if (two > one && two > three) {
            leader = carNumberTwo.name;
        } else if (three > one && three > two) {
            leader = carNumberThree.name;
        }
        return leader;
    }
}
