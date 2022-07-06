public class PhoneBook {


    String name; //ФИО
    String city; //город
    int phoneNumber; //номер телефона

    public PhoneBook(String pubname,String pubcity, int pubPhoneNumber){
        name = pubname;
        city = pubcity;
        phoneNumber = pubPhoneNumber;

    }
    public void personinfo (){



        System.out.println("позвонить гражданину "+ name + " из города " + city + " можно по номеру " + phoneNumber);
    }
}
