public class Elevator {

    private int currentFloor = 1;
    private int minFloor = 0;
    private int maxFloor = 0;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void move(int floor) {

        if (floor > maxFloor || floor < minFloor){
            System.out.println("Неверный этаж");
        }

        for (int i = floor; i > currentFloor && i <= maxFloor;) {
            moveUp();

        }


        for (int j = floor; j < currentFloor && j >= minFloor;) {
            moveDown();
        }

    }
}

