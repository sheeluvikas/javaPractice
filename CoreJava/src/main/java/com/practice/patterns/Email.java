package com.practice.patterns;

public class Email {

    private String title;
    private String body;
    private String subject;
    private String recipient;

    private Email(EmailBuilder emailBuilder) {
        this.title = emailBuilder.title;
        this.body = emailBuilder.body;
        this.subject = emailBuilder.subject;
        this.recipient = emailBuilder.recipient;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public String send() {
        return "Email Sent to : " + this.recipient + " !!!";
    }


    public static class EmailBuilder {

        private String title;
        private String subject;
        private String recipient;
        private String body;

        public EmailBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public Email build() {
            if(this.recipient == null || this.recipient.isEmpty()) {
                throw new EmailBuilderException("The recipient is a mandatory field. The value set for recipient is : " + recipient);
            }
            return new Email(this);
        }
    }
}
