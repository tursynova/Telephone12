import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> people = new ArrayList<>();

          try {
            while (true){
                System.out.println("АДАМДЫ ЕНГІЗУ ҮШІН [1]  БАСЫҢЫЗ");
                System.out.println("АДАМДАРДЫ КОРУ Ушин [2] БАСЫҢЫЗ ");
                System.out.println("АДАМДАРДЫ издеу Ушин [3] БАСЫҢЫЗ ");
                System.out.println("ШЫҒУ ҮШІН [0]  БАСЫҢЫЗ");
                int choice = Integer.parseInt(rd.readLine());

                if(choice == 0){
                    break;
                }
                if(choice == 1){
                    System.out.println("Ati");
                    String name = rd.readLine();
                    System.out.println("familia");
                    String surname = rd.readLine();
                    System.out.println("nomer telephona");
                    long number = Long.parseLong(rd.readLine());
                    System.out.println("Адрес енгизгенде мна форматта енгизу керек Кала,кошеаты,уи,номери");
                    System.out.println("Мысалы");
                    System.out.println("Astana.Kudaiberdi.4a.152");
                    String addres = rd.readLine();
                    Person person = new Person(name, surname, number, addres);
                        people.add(person);
                       savePeople(people);

                }
                if(choice == 2){
                    System.out.println(getPeople());
                }
                if(choice == 3){
                    System.out.println("Ati");
                    String name = rd.readLine();
                    System.out.println("familia");
                    String surname = rd.readLine();
                    for(int i = 0;i< people.size();i++){
                        if(name.equals(people.get(i).getName()) && surname.equals(people.get(i).getSurname())){
                            System.out.println(people.get(i).toString());
                        }
                    }
                }
            }
          }catch (Exception ex){
              ex.printStackTrace();
          }

    }

    public static ArrayList<Person> getPeople(){
        ArrayList<Person> people = null;
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader("people.txt"));
            String text="";
            people = new ArrayList<>();
            while((text=read.readLine()) != null){
                String arr[] = text.split(" ");
                people.add(new Person(arr[0], arr[1], Long.parseLong(arr[2]), arr[3]));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return people;
    }

    public static void savePeople(ArrayList<Person> people){
        BufferedWriter wr = null;
        try {
            wr = new BufferedWriter(new FileWriter("people.txt"));
            for (Person i:people){
                wr.write(i.toString()+"\n");
            }
            wr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
