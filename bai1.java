package hinh;

public class HinhVuong { private double canh;

public HinhVuong(double canh) {
    this.canh = canh;
}

public double getCanh() {
    return canh;
}

public void setCanh(double canh) {
    this.canh = canh;
}

public double tinhChuVi() {
    return 4 * canh;
}

public double tinhDienTich() {
    return canh * canh;
}
}

public class HinhTron { private double banKinh;

public HinhTron(double banKinh) {
    this.banKinh = banKinh;
}

public double getBanKinh() {
    return banKinh;
}

public void setBanKinh(double banKinh) {
    this.banKinh = banKinh;
}

public double tinhChuVi() {
    return 2 * Math.PI * banKinh;
}

public double tinhDienTich() {
    return Math.PI * banKinh * banKinh;
}
}
