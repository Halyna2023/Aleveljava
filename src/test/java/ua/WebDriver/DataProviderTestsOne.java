package ua.WebDriver;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataProviderTestsOne {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/emojis"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();
        boolean containsKey = responseBody.contains("\"articulated_lorry\"");

        if (containsKey) {
            System.out.println("The response contains the key 'articulated_lorry'. Test passed.");
        } else {
            System.out.println("The response does not contain the key 'articulated_lorry'. Test failed.");
        }
    }
}
