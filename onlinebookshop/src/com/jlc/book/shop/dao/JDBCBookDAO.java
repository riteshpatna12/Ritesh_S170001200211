package com.jlc.book.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.annotations.common.util.impl.Log_.logger;

import com.jlc.book.shop.to.BookTo;
import com.jlc.book.shop.util.JDBCUtil;

public class JDBCBookDAO implements BookDAO {

	@Override
	public boolean addBook(BookTo bto) {
		boolean added=false;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement("insert into book_table(bookName,author,cost,publication,edition) values(?,?,?,?,?)");
		    ps.setString(1,bto.getBookName());
		    ps.setString(2,bto.getAuthor());
		    ps.setFloat(3,bto.getCost());
		    ps.setString(4,bto.getPublication());
		    ps.setString(5,bto.getEdition());
		    int x=ps.executeUpdate();
		    if(x>0){
		    	added=true;
		    }
		}catch(Exception e){
			added=false;
			logger.error("Exception in add book:\n",e)
		}finally{
			JDBCUtil.close(rs, ps, con);
			
		}
		return added;
	}

	@Override
	public boolean alreadyExit(BookTo bto) {
		boolean exist=false;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement("select * from book_table where bookName=? and author=? and cost=? and publication=? and edition=?");
		    ps.setString(1,bto.getBookName());
		    ps.setString(2,bto.getAuthor());
		    ps.setFloat(3,bto.getCost());
		    ps.setString(4,bto.getPublication());
		    ps.setString(5,bto.getEdition());
		    rs=ps.executeQuery();
		    if(rs.next()){
		    	exist=true;
		    }
		}catch(Exception e){
			exist=false;
			logger.error("Exception in already exist book:\n",e)
		}finally{
			JDBCUtil.close(rs, ps, con);
			
		}
		return exist;
	}
	

	@Override
	public List searchBook(BookTo bto, int start, int numberOfBook) {
		List bookList=null;
		Connection con =null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getConnection();
			ps=con.prepareStatement(prepareQuery(bto),ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=1;
		    if(bto.getBookName()!=null && bto.getBookName().length()!=0)
		    	ps.setString(i++,"%"+bto.getBookName().trim()+"%");
		    
		    int x=ps.executeUpdate();
		    if(x>0){
		    	added=true;
		    }
		}catch(Exception e){
			added=false;
			logger.error("Exception in add book:\n",e)
		}finally{
			JDBCUtil.close(rs, ps, con);
			
		}
		return added;
	}

	@Override
	public int getTotalNumberOfBook(BookTo bto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BookTo getBookById(String bid) {
		// TODO Auto-generated method stub
		return null;
	}

}
