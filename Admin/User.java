class User{
    int id;
    String name;
    String email;
    String role;
    boolean active;

    User(int id, String name, String email,String role){
        this.id = id; 
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = true;
    }

    void display(){
        System.out.println("ID: " + id +
                            " \n Name : " + name +
                            "\n Email : " + email +
                            "\n role : " + role +
                            "\n Status : " + (active ? "Active" : "Disabled")
                            );
    }
}