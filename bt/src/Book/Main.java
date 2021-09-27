public class Main {
    public static void main(String[] args) {
        Book[] bookList = new Book[10];
        bookList[0] = new ProgrammingBook(30000,"java");
        bookList[1] = new ProgrammingBook(20000, "c++");
        bookList[2] = new FictionBook(35000);
        bookList[3] = new FictionBook(60000);
        bookList[4] = new ProgrammingBook(3000, "php");
        bookList[5] = new FictionBook(2000);
        bookList[6] = new ProgrammingBook(45000, "java");
        bookList[7] = new ProgrammingBook(3500, "java");
        bookList[8] = new FictionBook(7000);
        bookList[9] = new FictionBook(8000);

        double sum = 0;
        int count = 0;
        for (int i = 0; i < bookList.length; i++) {
            sum += bookList[i].getPrice();
            if (bookList[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) bookList[i]).getLanguage() == "java") {
                    count++;
                }
            }
        }
        System.out.println("Tổng tiền 10 cuốn sách: " + sum);
        System.out.println("Số sách có language là java = " + count);
    }
}
