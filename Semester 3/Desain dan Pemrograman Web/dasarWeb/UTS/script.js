// JavaScript untuk membuka dan menutup popup form
document.getElementById('openForm').addEventListener('click', function() {
    document.getElementById('contactPopup').style.display = 'flex';
});

document.getElementById('closeForm').addEventListener('click', function() {
    document.getElementById('contactPopup').style.display = 'none';
});

// Jika pengguna mengklik di luar form, tutup popup
window.onclick = function(event) {
    if (event.target == document.getElementById('contactPopup')) {
        document.getElementById('contactPopup').style.display = 'none';
    }
};

// Tangani form kontak tanpa refresh halaman
document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Mencegah pengiriman form standar

    // Tampilkan notifikasi pesan terkirim
    document.getElementById('formMessage').style.display = 'block'; // Tampilkan pesan berhasil
});