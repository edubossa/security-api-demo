package com.fiap.security.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by wallace on 04/04/2018.
 */
@RestController
@CrossOrigin
@RequestMapping( value = "/api/v1/transactions")
public class PaymentController {

    @PostMapping
    public String postPayment(@RequestBody String message) {
        System.out.println(message);
        return "{\n" +
                "  \"transactionId\": \"92d50ba4-5d93-4ee5-90e8-9884b250310a\",\n" +
                "  \"referenceId\": \"1463697571584\",\n" +
                "  \"description\": \"TV LG 42\",\n" +
                "  \"amount\": \"250000\",\n" +
                "  \"status\": 5,\n" +
                "  \"dtTransaction\": \"2018-03-05T12:04:20\",\n" +
                "  \"customer\": {\n" +
                "    \"name\": \"Eduardo Wallace\",\n" +
                "    \"document\": \"12345678909\"\n" +
                "  },\n" +
                "  \"payment\": {\n" +
                "    \"card\": {\n" +
                "      \"type\": 1,\n" +
                "      \"softDescriptor\": \"Pagamento Gate2All\",\n" +
                "      \"interestType\": 3,\n" +
                "      \"installments\": 1,\n" +
                "      \"capture\": false,\n" +
                "      \"authenticate\": 3,\n" +
                "      \"saveCard\": false,\n" +
                "      \"recurrent\": false,\n" +
                "      \"provider\": \"CIELO\",\n" +
                "      \"providerVersion\": \"3.0\",\n" +
                "      \"authenticationECI\": 7,\n" +
                "      \"codAuthorization\": \"123456\",\n" +
                "      \"providerReference\": \"1006993069000834928A\",\n" +
                "      \"providerCode\": \"00\",\n" +
                "      \"providerMessage\": \"Transacao autorizada com sucesso\",\n" +
                "      \"cardInfo\": {\n" +
                "        \"number\": \"453970******0561\",\n" +
                "        \"expirationMonth\": \"04\",\n" +
                "        \"expirationYear\": \"2019\",\n" +
                "        \"cvv\": \"***\",\n" +
                "        \"brand\": \"VISA\",\n" +
                "        \"holderName\": \"Eduardo Wallace\"\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }


    @GetMapping
    public String getPeyments() {
        return "[\n" +
                "  {\n" +
                "    \"transactionId\": \"894aa0ad-517a-435c-b95d-8f60f1a2b9f5\",\n" +
                "    \"amount\": \"250000\",\n" +
                "    \"status\": 5,\n" +
                "    \"dtTransaction\": \"2018-02-16T07:37:23\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"transactionId\": \"5dbc102d-2b4b-4755-9f14-1b4c3d8a6716\",\n" +
                "    \"amount\": \"250000\",\n" +
                "    \"status\": 5,\n" +
                "    \"dtTransaction\": \"2018-02-16T07:37:00\"\n" +
                "  }\n" +
                "]";
    }


}
