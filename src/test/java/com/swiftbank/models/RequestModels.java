package com.swiftbank.models;

public class RequestModels {
    private String username;
    private String password;

    public RequestModels(Builder builder) {
        this.username = builder.username;
        ;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String username;
        private String password;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public RequestModels build() {
            return new RequestModels(this);
         }
    }
}

