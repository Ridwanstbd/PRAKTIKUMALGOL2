package sikb;

import java.util.ArrayList;
import java.util.Scanner;

public class Klasifikasi {
    public static void mamalia() {
                Scanner input = new Scanner(System.in);
                ArrayList<mamalia> mammal = new ArrayList<>();
                mammal.add(new mamalia("Bekantan", "Bekantan merupakan satwa asli Indonesia, endemik di pulau Kalimantan. \nJenis primata ini memiliki postur tubuh yang besar di golongan monyet yang ada di Asia. \nPada bekantan jantan memilik postur tubuh yang lebih besar dengan berat badan mencapai 24 kg dan panjang tubuh 76 cm dengan panjang ekor yang hampir sepanjang tubuhnya antara 66-75 cm. \nBekantan jantan memiliki hidung yang panjang untuk menarik perhatian bekantan betina"));
                mammal.add(new mamalia("Anoa", "Anoa dataran rendah merupakan kelompok mamalia yang tergabung di famili Bovidae. \nMemiliki tubuh yang gempal dan kekar dengan tanduk yang bulat pipih runcing. Warna tubuh satwa ini coklat gelap sampai hitam."));
                mammal.add(new mamalia("Banteng Jawa", "Banteng atau yang memiliki nama ilmiah Bos Javanicus ini masih berkerabat dekat dengan sapi. \nPasalnya, satwa yang identik memiliki mocong putih ini berat tubuhnya mencapai 900 kilogram dengan tinggi 130-170 sentimeter, serta panjangnya sekitar 108-200 sentimeter. \nUkuran Banteng betina memang lebih kecil dari Banteng jantan, dengan panjang tanduk kurang lebih sama yakni 60 sampai 75 sentimeter."));
                mammal.add(new mamalia("Babirusa", "Panjang tubuh babirusa sekitar 87 sampai 106 sentimeter. sedangkan, tinggi babirusa berkisar pada 65-80 sentimeter dan berat tubuhnya bisa mencapai 90 kilogram. \nMereka sering diburu penduduk setempat untuk dimangsa atau sengaja dibunuh. \nPopulasi satwa yang juga memangsa larva ini kian sedikit hingga termasuk dalam daftar satwa yang dilindungi. \nJumlah mereka diperkirakan tinggal 4000 ekor dan hanya terdapat di Indonesia."));
                mammal.add(new mamalia("Harimau Sumatra", "Menjadi yang terkecil dalam genus, bukan berarti membuat Harimau Sumatera mudah untuk ditaklukkan. \nTingginya yang mencapai 60 centimeter dan panjang 250 centimeter ini diperkirakan hanya ada sekitar 400 ekor."));
                mammal.add(new mamalia("Kuda nil", "Kuda nil mempunyai tubuh yang besar dan berat, serta kulit kelabu gelap. \nMereka juga memiliki gading besar yang biasa mereka gunakan untuk mempertahankan diri dari predator. \nKuda nil mempunyai ciri khas tubuh yang besar, mulut dan gigi yang sangat besar, empat kaki yang pendek dan gemuk, serta badan yang hampir tidak berambut. \nKuda nil dewasa mempunyai berat 1.5 sampai 3 ton. Meskipun bertubuh besar dan berkaki pendek, kuda nil mampu berlari dengan cepat. \nUntuk jarak pendek, mereka mampu berlari secepat 30 km/jam, lebih cepat dari kecepatan lari manusia pada umumnya. Kuda nil memiliki watak agresif dan dianggap salah satu hewan paling berbahaya di Afrika."));

                System.out.println("Kelas Mamalia");
                System.out.println("Daftar kelas Hewan Mamalia di kebun binatang kami \nSebagai Berikut :");
                System.out.println("1. Bekantan \n2. Anoa \n3. Banteng Jawa \n4. Babirusa \n5. Harimau Sumatra \n6. Kuda Nil ");
                System.out.println("Masukan Pilihan Anda : ");
                int pilih = input.nextInt();
                if (pilih >= 1 && pilih <= mammal.size()) {
                mamalia selectedMammal = mammal.get(pilih - 1);
                System.out.println("Detail Mamalia yang dipilih:");
                selectedMammal.reproduksi();
                selectedMammal.ambil_nama();
                selectedMammal.lihatDetail();
            } else {
                System.out.println("Masukan pilihan yang benar");;
            }
        input.close(); 
    }
    public static void aves() {
                Scanner input = new Scanner(System.in);
                ArrayList<aves> avves = new ArrayList<>();
                avves.add(new aves("Elang Bondol", "Elang bondol berkuran sedang (43-51 cm), memiliki sayap yang lebar dengan ekor pendek dan membulat ketika membentang. \nBagian kepala, leher dan dada berwarna putih, sisanya berwarna merah bata pucat, bagian ujung bulu primer berwarna hitam, dan tungkai berwarna kuning. \nPada individu anak secara keseluruhan berwarna coklat gelap, pada beberapa bagian bergaris-garis putih mengkilap."));
                avves.add(new aves("Jalak Bali", "Jalak Bali (Leucopsar rothschildi) adalah sejenis burung pengicau berukuran sedang, dengan panjang lebih kurang 25 cm,dari suku Sturnidae. \nIa turut dikenali sebagai Curik Ketimbang Jalak.\nJalak Bali hanya ditemukan di hutan bagian barat Pulau Bali dan merupakan hewan endemik Indonesia. \nBurung ini juga merupakan satu-satunya spesies endemik Bali dan pada tahun 1991 dinobatkan sebagai lambang fauna Provinsi Bali."));
                avves.add(new aves("Julang Emas","Julang emas (bahasa Latin: Rhyticeros undulatus) adalah spesies burung dari keluarga Bucerotidae, dari genus Rhyticeros. \nBurung ini merupakan jenis burung pemakan buah-buahan, Ficus, kepiting, kodok yang memiliki habitat di hutan dataran rendah, perbukitan. \ntersebar sampai ketinggian 2.000 m dpl."));
                avves.add(new aves("Kakatua Jambul Kuning", "Kakatua jambul kuning atau kakatua jambul kuning (Cacatua sulphurea) adalah burung berukuran sedang, dengan panjang sekitar 35 cm, dari marga Cacatua. \nBurung ini hampir semua bulunya berwarna putih. \nDi kepalanya terdapat jambul berwarna kuning yang dapat ditegakkan. \nKakatua-kecil jambul-kuning berparuh hitam, kulit di sekitar matanya berwarna kebiruan dan kakinya berwarna abu-abu. \nBulu-bulu terbang dan ekornya juga berwarna kuning. Burung betina serupa dengan burung jantan."));
                avves.add(new aves("Kroonkran", "Kroonkran adalah burung asli afrika yang dapat ditemukan pada daerah selatan gurun sahara. \nMeskipun demikian, burung ini juga dapat ditemui disekitar rawa dan plantasi manusia dekat perairan. Ketika masa kawin, kantung merah pada daerah leher nya akan mengembang untukmemikat pasangan, \nselain itu burung ini juga akan melakukan tarian dan lompatan untuk menarik pasangannya. Musim kawin terjadi sepanjang musim hujan, ketika memasuki musim kawin,ktoonkran akan membuat sarang dari rumput kering dan ranting untuk meletakan telurnya. \nMerupakan omnivore, dapat memakan biji, serangga, cacing, mamalia kecil, kodok, dan ular. \nAktif mencari makan pada siang hari sedangkan padamalam hari beristirahat pada pohon"));
                avves.add(new aves("Nuri Bayan", "Nuri bayan atau Bayan (Eclectus roratus) adalah burung berukuran sedang, dengan panjang sekitar 43 cm, dari salah satu genus burung paruh-bengkok Eclectus. \nBurung ini sangat berbeda dengan burung paruh-bengkok lainnya. \nNama Eclectus berasal dari kata eklektik, karena warna yang dimorfik secara seksual."));



                System.out.println("Kelas Aves");
                System.out.println("Daftar kelas Hewan Aves di kebun binatang kami \nSebagai Berikut :");
                System.out.println("1. Elang Bondol \n2. Jalak Bali \n3. Julang Emas \n4. Kakatua Jambul Kuning \n5. Kroonkran \n6. Nuri Bayan ");
                System.out.println("Masukan Pilihan Anda : ");
                int pilih = input.nextInt();

                if (pilih >= 1 && pilih <= avves.size()) {
                aves selectedAves = avves.get(pilih - 1);
                System.out.println("Detail Aves yang dipilih:");
                selectedAves.reproduksi();
                selectedAves.ambil_nama();
                selectedAves.lihatDetail();
            } else {
                System.out.println("Masukan pilihan yang benar");;
            }
        input.close();
    }
    public static void pisces() {
                Scanner input = new Scanner(System.in);
                ArrayList<pisces> Pisces = new ArrayList<>();
                Pisces.add(new pisces("Aligator Gar", "Ikan aligator gar adalah ikan terbesar dari tujuh spesies gar. Megafish ini memiliki tubuh berbentuk torpedo berwarna coklat zaitun dan dilengkapi dengan sisik berkilau. \nPanjangnya bisa mencapai 3 meter dan beratnya bisa mencapai hampir 140 kg. \nHal ini membuat buat ikan alligator jadi spesies ikan terbesar di Amerika Utara yang hidup di air tawar."));
                Pisces.add(new pisces("Arwana Papua", "Arwana merupakan ikan hias termahal di Indonesia. Ikan ini termasuk dalam famili Osteoglossidae. \nArwana juga dikenal sebagai ikan lidah bertulang (bony tongue) dan tergolong sebagai keturunan ikan air tawar purba. \nIkan arwana juga terdapat di Papua. \nArwana dari Papua ini termasuk dalam spesies Scleropages jardinii, dan merupakan spesies ikan yang dilindungi \nUntuk Papua sendiri, ikan arwana ini termasuk ikan asli dan endemik di perairan Papua bagian selatan seperti di wilayah Kabupaten Merauke, Boven Digul, Mappi dan Asmat."));
                Pisces.add(new pisces("Ikan Scorpion", "Ikan Scorpion artinya salah satu hewan bahari paling berbisa di global. \nSpesies ikan ini ada pada bahari Indo-pasifik yang memiliki iklim tropis serta umumnya mendiami perairan dangkal namun ada juga ditemukan pada kedalaman 2200 meter. \nIkan Scorpion mempunyai racun pada bagian punggungnya yang berbentuk duri yang siap melumpuhkan mangsanya menggunakan seketika."));
                Pisces.add(new pisces("Lele Ekor Merah", "Ikan Lele Ekor Merah (Phractocephalus hemioliopterus) atau Redtail Catfish merupakan salah satu jenis lele terindah. \nWalaupun begitu, ikan ini juga termasuk ikan air tawar terganas di dunia. \nIkan ini banyak di temukan di Amerika Selatan, terutama Sungai Amazon dan Sungai Orinoco. Ikan ini bisa hidup sampai 20 tahun."));
                Pisces.add(new pisces("Lobster Pasir", "Lobster pasir (Panulirus homarus) merupakan salah satu jenis lobster yang paling banyak ditemukan di Teluk Palabuhanratu. \nPengelolaan yang sesuai dengan aspek biologi reproduksi lobster diperlukan untuk menjaga kelestarian sumberdaya lobster pasir di alam."));
                Pisces.add(new pisces("Piranha", "Ikan piranha merupakan bagian dari subfamili Serrasalminae yang termasuk dalam keluarga Characidae. \nPiranha ialah ikan air tawar yang berasal dari sungai-sungai di kawasan Amerika Selatan. Selain sungai, habitat piranha juga meliputi rawa, danau dan waduk."));

                System.out.println("Kelas Aves");
                System.out.println("Daftar kelas Hewan Pisces di kebun binatang kami \nSebagai Berikut :");
                System.out.println("1. Aligator Gar \n2. Arwana Papua \n3. Ikan Scorpion \n4. Lele Ekor Merah \n5. Lobster Pasir \n6. Piranha ");
                System.out.println("Masukan Pilihan Anda : ");
                int pilih = input.nextInt();

                if (pilih >= 1 && pilih <= Pisces.size()) {
                pisces selectedPisces = Pisces.get(pilih - 1);
                System.out.println("Detail Pisces yang dipilih:");
                selectedPisces.reproduksi();
                selectedPisces.ambil_nama();
                selectedPisces.lihatDetail();
            } else {
                System.out.println("Masukan pilihan yang benar");;
            }
        input.close();
    }
    public static void reptil() {
                Scanner input = new Scanner(System.in);
                ArrayList<reptil> reptile = new ArrayList<>();
                reptile.add(new reptil("Biawak Hijau", "Biawak hijau merupakan hewan arboreal atau hewan yang sebagian besar hidupnya dihabiskan di atas pepohonan atau belukar. \nSeperti namanya, biawak hijau ini memiliki warna tubuh emerald atau hijau seperti permata zamrud hingga biru pirus dengan sisik hitam yang tersebar di seluruh tubuhnya."));
                reptile.add(new reptil("Buaya Irian", "Buaya irian (Crocodylus novaeguineae) adalah salah satu spesies buaya yang ditemukan menyebar di perairan tawar pedalaman Pulau Papua. \nBentuk umum jenis ini mirip dengan buaya muara (C. porosus), tetapi lebih kecil dan warna kulitnya lebih gelap."));
                reptile.add(new reptil("Iguana", "Iguana adalah marga kadal yang hidup di daerah tropis Amerika Tengah, Amerika Selatan, dan kepulauan Karibia. \nKadal-kadal ini dideskripsikan pertama kali oleh seorang ahli hewan berkebangsaan Austria, Josephus Nicolaus Laurenti pada tahun 1768. \nSejauh ini, genus Iguana hanya terdiri dari dua spesies, yaitu iguana hijau (Iguana iguana) dan iguana Antilles Kecil (Iguana delicatissima)."));
                reptile.add(new reptil("Komodo", "Komodo atau lengkapnya biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia."));
                reptile.add(new reptil("Soa Layar", "Soa-soa Layar bernama ilmiah Hydrosaurus amboinensis di daerah aslinya disebut piccara dan dikalangan penghobi dikenal dengan Saigon (singkatan dari Sailfin Dragon). \nKadal air ini memiliki kemampuan berlari dan berenang yang cukup cepat. \nSoa-soa dapat tumbuh mencapai panjang 1 meter dan merupakan kadal agamid terbesar di dunia."));
                reptile.add(new reptil("Ular Sanca Albino", "ular sanca albino adalah jenis ular Sanca (Python reticulatus) yang memiliki kondisi albinisme. \nAlbinisme adalah kelainan genetik yang menghasilkan kekurangan atau ketidakmampuan dalam memproduksi pigmen melanin, yang memberikan warna pada kulit, rambut, dan mata. \nPada ular sanca albino, kekurangan melanin menyebabkan mereka memiliki kulit yang sepenuhnya putih atau sangat pucat dengan mata yang berwarna merah muda atau merah terang."));

                System.out.println("Kelas Reptil");
                System.out.println("Daftar kelas Hewan Reptil di kebun binatang kami \nSebagai Berikut :");
                System.out.println("1. Biawak Hijau \n2. Buaya Irian \n3. Iguana \n4. Komodo \n5. Soa Layar \n6. Ular Sanca Albino ");
                System.out.println("Masukan Pilihan Anda : ");
                int pilih = input.nextInt();

                if (pilih >= 1 && pilih <= reptile.size()) {
                reptil selectedReptil = reptile.get(pilih - 1);
                System.out.println("Detail Reptil yang dipilih:");
                selectedReptil.reproduksi();
                selectedReptil.ambil_nama();
                selectedReptil.lihatDetail();
            } else {
                System.out.println("Masukan pilihan yang benar");;
            }
        input.close();
    }
}
