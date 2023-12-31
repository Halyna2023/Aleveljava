package ua.olifirenko.hw10;
import java.util.Optional;
//class PhoneBook {
//    private static final String[] PHONE_BOOK = new String[3];
//    public static void main(String[] args) {
//        PHONE_BOOK[0] = "016/161616";
//        PHONE_BOOK[1] = "016/161617";
//        PHONE_BOOK[2] = "016/161618";
//    }
//    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber){
//        return null;
//    }
//}
//
//    Реализовать метод поиска индекса телефона в массиве, если телефона нет - вернуть пустой
//        Optional.
public class Task3 {


    public static class PhoneBook {
        private static final String[] PHONE_BOOK = new String[3];

        public static void main(String[] args) {
            PHONE_BOOK[0] = "016/161616";
            PHONE_BOOK[1] = "016/161617";
            PHONE_BOOK[2] = "016/161618";

            // Пример использования метода findIndexByPhoneNumber
            Optional<Integer> index = findIndexByPhoneNumber("016/161617");
            index.ifPresentOrElse(
                    i -> System.out.println("Phone number found at index: " + i),
                    () -> System.out.println("Phone number not found in the phone book.")
            );
        }

        public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
            for (int i = 0; i < PHONE_BOOK.length; i++) {
                if (PHONE_BOOK[i] != null && PHONE_BOOK[i].equals(phoneNumber)) {
                    return Optional.of(i);
                }
            }
            return Optional.empty();
        }
    }

}
