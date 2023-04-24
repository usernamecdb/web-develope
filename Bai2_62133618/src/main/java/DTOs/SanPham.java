package DTOs;

public class SanPham {
	private String maSP;
    private String tenSP;
    private double giaBan;
    private String donViTinh;
    private String moTa;
    private String urlHinhAnh1;
    private String urlHinhAnh2;
    
    public SanPham() {}
    
    public SanPham(String maSP, String tenSP, double giaBan, String donViTinh, String moTa, String urlHinhAnh1, String urlHinhAnh2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.donViTinh = donViTinh;
        this.moTa = moTa;
        this.urlHinhAnh1 = urlHinhAnh1;
        this.urlHinhAnh2 = urlHinhAnh2;
        
	}
	
	public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getUrlHinhAnh1() {
        return urlHinhAnh1;
    }

    public void setUrlHinhAnh1(String urlHinhAnh1) {
        this.urlHinhAnh1 = urlHinhAnh1;
    }

    public String getUrlHinhAnh2() {
        return urlHinhAnh2;
    }

    public void setUrlHinhAnh2(String urlHinhAnh2) {
        this.urlHinhAnh2 = urlHinhAnh2;
    }
}
