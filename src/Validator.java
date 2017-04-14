public class Validator {

    boolean isNameValid(String s){
        return s.matches("([A-Za-zА-Яа-яёЁ]+ ?)+");
    }

    boolean isArrValid(Object[] arr){
        return arr != null && arr.length != 0;
    }

    boolean isAgeRangeValid(int start, int end, int number){
        return (start <= end && start >= 1 && /*end <= 100 &&*/ start <= number && end >= number);
    }
}
