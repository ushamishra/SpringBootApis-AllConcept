package com.example.demo.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;

public class MyErrorResponse implements ErrorResponse {

    Problems body;

    MyErrorResponse(){
        body = new Problems();

    }

    public void setBody(Problems body) {
        this.body = body;
    }

    @Override
    public HttpStatusCode getStatusCode() {
        return null;
    }

    @Override
    public ProblemDetail getBody() {
        return body;
    }
}
