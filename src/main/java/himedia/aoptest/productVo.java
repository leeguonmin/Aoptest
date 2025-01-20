package himedia.aoptest;

public class productVo {
	private String name;

	
	
	
	public productVo(String name) {
		super();
		this.name = name;
	}

	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	@Override
	public String toString() {
		return "productVo [name=" + name + "]";
	}
	

}
