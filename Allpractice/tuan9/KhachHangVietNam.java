class KhachHangVietNam extends KhachHang {
	private String doiTuong;
	private double dinhMuc;
	public KhachHangVietNam(String ma, String ten, LocalDate ngay, double soKW,
			double donGia,String quocTich) {
		super(ma, ten, ngay,soKW, donGia);
		this.quocTich = quocTich;
		this.dinhMuc = dinhMuc;
	}
	public String getDoiTuong() {return doiTuong;}
	@Override
	public double thanhTien() {
		return soKW <= dinhMuc
			? soKW * donGia
			: dinhMuc * donGia + (soKW - dinhMuc) * donGia * 2.5;
	}
}
