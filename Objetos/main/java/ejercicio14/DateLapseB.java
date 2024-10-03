package ejercicio14;

import java.time.LocalDate;

public class DateLapseB {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseB(LocalDate f, int s) {
		this.from = f;
		this.sizeInDays = s;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		LocalDate to = this.from.plusDays(sizeInDays);
		return to;
	}

	public int sizeInDays() {
		return this.sizeInDays;
	}

	public boolean includesDate(LocalDate other) {
		LocalDate to = this.from.plusDays(sizeInDays);
		if(other.isAfter(from) && other.isBefore(to)) {
			return true;
		} else return false;
	}
	
}
