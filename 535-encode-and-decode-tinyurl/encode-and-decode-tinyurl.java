public class Codec {

    String shortUrl;
    String longUrl;
    String lastChar;

    public Codec(){
        this.shortUrl = "";
        this.longUrl = "";
        this.lastChar = "a";
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int length = longUrl.length();
        this.longUrl = longUrl;
        this.shortUrl = longUrl.substring(0,length-1);
        this.lastChar = longUrl.substring(length-1,length);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        this.shortUrl = shortUrl;
        this.longUrl = shortUrl + lastChar;
        return longUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));