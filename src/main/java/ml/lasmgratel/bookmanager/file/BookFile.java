/*
 * Copyright (C) 2015 Lasm Gratel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ml.lasmgratel.bookmanager.file;
import java.util.Properties;
import ml.lasmgratel.bookmanager.Book;
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author lasm_
 */
public class BookFile
{

    /**
     * The properties of bookfile.
     */
    public static Properties bookfile;

    /**
     * init bookfile
     */
    public static void init()
    {
        if(new File("data.properties").exists()){
        try {
            bookfile.load(FileUtils.openInputStream(new File("data.properties")));
        } catch (IOException ex) {
            Logger.getLogger(BookFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            try {
                new File("data.properties").createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(BookFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * Get book from properties file.
     * @return Book List
     */
    public static ArrayList<Book> getBooks()
    {
        ArrayList<Book> booklist=Lists.newArrayList();
        for(int i=0;i<Integer.parseInt(bookfile.getProperty("amount"));i++)
        {
            Book b=new Book();
            b.setId(Long.parseLong(bookfile.getProperty("book"+String.valueOf(i)+"_id")));
            b.setPage(Long.parseLong(bookfile.getProperty("book"+String.valueOf(i)+"_page")));
            b.setPrice(Integer.parseInt(bookfile.getProperty("book"+String.valueOf(i)+"_price")));
            b.setAlready_read(Long.parseLong(bookfile.getProperty("book"+String.valueOf(i)+"_already_read")));
            b.setArthur_name(bookfile.getProperty("book"+String.valueOf(i)+"_arthur"));
            b.setName(bookfile.getProperty("book"+String.valueOf(i)+"_name"));
            b.setPublish_date(Date.valueOf(bookfile.getProperty("book"+String.valueOf(i)+"_publish_date")));
            b.setPublisher(bookfile.getProperty("book"+String.valueOf(i)+"_publisher"));
            booklist.add(b);
        }
        return booklist;
    }
    /**
     * Write books to properties file.
     * @param booklist 
     */
    public static void writeBooks(ArrayList<Book> booklist)
    {
        File f=new File("data.properties");
        f.delete();
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(BookFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<booklist.size();i++)
        {
            bookfile.setProperty("book"+String.valueOf(i)+"_id",String.valueOf(booklist.get(i).getId()));
            bookfile.setProperty("book"+String.valueOf(i)+"_page",String.valueOf(booklist.get(i).getPage()));
            bookfile.setProperty("book"+String.valueOf(i)+"_price",String.valueOf(booklist.get(i).getPrice()));
            bookfile.setProperty("book"+String.valueOf(i)+"_already_read",String.valueOf(booklist.get(i).getAlready_read()));
            bookfile.setProperty("book"+String.valueOf(i)+"_arthur",String.valueOf(booklist.get(i).getArthur_name()));
            bookfile.setProperty("book"+String.valueOf(i)+"_name",String.valueOf(booklist.get(i).getName()));
            bookfile.setProperty("book"+String.valueOf(i)+"_publish_date",String.valueOf(booklist.get(i).getPublish_date()));
            bookfile.setProperty("book"+String.valueOf(i)+"_publisher",String.valueOf(booklist.get(i).getPublisher()));
        }
    }
}
