package de.tud.cs.gdi1.time_data_structure;

public class Time1 {

    final int hours;
    final int mins;
    final int secs;

    public Time1(int h, int m, int s) {
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

    private int sumSecs(Time1 time) {
	return this.secs + time.getSecs();
    }

    private int sumMins(Time1 time) {
	return this.sumSecs(time) / 60 + this.mins + time.getMins();
    }

    private int sumHours(Time1 time) {
	return this.sumMins(time) / 60 + this.hours + time.getHours();
    }

    public Time1 add(Time1 time) {
	Time1 t = new Time1(this.sumHours(time), this.sumMins(time) % 60, this.sumSecs(time) % 60);
	return t;
    }

}
