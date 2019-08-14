package cs106.w2.s1;

public class Hunter {
		private String name;
		private int age;
		private Wolf[] wolves;
		
		public Hunter() {
			System.out.println("I am " + name + "and I am " + age + "years old!" );
		}
		public Hunter(String name, int age) {
			this();//call default constructor, optional
			this.name = name;
			this.age = age;
		}
		public Hunter(String name, int age, Wolf[] wolves) {
			this.name = name;
			this.age = age;
			this.wolves = wolves;
		}
		
		public Wolf[] getWolves() {
			return wolves;
		}
		public void setWolves(Wolf[] wolves) {
			this.wolves = wolves;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
}
