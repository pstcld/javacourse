package org.knit.lab1;

public class Task2 {
    public void execute() {
//        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        String urlValue = "https://github.com/anmi0217/knit241_template/blob/master/src/main/java/org/knit/lab1/Task2.java";

        SimpleUrl simpleUrl = new SimpleUrl();

        String[] protocolSplit = urlValue.split("://");
        simpleUrl.setProtocol(protocolSplit[0]);

        String[] addressSplit = protocolSplit[1].split("/", 2);
        String fullAddress = addressSplit[0];
        simpleUrl.setAddress(fullAddress);

        String[] domainParts = fullAddress.split("\\.");
        simpleUrl.setSiteName(domainParts[0]);
        simpleUrl.setDomainZone(domainParts[1]);

        String[] pathSplit = addressSplit[1].split("\\?", 2);
        String[] pathParts = pathSplit[0].split("/");
        String webpage = pathParts[pathParts.length - 1];
        simpleUrl.setWebPageName(webpage);

        String[] webpageParts = webpage.split("\\.");
        if (webpageParts.length > 1) {
            simpleUrl.setWebPageExtension(webpageParts[1]);
        }

        if (pathSplit.length > 1) {
            String[] Params = pathSplit[1].split("&");
            for (String param : Params) {
                String[] paramParts = param.split("=");
                if (paramParts.length == 2) {
                    simpleUrl.getParameters().put(paramParts[0], paramParts[1]);
                }
            }
        }

        System.out.println(simpleUrl);
    }
}

