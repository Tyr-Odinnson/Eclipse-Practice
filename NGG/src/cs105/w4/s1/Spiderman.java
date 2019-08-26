package cs105.w4.s1;

public class Spiderman implements Human, Spider {

	@Override
	public void bite() {
		System.out.println("Im a spider and im bitting");

	}

	@Override
	public void eat() {
		System.out.println("Im a human and eating ");

	}

}
