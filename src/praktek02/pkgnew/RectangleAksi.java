package praktek02.pkgnew;


public class RectangleAksi {
        public static void main(String[] args) {
        Rectangle a1 = new Rectangle();
        a1.panjang = 10;
        a1.lebar = 30;
   
        
        
        a1.cetakInfo();
        System.out.println("Luas Rectangle adalah : "+a1.HitungLuas());
        a1.cetakLuas();
        
        Rectangle a2 = new Rectangle();
        a2.cetakInfo();
        
        Rectangle a3 = new Rectangle(50,50);
        a3.cetakInfo();
    }
}
