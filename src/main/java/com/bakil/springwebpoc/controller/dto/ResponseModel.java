package com.bakil.springwebpoc.controller.dto;

public class ResponseModel {
    private ResponseMetadata metadata = new ResponseMetadata();

    public ResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ResponseMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "metadata=" + metadata +
                '}';
    }
}


