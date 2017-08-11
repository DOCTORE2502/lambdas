
package personalExceptions;

import java.util.Date;

public class MyException extends Exception{
    private int code;
    private String description;
    private Date date;
    
    public MyException(int code, String desc,Date date, String msg) {
        super(msg);
        this.code = code;
        this.description = desc;
        this.date = date;
    }
    
    public MyException() {
    }

    public MyException(String string) {
        super(string);
    }

    public MyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MyException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MyException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
