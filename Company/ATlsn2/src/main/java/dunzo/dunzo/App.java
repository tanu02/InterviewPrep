package dunzo.dunzo;

import org.apache.log4j.BasicConfigurator;

public class App {
	public static void main(String[] args) {}

}


PUT 
public ResponseEntitty<> updateTag(String tag, String newTag) {
}

GET
public ResponseEntitty<List<Document>> getTag(String start, String offset, String tag) {
	//configuration based
}


GET
public ResponseEntitty<List<Document>> getTagOnDocument(String tag) {
}


DELETE
public ResponseEntitty<> deleteTag(String resourceId, List<String> tag) {
	
}

POST
Putmapping()   
public ResponseEntitty<> tagDocument(String resourceId, String tag) {
	
}

----


class Tag{
	String tag; 
	String tagId; 
}

class Document{
	String data; 
	String tagId; 
	String resourceId; 
	Date createdDate;
	Date updatedDate;
}



