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

import java.util.Date;

/**
 *
 * @author Lasm Gratel
 */
public class Book {
    /* ID for books */
    private long id;
    /* The book's price */
    private int price;
    /* The book's arthur */
    private String arthur_name;
    /* The book's publisher */
    private String publisher;
    /* The book's publish time */
    private Date publish_date;
    /* The book's page */
    private long page;
    /* Pages you have already read */
    private long already_read;
    /* The book's name */
    private String name;
    public Book(){}
    public Book(long id,String name,int price,String arthur_name,String publisher,Date publish_date,long page,long already_read)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.arthur_name=arthur_name;
        this.publisher=publisher;
        this.publish_date=publish_date;
        this.page=page;
        this.already_read=already_read;
    }
    /**
     * ID for books
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * ID for books
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * The book's price
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * The book's price
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * The book's arthur
     * @return the arthur_name
     */
    public String getArthur_name() {
        return arthur_name;
    }

    /**
     * The book's arthur
     * @param arthur_name the arthur_name to set
     */
    public void setArthur_name(String arthur_name) {
        this.arthur_name = arthur_name;
    }

    /**
     * The book's publisher
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * The book's publisher
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * The book's publish time
     * @return the publish_date
     */
    public Date getPublish_date() {
        return publish_date;
    }

    /**
     * The book's publish time
     * @param publish_date the publish_date to set
     */
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    /**
     * The book's page
     * @return the page
     */
    public long getPage() {
        return page;
    }

    /**
     * The book's page
     * @param page the page to set
     */
    public void setPage(long page) {
        this.page = page;
    }

    /**
     * Pages you have already read
     * @return the already_read
     */
    public long getAlready_read() {
        return already_read;
    }

    /**
     * Pages you have already read
     * @param already_read the already_read to set
     */
    public void setAlready_read(long already_read) {
        this.already_read = already_read;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
