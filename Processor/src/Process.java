import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


public class Process {
	public static void main(String[] args) {
		System.out.println("Reading File from Java code");
		// Name of the file
		String fileNameAggregate = "C:/Users/SEBASTIAN/Documents/UNIANDES/apache-jmeter-2.12/aggregate.csv";
		String fileNameLatency = "C:/Users/SEBASTIAN/Documents/UNIANDES/apache-jmeter-2.12/latency.csv";
		String fileNameResponse = "C:/Users/SEBASTIAN/Documents/UNIANDES/apache-jmeter-2.12/responses_code_per_second.csv";
		Writer writer = null;

		try {
			// File to write new lines
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("C:/Users/SEBASTIAN/Documents/UNIANDES/runtime-Grammars/Gramaticas/src/postProcess.jlog"),"utf-8"));

			// Create object of FileReader
			FileReader inputFileAggregate = new FileReader(fileNameAggregate);
			BufferedReader bufferReaderAggregate = new BufferedReader(inputFileAggregate);
			
			String line;
			List<String[]> aggregateLines = new ArrayList<String[]>();
			List<Aggregate> stimuli = new ArrayList<Aggregate>();

			writer.write("Jlog{\n");
			
			while ((line = bufferReaderAggregate.readLine()) != null) {
				if (!line.startsWith("sampler_label") && !line.startsWith("Total") && line != null && !line.isEmpty()) {
					aggregateLines.add(line.split(","));
				} 
			}
			
			for(String[] agg : aggregateLines){
				FileReader inputFileLatency = new FileReader(fileNameLatency);
				BufferedReader bufferReaderLatency = new BufferedReader(inputFileLatency);
				
				FileReader inputFileResponse = new FileReader(fileNameResponse);
				BufferedReader bufferReaderResponse = new BufferedReader(inputFileResponse);

				Aggregate aggregate = new Aggregate();
				aggregate.setStimulusName(agg[0]);
				aggregate.setThreadNumber(Integer.parseInt(agg[1]));
				aggregate.setMedResponseTime(Integer.parseInt(agg[2]));
				aggregate.setMaxResponseTime(Integer.parseInt(agg[6]));
				aggregate.setMinResponseTime(Integer.parseInt(agg[5]));
				aggregate.setErrorPercentage(Double.parseDouble(agg[7]));
				aggregate.setThroughput(Double.parseDouble(agg[8]));
				
				while ((line = bufferReaderLatency.readLine()) != null) {
					if(line.split(",")[2].equals(aggregate.getStimulusName()) && line != null && !line.isEmpty()){
						aggregate.getLatencies().put(line.split(",")[0], Long.parseLong(line.split(",")[11]));
					}
				}
				
				while ((line = bufferReaderResponse.readLine()) != null) {
					if(line.split(",")[2].equals(aggregate.getStimulusName()) && line != null && !line.isEmpty()){
						aggregate.getResponses().put(line.split(",")[0], line.split(",")[3].matches("^(0|[1-9][0-9]*)$") ? Long.parseLong(line.split(",")[3]) : new Long(0));
					}
				}
				
				stimuli.add(aggregate);
				bufferReaderLatency.close();
				bufferReaderResponse.close();
			}
			
			for(Aggregate stm : stimuli){
				writer.write(stm.toStringArqEstimulo());
			}
			
			writer.write("}");
			
			bufferReaderAggregate.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:"
					+ e.getMessage());
		}

	}
}
