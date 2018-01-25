import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConcreteBuilderA implements Builder{
	String path;
	Element doc;
    
	
	ConcreteBuilderA (String path) {
		this.path=path;
		
	}
	
	
	
	@Override
	public void buildPart() {
		try{
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String,Object> map = mapper.readValue(new File(this.path), HashMap.class);
		doc=buildDoc(map);
	
	} catch (JsonGenerationException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	/*private Element buildDoc(HashMap<String, Object> map) {
		if(map.get("class") == "sectiune") {
			buildSectiune(map);
		}else {
		}
	}*/
	private Element buildDoc(HashMap<String, Object> map) {
		
		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jp = null;
		try {
			jp = jsonFactory.createJsonParser(new File(this.path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jp.setCodec(new ObjectMapper());
		JsonNode jsonNode = null;
		try {
			jsonNode = jp.readValueAsTree();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<Map.Entry<String, JsonNode>> ite = jsonNode.fields();
		while(ite.hasNext()){
			Map.Entry<String, JsonNode> entry = ite.next();
		if(entry.getValue().isObject()) {
			entry.getValue();
			} else {
				if(!entry.getValue().toString().toLowerCase().contains("children")) {
			    System.out.println("type:"+entry.getKey()+", value:"+entry.getValue());
				}
				else {
					
				    System.out.println("Else part type:"+entry.getKey()+", value:"+entry.getValue());
				}
			
				
			
	}
}
	
		return null;
}



	@Override
	public Element getResult() {
		// TODO Auto-generated method stub
		return doc;
	}

}
//ArrayList<String> children =  (ArrayList<String>) map.get("children");
//System.out.println(child);
/*Object dataset = map.get("children");
String bigdata = dataset.toString();
if(bigdata.contains("title")) {
String [] title1 = bigdata.split("title=");
for(int i=0;i<title1.length;i++) {
	System.out.println("*");
	String split2 = title1[i];
	if(split2.contains("class")) {
		String [] title2 = split2.split("class=");
		for(int j=0;j<title2.length;j++) {
			System.out.println("+*");
			System.out.println(title2[j]);
		}
	}*/