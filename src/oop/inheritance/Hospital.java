package oop.inheritance;

public class Hospital {
    public static void main(String[] args) {
//        Doctor doc = new Doctor("Carl");
//        doc.diagnose();
//        System.out.println("Making " + doc.getSalary());
//        Surgeon srg = new Surgeon("Pepa");
//        srg.diagnose();
//        srg.surgery();
//        System.out.println("Making " + srg.getSalary());
//        CardiacSurgeon crs = new CardiacSurgeon("Joseph");

        Doctor carSur = new CardiacSurgeon("CarlAnother");
        Doctor surgDoc = new Surgeon("Frenchie");
        Doctor doctor = new Doctor("John");
//        System.out.println(doctor.getSalary());
        Doctor[] doctors = {carSur, surgDoc, doctor};
        for (int i = 0; i < doctors.length; i++) {
            System.out.println(doctors[i].name + ": " +  doctors[i].getSalary());
            doctors[i].diagnose();
            if (doctors[i] instanceof Surgeon){
                ((Surgeon) doctors[i]).surgery();
            }
            if (doctors[i] instanceof CardiacSurgeon){
                ((CardiacSurgeon) doctors[i]).cardiacSurgery();
            }
        }
    }
}
