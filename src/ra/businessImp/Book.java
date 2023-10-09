package ra.businessImp;

import ra.business.IBook;

import static ra.run.BookManagement.sc;

public class Book implements IBook, Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
//        TODO: nhập thông tin sách từ bàn phím (trừ interest) (DONE)
//        TODO: thực hiện tính interest = exportPrice - importPrice (DONE)


//            add bookId
        System.out.print("Nhập vào mã sách: ");
        this.bookId = Integer.parseInt(sc.nextLine());

//            add bookName
        System.out.print("Nhập vào tên sách: ");
        this.bookName = sc.nextLine().trim();

//            add title
        System.out.print("Nhập vào tiêu đề sách: ");
        this.title = sc.nextLine().trim();

//            add numberOfPage
        System.out.print("Nhập vào số trang: ");
        this.numberOfPages = Integer.parseInt(sc.nextLine());

//            add importPrice
        System.out.print("Nhập vào giá nhập: ");
        this.importPrice = Float.parseFloat(sc.nextLine());

//            add exportPrice
        System.out.print("Nhập vào giá xuất: ");
        this.exportPrice = Float.parseFloat(sc.nextLine());

//            calculate interest
        this.interest = this.exportPrice - this.importPrice;

//            add bookStatus
        System.out.print("Nhập vào trạng thái sách [true/false]: ");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void displayData() {
//        TODO: hiển thị tất cả thông tin sách (DONE)
        System.out.printf("Mã sách: %d - Tên sách: %s - Tiêu đề: %s - Số trang: %d\n", this.bookId, this.bookName, this.title, this.numberOfPages);
        System.out.printf("Giá nhập: %.2f - Giá xuất: %.2f - Lợi nhuận: %.2f - Tình trạng: %b\n\n", this.importPrice, this.exportPrice, this.interest, this.bookStatus);
    }

//            Comparable interface implementation: override compareTo methods to use
    @Override
    public int compareTo(Book otherBook) {
        return -Float.compare(this.interest, otherBook.interest);
    }
}
