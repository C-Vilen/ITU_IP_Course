package IP2021ReexamCoding;

// 1. Implement a class User, with fields userIP of type String and level of type int. 
//In the constructor only the field level is initialised. 
public class User {
    private String userIP;
    private int level;

    public User(int level) {
        this.level = level;
    }

    /*
     * In this class implement a private method called checkIPValidity(ip) which receives a parameter of type String. 
     * The method returns true if the received parameter ip is valid, that is: it starts with "99", contains three dots, and each dot is followed by at least one digit. 
     * 
     * Otherwise it returns false. for example:
     * "993.342.12.01" is valid 
     * "99.111.9999." is not valid (last dot is not followed by a digit)
     * "99.121.44" is not valid  (does not have three dots)
     * ".9999.11.23.1" is not valid (does not start with "99")
     */
    private boolean checkIPValidity(String ip) {
        String pattern = "99\\d+\\.\\d+\\.\\d+\\.\\d+";
        return ip.matches(pattern);
    }
      
    // private boolean checkIPValidityVersion2(String ip) {
    //     if (!ip.startsWith("99")) {
    //         return false;
    //     }
    //     int numDots = 0;
    //     for (int i = 0; i < ip.length(); i++) {
    //         if (ip.charAt(i) == '.') {
    //         numDots++;
    //         if (i + 1 >= ip.length() || !Character.isDigit(ip.charAt(i + 1))) {
    //             return false;
    //         }
    //         }
    //     }
    //     return numDots == 3;
    // }

    // 2. In the class User, implement a method setIP(ip) which receives a parameter of type String. 
    // The method sets the value of userIP to ip (the received parameter), if ip is valid otherwise it does not change the value of userIP. 
    // (hint: use checkIPValidity as a helper method.)
    public void setIP(String ip){
        if (checkIPValidity(ip)) {
            this.userIP = ip;
        }
    }

    protected void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    public String getUserIP() {
        return userIP;
    }

	public int getLevel() {
		return level;
	}
}