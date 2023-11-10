package teamfowler.testproject;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class getPhotoByIdHandlerTest extends TestCase {

    public getPhotoByIdHandler sut;

    @BeforeEach
    public void setSut(){
        sut = new getPhotoByIdHandler();
    }

    @Test
    public void testGetPhotoByIdHandler() {
        assertEquals(sut.handleRequest(null,null),"Dit zou alle fotos halen moeten handlen");
    }
}