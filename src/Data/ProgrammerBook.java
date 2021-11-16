package Data;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level)
    {
        super(title, author, price, edition);
        this.level = level;
        this.language = language;
    }

    public String toString()
    {
        return  super.toString() + " " + language + " " + Integer.toString(level);
    }

    public boolean equals(ProgrammerBook programmerBook)
    {
        if (programmerBook == null)
            return false;
        if ((this.language == programmerBook.language) &&
                (this.level == programmerBook.level) &&
                (super.equals(programmerBook)))
            return true;
        return false;
    }

    public int hashCode()
    {
        return super.hashCode() + this.language.hashCode() + this.level;
    }
}
