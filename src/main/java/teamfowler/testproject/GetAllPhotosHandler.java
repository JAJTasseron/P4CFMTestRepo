package teamfowler.testproject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class GetAllPhotosHandler implements RequestHandler<Map<String, Object>,Map<String, String>> {

    @Override
    public Map<String, String> handleRequest(Map<String, Object> input, Context context) {
        return Map.of("message","Dit zou alle fotos halen moeten handlen");
    }
}
