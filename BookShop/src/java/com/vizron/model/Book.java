/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vizron.model;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author ritesh
 */
@Entity
@Table(name="BOOKS")
public class Book implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name="BOOKNO")
    private Integer bookNo;
    @Column(name="BOOKNAME")
    @NotEmpty(message="Book name is mandatory")
    private String bookName;
    @Column(name="AUTHOR1NO")
    @NotNull(message="Author name is mandatory")
    private Integer author1No;
    @Column(name="AUTHOR2NO")
    private Integer author2No;
    @Column(name="AUTHOR3NO")
    private Integer author3No;
    @Column(name="AUTHOR4NO")
    private Integer author4No;
    @Column(name="PUBLISHERNO")
    @NotNull(message="Publisher name is mandatory")
    private Integer publisherNo;
    @Column(name="CATEGORYNO")
    @NotNull(message="Category is mandatory")
    private Integer categoryNo;
    @Column(name="COVERPAGE")
    @Lob
    private Blob coverPage;
    @Column(name="ISBN")
    @NotEmpty(message="ISBN is mandatory")
    private String isbn;
    @Column(name="EDITION")
    @NotEmpty(message="Edition is mandatory")
    private String edition;
    @Column(name="YEAR")
    @NotEmpty(message="Year is mandatory")
    private String year;
    @Column(name="COST")
    @NotEmpty(message="Cost is mandatory")
    private String cost;
    @Column(name="SYNOPSIS")
    @NotEmpty(message="Synopsis is mandatory")
    private String synopsis;
    @Column(name="ABOUTAUTHORS")
    @NotEmpty(message="About Authors is mandatory")
    private String aboutAuthors;
    @Column(name="TOPICSCOVERED")
    private String topicsCovered; 
    @Column(name="CONTENTSCDROM")
    private String contentsCDROM; 
    @Column(name="TOC")
    @Lob
    private Blob toc;
    @Column(name="SAMPLECHAPTER")
    @Lob
    private Blob sampleChapter;
    @Column(name="HITS")
    private Integer hits;

    /**
     * @return the bookNo
     */
    public Integer getBookNo() {
        return bookNo;
    }

    /**
     * @param bookNo the bookNo to set
     */
    public void setBookNo(Integer bookNo) {
        this.bookNo = bookNo;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author1No
     */
    public Integer getAuthor1No() {
        return author1No;
    }

    /**
     * @param author1No the author1No to set
     */
    public void setAuthor1No(Integer author1No) {
        this.author1No = author1No;
    }

    /**
     * @return the author2No
     */
    public Integer getAuthor2No() {
        return author2No;
    }

    /**
     * @param author2No the author2No to set
     */
    public void setAuthor2No(Integer author2No) {
        this.author2No = author2No;
    }

    /**
     * @return the author3No
     */
    public Integer getAuthor3No() {
        return author3No;
    }

    /**
     * @param author3No the author3No to set
     */
    public void setAuthor3No(Integer author3No) {
        this.author3No = author3No;
    }

    /**
     * @return the author4No
     */
    public Integer getAuthor4No() {
        return author4No;
    }

    /**
     * @param author4No the author4No to set
     */
    public void setAuthor4No(Integer author4No) {
        this.author4No = author4No;
    }

    /**
     * @return the publisherNo
     */
    public Integer getPublisherNo() {
        return publisherNo;
    }

    /**
     * @param publisherNo the publisherNo to set
     */
    public void setPublisherNo(Integer publisherNo) {
        this.publisherNo = publisherNo;
    }

    /**
     * @return the categoryNo
     */
    public Integer getCategoryNo() {
        return categoryNo;
    }

    /**
     * @param categoryNo the categoryNo to set
     */
    public void setCategoryNo(Integer categoryNo) {
        this.categoryNo = categoryNo;
    }

    /**
     * @return the coverPage
     */
    public Blob getCoverPage() {
        return coverPage;
    }

    /**
     * @param coverPage the coverPage to set
     */
    public void setCoverPage(Blob coverPage) {
        this.coverPage = coverPage;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * @return the aboutAuthors
     */
    public String getAboutAuthors() {
        return aboutAuthors;
    }

    /**
     * @param aboutAuthors the aboutAuthors to set
     */
    public void setAboutAuthors(String aboutAuthors) {
        this.aboutAuthors = aboutAuthors;
    }

    /**
     * @return the topicsCovered
     */
    public String getTopicsCovered() {
        return topicsCovered;
    }

    /**
     * @param topicsCovered the topicsCovered to set
     */
    public void setTopicsCovered(String topicsCovered) {
        this.topicsCovered = topicsCovered;
    }

    /**
     * @return the contentsCDROM
     */
    public String getContentsCDROM() {
        return contentsCDROM;
    }

    /**
     * @param contentsCDROM the contentsCDROM to set
     */
    public void setContentsCDROM(String contentsCDROM) {
        this.contentsCDROM = contentsCDROM;
    }

    /**
     * @return the toc
     */
    public Blob getToc() {
        return toc;
    }

    /**
     * @param toc the toc to set
     */
    public void setToc(Blob toc) {
        this.toc = toc;
    }

    /**
     * @return the sampleChapter
     */
    public Blob getSampleChapter() {
        return sampleChapter;
    }

    /**
     * @param sampleChapter the sampleChapter to set
     */
    public void setSampleChapter(Blob sampleChapter) {
        this.sampleChapter = sampleChapter;
    }

    /**
     * @return the hits
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * @param hits the hits to set
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }
    
    
    
    
    
}
