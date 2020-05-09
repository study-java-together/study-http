package sjt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sjt.client.TcHttpClient;
import sjt.parser.ResponseToObjectParser;

public class WebTemplateTest {
    private static WebTemplate webTemplate;

    @BeforeAll
    static void setUp() {
        webTemplate = new RestTemplate(new TcHttpClient(), new ResponseToObjectParser());
    }

    @DisplayName("GET 테스트")
    @Test
    void getTest() {
    }

    @DisplayName("POST 테스트")
    @Test
    void postTest() {
    }
}