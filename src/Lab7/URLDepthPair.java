package Lab7;

import java.net.*;

/** Класс для хранения пар URL-адресов и значений глубины, а также для их возврата по запросу **/
public class URLDepthPair {

    private URL url;
    private int depth;

    public URLDepthPair(String URL, int depth){
        this.depth = depth;

        try {
            this.url = new URL(URL);
        }
        catch (MalformedURLException e) {
            this.url = null;
        }
    }

    /** Метод, возвращающий URL **/
    public String getURL(){
        return this.url.toString();
    }

    /** Метод, возвращающий глубину **/
    public int getDepth(){
        return this.depth;
    }
    /** Метод, возвращающий содержимое пары **/
    public String toString(){
        String depths = Integer.toString(this.depth);
        return depths + '\t' + this.url;
    }

    /** Метод, возвращающий Path **/
    public String getPath(){
       return this.url.getPath();
    }

    /** Метод, возвращающий Host **/
    public String getHost(){
        return this.url.getHost();
    }



}
