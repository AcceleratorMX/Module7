package src.homeWork.h3;

class GooSearchResult {

    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String [] str = url.split("//");
        return str[1].split("/")[0];
    }
}


class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}