public class Main{

    public static void main(String args[]){
        User user = new User(
                "Daniel",
                "Bedu",
                38,
                "Divorciado",
                true
        );

        // usamos la propiedad name
        System.out.println(user.getName());
        user.setName("Ian");
        System.out.println(user.getName()); //Comprobamos que name haya cambiado


        System.out.println(user.getLastName());
        user.setLastName("Bedu.org");
        System.out.println(user.getLastName()); //Comprobamos que lastName haya cambiado


        System.out.println(user.getAge());
        user.setAge(21);
        System.out.println(user.getAge()); //Comprobamos que age haya cambiado

        System.out.println(user.getStatus());
        user.setStatus("Soltero");
        System.out.println(user.getStatus()); //Comprobamos que status haya cambiado

        System.out.println("usuario es hombre? " + user.isMale());
        user.setMale(false);
        System.out.println("usuario es hombre? " + user.isMale()); //Comprobamos que status haya cambiado

    }
}