/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex39;

public class info {
    public class Info {
        private String LastName = "";
        private String position = "";
        private String separationDate = "";

        public Info(String LastName, String position, String separationDate) {
            this.LastName = LastName;
            this.position = position;
            this.separationDate = separationDate;
        }

        public String getLastName() {
            return this.LastName;
        }

        public String getPosition() {
            return this.position;
        }

        public String getSeparationDate() {
            return this.separationDate;
        }
    }
}
