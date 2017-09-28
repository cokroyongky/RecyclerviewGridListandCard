package cyp.cokrodev.recyclerviewgridlistandcard;

import java.util.ArrayList;

/**
 * Created by Cokro Yongky Pranowo on 28/09/2017.
 */

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg","Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1966. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda.","6 Juni 1901, Surabaya","21 Juni 1970 Jakarta","Mohammad Hatta (1945-1956)"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg","Jenderal Besar TNI H. M. Soeharto, adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno.","8 Juni 1921, Kemusuk, Argomulyo, Sedayu, Bantul","27 Januari 2008, Jakarta","Hamengkubuwana IX (1973-1978)\nAdam Malik (1978-1983)\nUmar Wirahadikusumah (1983-1988)\nSoedharmono (1988-1993)\nTry Sutrisno (1993-1998)\nBacharuddin Jusuf Habibie (1998-1998)"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg","Prof. Dr.-Ing. H. Bacharuddin Jusuf Habibie, FREng adalah Presiden Republik Indonesia yang ketiga. Ia menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998.","25 Juni 1936, Parepare","(Masih Hidup)","Kosong"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg","Dr. K. H. Abdurrahman Wahid atau yang akrab disapa Gus Dur adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J","7 September 1940 Kabupaten Jombang","30 Desember 2009, Jakarta","Megawati Soekarnoputri (1999-2001)"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg","Dr.(H.C.)[1] Hj. Dyah Permata Megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai Megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" (lahir di Yogyakarta, 23 Januari 1947; umur 70 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004.","23 Januari 1947, Yogyakarta","(Masih Hidup)","Hamzah Haiz (2001-2004)"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png","Jenderal TNI Prof. Dr. H. Susilo Bambang Yudhoyono GCB AC adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu","9 September 1949, Kabupaten Pacitan","(Masih Hidup)","Muhammad Jusuf Kalla (2004-2009)\nBoediono (2009-2014)"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg","Ir. H. Joko Widodo atau yang lebih akrab disapa Jokowi adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014.","21 Juni 1961","(Masih Hidup)","Muhammad Jusuf Kalla (Petahana)"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            president = new President();
            president.setName(data[i][0]);
            president.setRemarks(data[i][1]);
            president.setPhoto(data[i][2]);
            president.setDesc(data[i][3]);
            president.setBorn(data[i][4]);
            president.setDie(data[i][5]);
            president.setVice(data[i][6]);

            list.add(president);
        }

        return list;
    }
}