public class Document {
	private String name;
	
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + this.name + " is created");
	}
	
	public void load() {
		System.out.println("Document " + this.name + " is loaded into view");
	}
	
	public void spell() {
		System.out.println("Document " + this.name + " is loaded into view");
	}
	
	public void save() {
		
	}
	
	public void print() {
		
	}
}
