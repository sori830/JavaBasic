public class _06_Exception {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
//                throw new Exception("Permission Deny");
                throw new AgeLessThanException("Permission Deny");
            } else {
                System.out.println("Permission Granted");
            }
            System.out.println(3/0);
        } catch(AgeLessThanException e) {
            System.out.println("Permission Deny");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program Terminate!!!");
    }
}

class AgeLessThanException extends Exception {
    public AgeLessThanException(String message) {
        super(message);
    }
}
