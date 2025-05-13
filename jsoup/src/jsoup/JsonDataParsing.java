package jsoup;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonDataParsing {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = """
        {
          "google": [],
          "typekit": [],
          "custom": [
            {
              "id": 935666,
              "family": "Nunito-Sans-Klaviyo-Hosted",
              "fallback": "Arial, \\"Helvetica Neue\\", Helvetica, sans-serif",
              "font_type": "custom",
              "variants": [
                {
                  "id": 845420,
                  "variant_value": "i4",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Nunito-Sans/latin/nunito-sans_latin_italic_400.woff2"
                },
                {
                  "id": 845421,
                  "variant_value": "i7",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Nunito-Sans/latin/nunito-sans_latin_italic_700.woff2"
                },
                {
                  "id": 845422,
                  "variant_value": "n4",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Nunito-Sans/latin/nunito-sans_latin_regular_400.woff2"
                },
                {
                  "id": 845423,
                  "variant_value": "n7",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Nunito-Sans/latin/nunito-sans_latin_regular_700.woff2"
                }
              ]
            },
            {
              "id": 929584,
              "family": "Poppins-Klaviyo-Hosted",
              "fallback": "Arial, \\"Helvetica Neue\\", Helvetica, sans-serif",
              "font_type": "custom",
              "variants": [
                {
                  "id": 833798,
                  "variant_value": "i4",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Poppins/latin/poppins_latin_italic_400.woff2"
                },
                {
                  "id": 833799,
                  "variant_value": "i7",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Poppins/latin/poppins_latin_italic_700.woff2"
                },
                {
                  "id": 833800,
                  "variant_value": "n4",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Poppins/latin/poppins_latin_regular_400_2.woff2"
                },
                {
                  "id": 833801,
                  "variant_value": "n7",
                  "url": "https://static.klaviyo.com/onsite/hosted-fonts/Poppins/latin/poppins_latin_regular_700.woff2"
                }
              ]
            }
          ]
        }
        """;

        try {
            FontData fontData = mapper.readValue(json, FontData.class);

            for (CustomFont font : fontData.custom) {
            	System.out.println("Font Id: "+font.id);
                System.out.println("Font Family: " + font.family);
                System.out.println("Font fallback: "+font.fallback);
                for (Variant variant : font.variants) {
                    System.out.println("  Id: " + variant.id +"  Variant: " + variant.variant_value + " - URL: " + variant.url);
                }
            }

        } catch (IOException e) {
           System.out.println(e);
        }
    }
    public static class FontData {
        public List<Object> google;
        public List<Object> typekit;
        public List<CustomFont> custom;
    }

    public static class CustomFont {
        public int id;
        public String family;
        public String fallback;
        public String font_type;
        public List<Variant> variants;
    }

    public static class Variant {
        public int id;
        public String variant_value;
        public String url;
    }
}
