package de.tud.cs.gdi1.time_data_structure;

public class Time3 {
    final int hours, mins, secs;

    public Time3(int h, int m, int s) {
	this.hours = h;
	this.mins = m;
	this.secs = s;
    }
    public int getHours() { return this.hours; }
    public int getMins() { return this.mins; }
    public int getSecs() { return this.secs; }
    
    private int sumSecs(Time3 time) {
	return this.secs + time.getSecs();
    }
    private int sumMins(Time3 time) {
	return 	this.sumSecs(time) / 60 + 
		this.mins + time.getMins();
    }
    private int sumHours(Time3 time) {
	return 	this.sumMins(time) / 60 + 
		this.hours + time.getHours();
    }
    public Time3 add(Time3 time) {
	Time3 t = new Time3(
		this.sumHours(time), 
		this.sumMins(time) % 60, 
		this.sumSecs(time) % 60);
	return t;
    }
    
    public String toString() {
	return hours + ":" + mins + ":" + secs;
    }
    
    public static void main(String[] args) {
	Time3 t1 = new Time3(1, 30, 30);
	Time3 t2 = new Time3(2, 30, 40);
	Time3 t3 = t1.add(t2);
	// ENABLE ASSERTIONS WITH "-ea" 
	assert t3.getSecs() == 10;
	assert t3.getMins() == 1;
	assert t3.getHours() == 4;
	// Recall, "==" DOES NOT WORK
	// assert t3.toString() == "4:1:10"; 
	assert t3.toString().equals("4:1:10");	
}   }