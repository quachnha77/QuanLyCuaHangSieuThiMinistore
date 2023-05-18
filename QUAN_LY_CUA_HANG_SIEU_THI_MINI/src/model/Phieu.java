/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.Objects;

public class Phieu {
	private String maPhieu;
	private Date thoiGianTao;
	private String nguoiTao;
	private String nguoiGiao;
	private String nguoiNhan;
	private String loaiPhieu;
        private String maNhaCungCap;
	public Phieu() {
            super();
	}

    public Phieu(String maPhieu, Date thoiGianTao, String nguoiTao, String nguoiGiao, String nguoiNhan, String loaiPhieu, String maNhaCungCap) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.nguoiTao = nguoiTao;
        this.nguoiGiao = nguoiGiao;
        this.nguoiNhan = nguoiNhan;
        this.loaiPhieu = loaiPhieu;
        this.maNhaCungCap = maNhaCungCap;
    }
    
    public String getMaPhieu() {
	return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
	this.maPhieu = maPhieu;
    }

    public Date getThoiGianTao() {
	return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
	this.thoiGianTao = thoiGianTao;
    }

    public String getNguoiTao() {
	return nguoiTao;
	}

    public void setNguoiTao(String nguoiTao) {
	this.nguoiTao = nguoiTao;
	}

    public String getNguoiGiao() {
	return nguoiGiao;
	}

    public void setNguoiGiao(String nguoiGiao) {
	this.nguoiGiao = nguoiGiao;
	}

    public String getLoaiPhieu() {
	return loaiPhieu;
	}

    public void setLoaiPhieu(String loaiPhieu) {
	this.loaiPhieu = loaiPhieu;
	}

    public String getNguoiNhan() {
	return nguoiNhan;
	}

    public void setNguoiNhan(String nguoiNhan) {
	this.nguoiNhan = nguoiNhan;
	}

    public String getMaNhaCungCap() {
        return maNhaCungCap;
        }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
        }

    @Override
    public String toString() {
        return "Phieu{" + "maPhieu=" + maPhieu + ", thoiGianTao=" + thoiGianTao + ", nguoiTao=" + nguoiTao + ", nguoiGiao=" + nguoiGiao + ", nguoiNhan=" + nguoiNhan + ", loaiPhieu=" + loaiPhieu + ", maNhaCungCap=" + maNhaCungCap + '}';
    }
}
