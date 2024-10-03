package ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseA implements DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapseA(LocalDate f, LocalDate t) {
		this.from = f;
		this.to = t;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		int dias = (int) from.until(to, ChronoUnit.DAYS);
		return dias;
	}

	public boolean includesDate(LocalDate other) {
		if(other.isAfter(from) && other.isBefore(to)) {
			return true;
		} else return false;
	}
}
