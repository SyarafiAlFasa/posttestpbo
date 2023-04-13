package posttest6;

interface welcome {
    void tambah();
    void ubah();
    void hapus();
}

class st_menu implements welcome {
    @Override
    public void tambah() {
        System.out.println("Selamat datang di menu tambah data");
    }

    @Override
    public void ubah() {
        System.out.println("Selamat datang di menu uabh data");
    }

    @Override
    public void hapus() {
        System.out.println("Selamat datang di menu hapus data");
    }
}   
