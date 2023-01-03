package IP2021ReexamCoding;

    // 3. Implement a class RegUser which is a subclass of User. 
    // In this class add a field called region of type int, which is initialised in the constructor. 
public class RegUser extends User{
    private int region;

    public RegUser(int level, int region) {
        super(level);
        this.region = region;
    }

    // 4. In class RegUser, implement a private method checkIPValidity(ip) which receives a parameter of type String. 
    // This method checks that ip is valid, that is: none of the substrings separated by dots are equal to "111". 
    // If this condition is satisfied it returns true otherwise it returns false. For example:
    // "111.101.12.01" is not valid as the substrings separated by dots are "111", "101", "12" and "01" and one of them is equal to "111"
    private boolean checkIPValidity(String ip) {
        return !ip.contains("111");
    }
      
    // private boolean checkIPValidityVersion2(String ip) {
    // String[] parts = ip.split("\\.");
    // for (String part : parts) {
    //     if (part.equals("111")) {
    //     return false;
    //     }
    // }
    // return true;
    // }
    
    // 5. In class RegUser, override the method setIP such that setIP(ip) 
    // sets the value of userIP to ip (the received parameter) if ip satisfies both of the following conditions:  
    //      - starts with "99", contains three dots, and each dot is followed by at least one digit
    //      - none of the substrings separated by dots are equal to "111"
    @Override
    public void setIP(String ip) {
        if (checkIPValidity(ip)) {
            setUserIP(ip);
        }
    }

    public int getRegion() {
        return region;
    }
}
