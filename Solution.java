class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public void main(String[] args) {
        String ipAddress = "192.168.1.1";
        String defangedIP = defangIPaddr(ipAddress);
        System.out.println("Defanged IP Address: " + defangedIP);
    }

}