package ss12;

public class CheckInfor {
    public static boolean checkAge(int age) throws CheckAgeException {
        if (age<0){
            throw new CheckAgeException("Tuổi nhỏ hơn không");
        }else if (age>200){
            throw new CheckAgeException("tuổi quá đỉnh");
        }else {
            return true;
        }
    }
}
