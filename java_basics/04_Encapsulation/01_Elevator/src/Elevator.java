public class Elevator {

    public int currentFloor = 1;
    public int minFloor = 0;
    public int maxFloor = 0;

    public void Elevator(int minFloor, int maxFloor) {
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

        if (floor > maxFloor || floor < minFloor) {

            System.out.println("Неверный этаж");
        } else if (floor < currentFloor) {
            moveDown();
        } else {
            moveUp();
        }
    }

}
