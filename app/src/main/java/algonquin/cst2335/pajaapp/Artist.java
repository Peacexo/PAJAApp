package algonquin.cst2335.pajaapp;
public class Artist {

    private String name, poster;
    public Artist(String name, String poster){
        this.name = name;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
