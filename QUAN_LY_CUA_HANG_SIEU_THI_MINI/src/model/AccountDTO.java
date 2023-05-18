package model;
import java.util.Objects;
public class AccountDTO {
        public String fullName;
	public String userName;
	public String passWord;
	public String role;
        public int status;
        public String email;
	public AccountDTO() {
            super();
	}

        public AccountDTO(String fullName, String userName, String passWord, String role, int status, String email) {
            super();
            this.fullName = fullName;
            this.userName = userName;
            this.passWord = passWord;
            this.role = role;
            this.status = status;
            this.email = email;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
     
        @Override
        public int hashCode() {
            int hash = 3;
            hash = 47 * hash + Objects.hashCode(this.fullName);
            hash = 47 * hash + Objects.hashCode(this.userName);
            hash = 47 * hash + Objects.hashCode(this.passWord);
            hash = 47 * hash + Objects.hashCode(this.role);
            hash = 47 * hash + this.status;
            hash = 47 * hash + Objects.hashCode(this.email);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final AccountDTO other = (AccountDTO) obj;
            if (this.status != other.status) {
                return false;
            }
            if (!Objects.equals(this.fullName, other.fullName)) {
                return false;
            }
            if (!Objects.equals(this.userName, other.userName)) {
                return false;
            }
            if (!Objects.equals(this.passWord, other.passWord)) {
                return false;
            }
            if (!Objects.equals(this.role, other.role)) {
                return false;
            }
            return Objects.equals(this.email, other.email);
        }

        @Override
        public String toString() {
            return "AccountDTO{" + "fullName=" + fullName + ", userName=" + userName + ", passWord=" + passWord + ", role=" + role + ", status=" + status + ", email=" + email + '}';
        }
	
}
