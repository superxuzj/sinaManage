package weibo4j.model;

import java.util.List;

public class StatusWapper {

	private List<Status> statuses;

	private long previousCursor;

	private long nextCursor;

	private long totalNumber;
	
	private long totalNumberReal;
	
	private String hasvisible;

	public StatusWapper(List<Status> statuses, long previousCursor,
			long nextCursor, long totalNumber,String hasvisible,long totalNumberReal) {
		this.statuses = statuses;
		this.previousCursor = previousCursor;
		this.nextCursor = nextCursor;
		this.totalNumber = totalNumber;
		this.hasvisible = hasvisible;
		this.totalNumberReal = totalNumberReal;
	}

	public List<Status> getStatuses() {
		return statuses;
	}

	public long getTotalNumberReal() {
		return totalNumberReal;
	}

	public void setTotalNumberReal(long totalNumberReal) {
		this.totalNumberReal = totalNumberReal;
	}
	
	public void setStatuses(List<Status> statuses) {
		this.statuses = statuses;
	}

	public long getPreviousCursor() {
		return previousCursor;
	}

	public void setPreviousCursor(long previousCursor) {
		this.previousCursor = previousCursor;
	}

	public long getNextCursor() {
		return nextCursor;
	}

	public void setNextCursor(long nextCursor) {
		this.nextCursor = nextCursor;
	}

	public long getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(long totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getHasvisible() {
		return hasvisible;
	}

	public void setHasvisible(String hasvisible) {
		this.hasvisible = hasvisible;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "StatusWapper [statuses=[";
		for (Status s : statuses) {
			str += s.toString() + " ";
		}
		str += "], ";
		str += "previousCursor=" + previousCursor + ", ";
		str += "nextCursor=" + nextCursor + ", ";
		str += "totalNumber=" + totalNumber + ", ";
		str += "totalNumberReal=" + totalNumberReal + ", ";
		str += "hasvisible=" + hasvisible + "]";
		return str;
	}

}
