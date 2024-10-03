package ar.edu.unlp.info.oo1.ejercicio10;

public class jobSchedulerLIFO extends JobScheduler {

	public jobSchedulerLIFO() {
		super();
	}
	
	public JobDescription next() {
		
		JobDescription nextJob = null;
		nextJob = jobs.get(jobs.size()-1);
		this.unschedule(nextJob);
		return nextJob;
	}
}
