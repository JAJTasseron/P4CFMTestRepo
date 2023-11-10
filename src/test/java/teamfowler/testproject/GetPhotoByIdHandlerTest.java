package teamfowler.testproject;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GetPhotoByIdHandlerTest extends TestCase {

    public GetPhotoByIdHandler sut;
    public Map<String, Object> map;

    @BeforeEach
    public void setSut(){
        sut = new GetPhotoByIdHandler();
        map = new HashMap<>();
    }

    @Test
    public void testHandleRequest() {
        assertEquals(sut.handleRequest(map,null).get("message"),"Dit zou een foto per id moeten handlen");
    }
}