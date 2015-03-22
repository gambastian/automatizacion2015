import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class Aggregate {
	private String stimulusName;
	private Integer minResponseTime;
	private Integer medResponseTime;
	private Integer maxResponseTime;
	private Double errorPercentage;
	private Double throughput;
	private Integer threadNumber;
	private Map<String, Long> latencies;
	private Map<String, Long> responses;
	
	public Aggregate() {
	}
	
	public String getStimulusName() {
		return stimulusName;
	}
	public void setStimulusName(String stimuliName) {
		this.stimulusName = stimuliName;
	}
	public Integer getMinResponseTime() {
		return minResponseTime;
	}
	public void setMinResponseTime(Integer minResponseTime) {
		this.minResponseTime = minResponseTime;
	}
	public Integer getMedResponseTime() {
		return medResponseTime;
	}
	public void setMedResponseTime(Integer medResponseTime) {
		this.medResponseTime = medResponseTime;
	}
	public Integer getMaxResponseTime() {
		return maxResponseTime;
	}
	public void setMaxResponseTime(Integer maxResponseTime) {
		this.maxResponseTime = maxResponseTime;
	}
	public Double getErrorPercentage() {
		return errorPercentage;
	}
	public void setErrorPercentage(Double errorPercentage) {
		this.errorPercentage = errorPercentage;
	}
	public Double getThroughput() {
		return throughput;
	}
	public void setThroughput(Double throughput) {
		this.throughput = throughput;
	}
	public Integer getThreadNumber() {
		return threadNumber;
	}
	public void setThreadNumber(Integer threadNumber) {
		this.threadNumber = threadNumber;
	}
	public Map<String, Long> getLatencies() {
		if(latencies == null){
			latencies = new HashMap<String, Long>();
		}
		return latencies;
	}
	public void setLatencies(Map<String, Long> latencies) {
		this.latencies = latencies;
	}
	public Map<String, Long> getResponses() {
		if(responses == null){
			responses =  new HashMap<String, Long>();
		}
		return responses;
	}
	public void setResponses(Map<String, Long> responses) {
		this.responses = responses;
	}
	
	public String toStringArqEstimulo() {
		StringBuilder stb = new StringBuilder();
		
		stb.append("ArqStimulus{");
		stb.append("stimulusName \"" + stimulusName + "\",");
		stb.append("minResponseTime " + minResponseTime + ",");
		stb.append("medResponseTime " + medResponseTime + ",");
		stb.append("maxResponseTime " + maxResponseTime + ",");
		stb.append("errorPercentage " + errorPercentage + ",");
		stb.append("throughput " + throughput + ",");
		stb.append("threadNumber " + threadNumber + ",");
		stb.append("latencies{");
		int count = 0;
		if(latencies != null){
			for(String i : latencies.keySet()){
				if(count == 0){
					stb.append("\"" + i + "\"" + ":" + latencies.get(i));
				}else{
					stb.append("|" + "\"" + i + "\"" + ":" + latencies.get(i));
				}
				count++;
			}
		}
		stb.append("}");
		stb.append(",");
		stb.append("responses{");
		count = 0;
		if(responses != null){
			for(String i : responses.keySet()){
				if(count == 0){
					stb.append("\"" + i + "\"" + ":" + responses.get(i));
				}else{
					stb.append("|" + "\"" + i + "\"" + ":" + responses.get(i));
				}
				count++;
			}
		}
		stb.append("}");
		stb.append("}");
		
		return stb.toString();
	}
}
