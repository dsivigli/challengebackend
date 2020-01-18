package com.webapp.loan.controller;


import com.github.hansonhsc.loan.quote.LoanQuote;
import com.github.hansonhsc.loan.quote.LoanQuoteApplication;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
 
public class MainRESTController {
 
   
 
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
 
   
 
    // URL:
    // http://localhost:8080/SomeContextPath/quote/{lender}/{loanamount}
  
    @RequestMapping(value = "/quote/{lender}/{loanamount}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public LoanQuote getQuote(@PathVariable("lender") String lender,
    		              @PathVariable("loanamount") String loanAmount) {
    	LoanQuoteApplication loanQuoteApplication=new LoanQuoteApplication();
    	return loanQuoteApplication.getQuote(lender, loanAmount);
    	
   
    }
 
   
 
}
