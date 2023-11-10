package teamfowler.testproject;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GetAllPhotosHandlerTest extends TestCase {

    public GetAllPhotosHandler sut;
    public Map<String, Object> map;

    @BeforeEach
    public void setSut(){
        sut = new GetAllPhotosHandler();
        map = new HashMap<>();
    }

    @Test
    public void testHandleRequest() {
        assertEquals(sut.handleRequest(map,null).get("message"),"Dit zou alle fotos halen moeten handlen");
    }
}