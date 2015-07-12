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
package ml.lasmgratel.bookmanager;

import java.io.IOException;
import java.util.ArrayList;
import ml.lasmgratel.bookmanager.file.BookFile;

/**
 *
 * @author lasm_
 * This class store the data.
 */
public class Storage
{
    public static ArrayList<Book> bookList;
    /**
    * This function init the storage.
    * <p style="color:red">WARNING:PLEASE USE IT AFTER BookFile.init() RUNNED!</p>
     * @throws java.io.IOException
    * @see ml.lasmgratel.bookmanager.file.BookFile
    */
    public static void init() throws IOException
    {
        bookList=BookFile.getBooks();
    }
    /**
     * Write data to the file.
     * @see ml.lasmgratel.bookmanager.file.BookFile
     */
    public static void writeData()
    {
        BookFile.writeBooks(bookList);
    }
    /**
     * Read data from the file.
     * @throws java.io.IOException
     * @see ml.lasmgratel.bookmanager.file.BookFile
     */
    public static void refreshData() throws IOException
    {
        init();
    }
}
