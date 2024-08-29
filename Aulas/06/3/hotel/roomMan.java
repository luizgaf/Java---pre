package hotel;

public class roomMan{

    private String name, email;
    private int room;

        public roomMan(String name, String email, int room){
            this.name = name;
            this.email = email;
            this.room = room;
        }

        public String getName(){
            return name;
        }

        public String getEmail(){
            return email;
        }

        public int getRoom(){
            return room;
        }
}