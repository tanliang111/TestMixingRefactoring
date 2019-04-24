package Package6;


public class Class38 {
	
	private String name;
	private Integer age;
	
	public Student (String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public static void main(String[] args) {
		Bro bro = new Bro(11);
		System.out.println(bro.getAge());
	}

}
