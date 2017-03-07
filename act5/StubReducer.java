package act5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class StubReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {

	HashMap<String, Double> hmap = new HashMap<String, Double>();

  @Override
  public void reduce(Text key, Iterable<DoubleWritable> values, Context context)
      throws IOException, InterruptedException {

	  double salesTotal=0;
	  for(DoubleWritable value : values){
		   salesTotal+=value.get();
	   }
	  //Mémoriser Consumer Electronics et Toys
	   if((key.toString()).equals("CONSUMER ELECTRONICS")||key.toString().equals("TOYS"))
		   hmap.put(key.toString(), salesTotal);
	   context.write(key, new DoubleWritable(salesTotal));
  }
  
  protected void cleanup(Context context) throws IOException, InterruptedException {
	  //Les 2 dernières lignes de l'output correspondent aux valeurs de Consumer Electronics et Toys 
	  for (Entry<String, Double> entry : hmap.entrySet())
	  {
		  context.write(new Text(entry.getKey()), new DoubleWritable(entry.getValue()));
	  }
  }
}