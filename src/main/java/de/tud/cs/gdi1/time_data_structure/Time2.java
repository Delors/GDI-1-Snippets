package de.tud.cs.gdi1.time_data_structure;

public class Time2 {
    final int hours;
    final int mins;
    final int secs;

    public Time2(int h, int m, int s) {
	this.hours = h;
	this.mins = m;
	this.secs = s;
    }

    public int getHours() {
	return this.hours;
    }

    public int getMins() {
	return this.mins;
    }

    public int getSecs() {
	return this.secs;
    }

    private int sumSecs(Time2 time) {
	return this.secs + time.getSecs();
    }

    private int sumMins(Time2 time) {
	return this.sumSecs(time) / 60 + this.mins + time.getMins();
    }

    private int sumHours(Time2 time) {
	return this.sumMins(time) / 60 + this.hours + time.getHours();
    }

    public Time2 add(Time2 time) {
	Time2 t = new Time2(this.sumHours(time), this.sumMins(time) % 60, this.sumSecs(time) % 60);
	return t;
    }

    public static void main(String[] args) {
	Time2 t1 = new Time2(1, 30, 30);
	Time2 t2 = new Time2(2, 30, 40);
	Time2 t3 = t1.add(t2);
	assert t3.getSecs() == 10; // ENABLE ASSERTIONS
	assert t3.getMins() == 1;
	assert t3.getHours() == 4;
    }
}
