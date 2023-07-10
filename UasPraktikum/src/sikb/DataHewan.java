package sikb;

public class DataHewan {
    protected String nama;
    private String deskripsi;

    public DataHewan(String nama,String desc){
        this.nama = nama;
        this.deskripsi= desc;
    }

    public void reproduksi() {
        System.out.println("Habitat asli    : ");
    }
    public String ambil_nama(){
        return nama;
    }
    public void lihatDetail() {
        System.out.println("Deskripsi     : " + deskripsi);
    }
}
class mamalia extends DataHewan {
    public mamalia(String nama, String desc) {
        super(nama, desc);
    }
    @Override
    public String ambil_nama(){
        System.out.println("Nama    :"+nama);
        return nama;
    }
    @Override
    public void reproduksi(){
        System.out.println("hewan ini termasuk mamalia berkembangbiak dengan cara beranak");
    }
    @Override
    public void lihatDetail() {
        super.lihatDetail();
    }

}
class aves extends DataHewan {
    public aves(String nama, String desc) {
        super(nama, desc);
    }
    @Override
    public String ambil_nama(){
        System.out.println("Nama    :"+nama);
        return nama;
    }
    @Override
    public void reproduksi(){
        System.out.println("hewan ini termasuk aves berkembangbiak dengan cara bertelur");
    }
    @Override
    public void lihatDetail() {
        super.lihatDetail();
    }

}
class pisces extends DataHewan {
    public pisces(String nama, String desc) {
        super(nama, desc);
    }
    @Override
    public String ambil_nama(){
        System.out.println("Nama    :"+nama);
        return nama;
    }
    @Override
    public void reproduksi(){
        System.out.println("hewan ini termasuk Pisces bereproduksi dengan bertelur");
    }
    @Override
    public void lihatDetail() {
        super.lihatDetail();
    }

}
class reptil extends DataHewan {
    public reptil(String nama, String desc) {
        super(nama, desc);
    }
    @Override
    public String ambil_nama(){
        System.out.println("Nama    :"+nama);
        return nama;
    }
    @Override
    public void reproduksi(){
        System.out.println("hewan ini termasuk Reptil bereproduksi dengan bertelur");
    }
    @Override
    public void lihatDetail() {
        super.lihatDetail();
    }

}

