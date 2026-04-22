package cau8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Cau8Test {

    // ===== LA SO NGUYEN TO =====
    @Test
    public void test_2_LaSoNguyenTo() {
        assertTrue(Cau8.laSoNguyenTo(2));
    }

    @Test
    public void test_3_LaSoNguyenTo() {
        assertTrue(Cau8.laSoNguyenTo(3));
    }

    @Test
    public void test_7_LaSoNguyenTo() {
        assertTrue(Cau8.laSoNguyenTo(7));
    }

    @Test
    public void test_13_LaSoNguyenTo() {
        assertTrue(Cau8.laSoNguyenTo(13));
    }

    @Test
    public void test_97_LaSoNguyenTo() {
        assertTrue(Cau8.laSoNguyenTo(97));
    }

    // ===== KHONG PHAI SO NGUYEN TO =====
    @Test
    public void test_100_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(100));
    }

    @Test
    public void test_1_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(1));
    }

    @Test
    public void test_0_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(0));
    }

    @Test
    public void test_4_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(4));
    }

    @Test
    public void test_9_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(9));
    }

    // ===== SO AM =====
    @Test
    public void test_SoAm_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(-7));
    }

    @Test
    public void test_SoAmLon_KhongPhai() {
        assertFalse(Cau8.laSoNguyenTo(-100));
    }
}
