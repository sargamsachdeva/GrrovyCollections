package com.demo.groovy

class Ques23 {

    static void main(String[] args) {

        println getQueryParams("http://www.google.com?name=johny&age=20&hobby=cricket").get("name");
    }

     static Map<String, String> getQueryParams(String url) {

        try {

            Map<String, String> params = new HashMap<String, String>();
            String[] urlParts = url.split("\\?");

            if (urlParts.length > 1) {
                String query = urlParts[1];

                for (String param : query.split("&")) {
                    String[] pair = param.split("=");

                    String key = pair[0];
                    String value = pair[1];


                        params.put(key, value);
                    }


            }

            return params;
        } catch (UnsupportedEncodingException ex) {
            throw new AssertionError(ex);
        }
    }
}