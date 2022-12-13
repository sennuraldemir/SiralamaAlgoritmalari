package siralamaalgoritmalari;

import java.util.Arrays;

public class BubbleSort {

    int[] dizi;

    public BubbleSort(int[] d) {
        dizi = d;

    }

    public void BubbleSort() {
        int temp = 0;
        boolean isSwapped = true;  // bubble sort a iyileştirme yapabildik çünkü dış döngünün iç döngü ile bağlantısı yoktu

        for (int i = 0; i < dizi.length && isSwapped; i++) {
            isSwapped = false;  // swap false kalırsa dizi sıralıdır

            for (int j = 0; j < (dizi.length - 1) - i; j++) {  //dizi.length-1 çünkü: j++ yapıldı
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];           //swap işlemleri
                    dizi[j] = dizi[j + 1];    //swap işlemleri
                    dizi[j + 1] = temp;       //swap işlemleri
                    isSwapped = true; //swap işlemi yapılmış, dizi sıralı olmayabilir o yüzden döngü devam etmeli
                }
            }
        }
    } // iç döngüsü baştan sona bi dönüyo, doğal olarak bunlar içerisinde kıyaslama yapıyor ve eğer tamamı sıralıysa hiç işlem yapmıyor
    // isSwapped kullanılmasının nedeni
    
    public void print() {
        System.out.println(Arrays.toString(dizi));
    }

}
