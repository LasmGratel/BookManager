/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml.lasmgratel.bookmanager;

import java.util.function.Predicate;

/**
 *
 * @author lasm_
 */
public class FindArrayList {
    public static boolean existsName(String bookName)
    {
        return Storage.bookList.stream().anyMatch(new Predicate<Book>() {

            @Override
            public boolean test(Book b) {
                return bookName.equals(b.getName());
            }
        });
    }
    public static Book getByName(String bookName)
    {
        for(Book b:Storage.bookList)
        {
            if(bookName.equals(b.getName())) return b;
        }
        return null;
    }
    public static int getByNameID(String bookName)
    {
        for(int i=0;i<Storage.bookList.size();i++)
        {
            if(bookName.equals(Storage.bookList.get(i).getName())) return i;
        }
        return -1;
    }
}
