package ar.edu.unlp.info.oo1.ejercicio10;

public class jobSchedulerME extends JobScheduler {
	
	public jobSchedulerME() {
		super();
	}
	
	public JobDescription next() {
		
		JobDescription nextJob = null;
		nextJob = jobs.stream()
            .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
            .orElse(null);
        this.unschedule(nextJob);
        return nextJob;
	}
}
