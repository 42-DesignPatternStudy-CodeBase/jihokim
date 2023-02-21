package h_TemplateMethodPattern;

public abstract class Car {

	protected void startCar() {
		System.out.println("시동을 켭니다.");
	}

	protected void drive() {
		System.out.println("사람이 운전합니다.");
	}

	protected void turn() {
        System.out.println("사람이 핸들을 조작합니다.");
	}

	protected void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
	}

	protected void turnOff() {
		System.out.println("시동을 끕니다.");
	}

    public final void run() {
        startCar();
        drive();
		turn();
        stop();
        turnOff();
    }

}
