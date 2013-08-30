package ru;

//Data Encapsulation using Getters and Setters
public class UserInfo {
        private String username;
        private String password;
        private String FirstName;
        private String LastName;
        public boolean valid;
        public String getFirstName(String firstName)
        {
            return this.FirstName;
        }
        public void setFirstName(String newFirstName)
        {
            FirstName = newFirstName;
        }
        public String getLastName(String lastName)
        {
            return this.LastName;
        }
        public void setLastName(String newLastName)
        {
            LastName = newLastName;
        }
        public String getPassword()
        {
            return password;
        }
        public void setPassword(String newPassword)
        {
            password = newPassword;
        }
        public String getUsername()
        {
            return username;
        }
        public void setUserName(String newUsername)
        {
            username = newUsername;
        }
        public boolean isValid()
        {
            return valid;
        }
        public void setValid(boolean newValid)
        {
            valid = newValid;
        }

    }
