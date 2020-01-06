import java.net.MalformedURLException;
import java.net.URL;

class BasicUrlTest{
    void good(String s1, String s2)
            throws MalformedURLException {
        URL url = new URL(s1 + s2);
    }

    void bad(String s1, String s2)
            throws MalformedURLException {
        URL url = new URL(s2 + s1);
    }

    void bad2(String s2, String s3) throws MalformedURLException{
        URL url = new URL(s2 + s3);
    }

    void good2(String s1, String s2){
        String s3 = s1 + s2;
    }
}

class test{
    public static void main(String[] args) throws MalformedURLException{
        BasicUrlTest obj = new BasicUrlTest();
        obj.good("https://", "good.com");
    }
}
