public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(double price, String language) {
        super(price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
