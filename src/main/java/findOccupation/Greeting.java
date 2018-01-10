package findOccupation;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

    private String id;
    private String content;

    public Greeting() {
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Greeting{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' + 
                '}';
    }    
}