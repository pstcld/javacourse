package org.knit.lab1;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleUrl {
        private String protocol;
        private String address;
        private String domainZone;
        private String siteName;
        private String webPageName;
        private String webPageExtension;
        private Map<String, String> Parameters = new LinkedHashMap<>();

        public String getProtocol() {
                return protocol;
        }

        public void setProtocol(String protocol) {
                this.protocol = protocol;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getDomainZone() {
                return domainZone;
        }

        public void setDomainZone(String domainZone) {
                this.domainZone = domainZone;
        }

        public String getSiteName() {
                return siteName;
        }

        public void setSiteName(String siteName) {
                this.siteName = siteName;
        }

        public String getWebPageName() {
                return webPageName;
        }

        public void setWebPageName(String webPageName) {
                this.webPageName = webPageName;
        }

        public String getWebPageExtension() {
                return webPageExtension;
        }

        public void setWebPageExtension(String webPageExtension) {
                this.webPageExtension = webPageExtension;
        }

        public Map<String, String> getParameters() {
                return Parameters;
        }

        public void setParameters(Map<String, String> parameters) {
                this.Parameters = parameters;
        }

        @Override
        public String toString() {
                String result = "SimpleUrl {" + '\n' +
                        "protocol='" + protocol + '\'' + '\n' +
                        "address='" + address + '\'' + '\n' +
                        "domainZone='" + domainZone + '\'' + '\n' +
                        "siteName='" + siteName + '\'' + '\n' +
                        "webPageName='" + webPageName + '\'' + '\n';

                if(webPageExtension != null) {
                        result += "webPageExtension='" + webPageExtension + '\'' + '\n';
                }

                if (Parameters != null && !Parameters.isEmpty()) {
                        StringBuilder queryParameters = new StringBuilder();
                        for(Map.Entry<String, String> entry: Parameters.entrySet()) {
                                queryParameters.append(entry.getKey()).append("= \'").append(entry.getValue()).append("\'\n");
                        }
                        result += "Parameters:" + '\n' + queryParameters.toString() + '\n' + '}';
                }
                else{
                        result += '}';
                }
                return result;
        }
}
