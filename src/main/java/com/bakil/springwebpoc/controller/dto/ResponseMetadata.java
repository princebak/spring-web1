package com.bakil.springwebpoc.controller.dto;

public class ResponseMetadata{
        private int status = 200;
        private String message = "success";

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    @Override
    public String toString() {
        return "ResponseMetadata{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}