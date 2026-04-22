package cau3;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class Cau3Test {
 
    // ===== PHEP CONG =====
    @Test
    public void testCong_HaiSoDuong() {
        assertEquals(15.0, Cau3.tinh(10, 5, '+'), 0.001);
    }
 
    @Test
    public void testCong_HaiSoAm() {
        assertEquals(-8.0, Cau3.tinh(-5, -3, '+'), 0.001);
    }
 
    @Test
    public void testCong_SoThuc() {
        assertEquals(4.0, Cau3.tinh(1.5, 2.5, '+'), 0.001);
    }
 
    @Test
    public void testCong_VoiKhong() {
        assertEquals(0.0, Cau3.tinh(0, 0, '+'), 0.001);
    }
 
    // ===== PHEP TRU =====
    @Test
    public void testTru_HaiSoDuong() {
        assertEquals(5.0, Cau3.tinh(10, 5, '-'), 0.001);
    }
 
    @Test
    public void testTru_KetQuaAm() {
        assertEquals(-3.0, Cau3.tinh(2, 5, '-'), 0.001);
    }
 
    @Test
    public void testTru_SoThuc() {
        assertEquals(0.5, Cau3.tinh(1.5, 1.0, '-'), 0.001);
    }
 
    // ===== PHEP NHAN =====
    @Test
    public void testNhan_HaiSoDuong() {
        assertEquals(50.0, Cau3.tinh(10, 5, '*'), 0.001);
    }
 
    @Test
    public void testNhan_SoAm() {
        assertEquals(-15.0, Cau3.tinh(-5, 3, '*'), 0.001);
    }
 
    @Test
    public void testNhan_VoiKhong() {
        assertEquals(0.0, Cau3.tinh(10, 0, '*'), 0.001);
    }
 
    @Test
    public void testNhan_HaiSoAm() {
        assertEquals(15.0, Cau3.tinh(-5, -3, '*'), 0.001);
    }
 
    // ===== PHEP CHIA =====
    @Test
    public void testChia_HaiSoDuong() {
        assertEquals(2.0, Cau3.tinh(10, 5, '/'), 0.001);
    }
 
    @Test
    public void testChia_KetQuaThapPhan() {
        assertEquals(3.5, Cau3.tinh(7, 2, '/'), 0.001);
    }
 
    @Test
    public void testChia_KhongChiaSoKhacKhong() {
        assertEquals(0.0, Cau3.tinh(0, 5, '/'), 0.001);
    }
 
    @Test
    public void testChia_SoAm() {
        assertEquals(-2.0, Cau3.tinh(-10, 5, '/'), 0.001);
    }
 
    // ===== NGOAI LE =====
    @Test
    public void testChia_ChoKhong_NemException() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> {
            Cau3.tinh(10, 0, '/');
        });
        assertEquals("Chia cho 0", ex.getMessage());
    }
 
    @Test
    public void testPhepTinhKhongHopLe_NemException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Cau3.tinh(10, 5, '%');
        });
        assertEquals("Phep tinh khong hop le", ex.getMessage());
    }
 
    @Test
    public void testPhepTinhKhacKhongHopLe_NemException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Cau3.tinh(10, 5, '^');
        });
    }
}