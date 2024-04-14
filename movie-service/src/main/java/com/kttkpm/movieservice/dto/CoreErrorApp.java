package com.kttkpm.movieservice.dto;

public enum CoreErrorApp {
    SUCCESS(1, "Thành công"),
    ERR_LOGIN(2, "Lỗi login"),
    NOPERMITION(3, "Không có quyền truy cập hệ thống."),
    ERR_NOSESSION(4, "Lỗi Phiên đăng nhập"),
    DATAEMTY(5, "Không có dữ liệu thỏa mãn");

    private final int code;
    private final String description;

    private CoreErrorApp(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public int getCode() {
        return this.code;
    }
}
