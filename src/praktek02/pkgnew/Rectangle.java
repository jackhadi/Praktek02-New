package praktek02.pkgnew;

public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=10;
        lebar=50;
    }
    
    
    
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
        System.out.println("===================");
   }
    
    double HitungLuas(){
                double luas;
                luas=panjang*lebar;
                return luas;
}
    void cetakLuas(){
        System.out.println("Luasnya adalah :"+HitungLuas());
    }
}
