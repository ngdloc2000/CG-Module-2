public class FictionBook extends Book{
    private String category;

    public FictionBook(double price) {
        super(price);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
