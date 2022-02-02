package com.dxclearninig1;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=)
public class PersonNotFoundException  extends RuntimeException{
    private String personName;
    private Integer personid;
    private String personaddress;
    private String personemail;
    public PersonNotFoundException(String personName, Integer personid, String personaddress, String personemail) {
        this.personName = personName;
        this.personid = personid;
        this.personaddress = personaddress;
        this.personemail = personemail;
    }
    public PersonNotFoundException(String message, String personName, Integer personid, String personaddress,
            String personemail) {
        super(message);
        this.personName = personName;
        this.personid = personid;
        this.personaddress = personaddress;
        this.personemail = personemail;
    }
    public PersonNotFoundException(Throwable cause, String personName, Integer personid, String personaddress,
            String personemail) {
        super(cause);
        this.personName = personName;
        this.personid = personid;
        this.personaddress = personaddress;
        this.personemail = personemail;
    }
    public PersonNotFoundException(String message, Throwable cause, String personName, Integer personid,
            String personaddress, String personemail) {
        super(message, cause);
        this.personName = personName;
        this.personid = personid;
        this.personaddress = personaddress;
        this.personemail = personemail;
    }
    public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace, String personName, Integer personid, String personaddress, String personemail) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.personName = personName;
        this.personid = personid;
        this.personaddress = personaddress;
        this.personemail = personemail;
    }

}

