package org.knit.lab1;

public class SimpleUrl {
        String protocol;
        String address;
        String domainZone;
        String siteName;
        String webpage;
        String webpageName;
        String webPageExtention;
        String parameters;
        int intParam;
        double doubleParam;
        String textParameter;

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

        public String getWebpage() {
                return webpage;
        }

        public void setWebpage(String webpage) {
                this.webpage = webpage;
        }

        @Override
        public String toString() {
                return "SimpleUrl{" +
                        "protocol='" + protocol + '\'' +
                        "address='" + address + '\'' +
                        "domainZone='" + domainZone + '\'' +
                        "siteName='" + siteName + '\'' +
                        "webpage='" + webpage + '\'' +
                        "webpageName='" + webpageName + '\'' +
                        "webPageExtention='" + webPageExtention + '\'' +
                        "parameters='" + parameters + '\'' +
                        "intParam=" + intParam +
                        "doubleParam=" + doubleParam +
                        "textParameter='" + textParameter + '\'' +
                        '}';
        }
}
