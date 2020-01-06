import java.io.IOException;
import org.apache.http.client.fluent.*;
import org.apache.http.entity.ContentType;


public class PumchmNlpMedparse
{
  public static void main(String[] args) {
    PumchmNlpMedparse();
  }

  private static void parse_str_mr(String server_url,String input_content ) {

    // parse_str_mr (POST )

    try {

      // Create request
      Content content = Request.Post(String.format("http://%s/v1/medicalrecord/pumch_medparse/",server_url))

      // Add headers

      .addHeader("Content-Type", "application/json; charset=utf-8")

      // Add body
      .bodyString(String.format("{\"action\": \"parse_str_mr\",\"input_content\": \"%s\"}",input_content), ContentType.APPLICATION_JSON)

      // Fetch request and return content
      //  处理返回病历

      return content

      // Print content

    }
    catch (IOException e) { System.out.println(e); }
  }
}

