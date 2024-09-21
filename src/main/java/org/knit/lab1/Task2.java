package org.knit.lab1;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public void execute() {

        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";
        String protocol = urlValue.split("\\\\?")[0].split("://")[0];
        String address = urlValue.split("\\\\?")[0].split("://")[1].split("/")[0];
        String webpageName = urlValue.split("\\\\?")[0].split("://")[1].split("/")[];
        String[] parameters = urlValue.split("\\\\?")[1].split("&");


        //todo create class SimpleUrl()
        // SimpleUrl url= new SimpleUrl();
        // url.setAddress(address);
        // url.setProtocol(protocol)
        // System.out.println(url);
    }
}
