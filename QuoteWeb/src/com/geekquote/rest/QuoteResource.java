package com.geekquote.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.geekquote.dao.DaoFactory;
import com.geekquote.dao.QuoteDao;
import com.geekquote.entity.Quote;

@Path("/quotes")
public class QuoteResource {

	private QuoteDao quoteDao = DaoFactory.getInstance().getQuoteDao();
	
	@GET
	public List<Quote> getAllQuotesXml(){
		return quoteDao.getAllQuotes();
	}
	
	@GET
	@Path("/{id}")
	public Quote getQuoteXml(@PathParam("id") int id){
		return quoteDao.getQuoteById(id);
	}
	
	@DELETE
	@Path("/{id}")
	public void removeQuote(@PathParam("id") int id){
		quoteDao.removeQuote(id);
	}
}
