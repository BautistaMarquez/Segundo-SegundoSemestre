package ar.edu.unlp.info.oo1.ejercicio10;

public class JobSchedulerFIFO extends JobScheduler {
	
	public JobSchedulerFIFO() {
		super();
	}
	
	public JobDescription next() {
		
		JobDescription nextJob = null;
		nextJob = jobs.get(0);
		this.unschedule(nextJob);
		return nextJob;
	}
	
}
