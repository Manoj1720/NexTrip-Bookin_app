package busreserv;

public class Bus {

	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getcapacity() {
		return capacity;
	}
	public void setcapacity(int cap) {
		capacity=cap;
	}
	public boolean isAC() {
		return ac;
	}
	public void setAC(boolean val) {
		ac=val;
	}
	public int getbusNo() {
		return busNo;
	}
	
	
	
}
