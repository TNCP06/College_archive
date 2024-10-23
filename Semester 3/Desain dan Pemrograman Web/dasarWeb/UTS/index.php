<?php
// Inisialisasi variabel untuk harga ongkir
$ongkir = 0;
$errorMessage = "";
$weight = 0;
$distance = 0;
$service = "";
$messageSent = false;

// Proses perhitungan ongkir
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $weight = isset($_POST['weight']) ? floatval($_POST['weight']) : 0;
    $distance = isset($_POST['distance']) ? intval($_POST['distance']) : 0;
    $service = isset($_POST['service']) ? $_POST['service'] : "";

    // Validasi input
    if ($weight <= 0 || $distance <= 0 || empty($service)) {
        $errorMessage = "Silakan masukkan semua data dengan benar.";
    } else {
        // Tentukan tarif per km berdasarkan jenis layanan
        $basePricePerKg = 0;
        if ($service == "regular") {
            $basePricePerKg = 5000; // Tarif per kg untuk layanan regular
        } elseif ($service == "express") {
            $basePricePerKg = 10000; // Tarif per kg untuk layanan express
        }

        // Hitung ongkir
        $ongkir = $basePricePerKg * $weight * $distance;
    }
}
// Jika form disubmit
if (isset($_POST['name']) && isset($_POST['email']) && isset($_POST['message'])) {
    // Ambil data dari form
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);
    $message = htmlspecialchars($_POST['message']);

    $messageSent = true;
}
?>

<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TNCP Express</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="container">
        <h1>Ongkos Kirim TNCP Express</h1>

        <!-- Kontainer utama untuk layout dua kolom -->
        <div class="main-layout">
            <!-- Kolom kiri untuk teks -->
            <div class="text-column">
                <img src="img\delivery_img.png" alt="delivery image" id="img1">
                <p>Website ini merupakan kalkulator Jasa Pengiriman TNCP Express berdasarkan jarak (km) dan berat (kg)</p>
                <p>Gunakan kalkulator ini untuk menghitung ongkos kirim barang Anda ke berbagai lokasi dengan layanan pengiriman yang kami sediakan.</p>
                <p>Pastikan Anda memasukkan berat barang yang sesuai dan memilih jenis layanan yang diinginkan.</p>
            </div>

            <!-- Kolom kanan untuk form -->
            <div class="form-column">
                <form action="index.php" method="post">
                    <label for="weight">Berat Barang (Kg):</label>
                    <input type="number" id="weight" name="weight" step="0.01" required value="<?php echo $weight; ?>">

                    <label for="distance">Jarak Pengiriman (Km):</label>
                    <input type="number" id="distance" name="distance" required value="<?php echo $distance; ?>">

                    <label for="service">Jenis Layanan:</label>
                    <select id="service" name="service" required>
                        <option value="">Pilih Layanan</option>
                        <option value="regular" <?php if ($service == 'regular') echo 'selected'; ?>>Regular</option>
                        <option value="express" <?php if ($service == 'express') echo 'selected'; ?>>Express</option>
                    </select>

                    <button type="submit">Hitung Ongkir</button>
                </form>

                <!-- Tampilkan hasil ongkir -->
                <?php if ($ongkir > 0): ?>
                    <div class="result">
                        <h2>Hasil Perhitungan Ongkir</h2>
                        <p>Berat Barang: <?php echo $weight; ?> Kg</p>
                        <p>Jarak Pengiriman: <?php echo $distance; ?> Km</p>
                        <p>Layanan: <?php echo ucfirst($service); ?></p>
                        <p><strong>Total Ongkir: Rp <?php echo number_format($ongkir, 0, ',', '.'); ?></strong></p>
                    </div>
                <?php elseif ($errorMessage): ?>
                    <div class="error">
                        <p><?php echo $errorMessage; ?></p>
                    </div>
                <?php endif; ?>
            </div>
        </div>
    </div>
    <!-- Tombol Contact Me yang melayang -->
    <div class="contact-button">
        <button id="openForm">Contact Me</button>
    </div>

    <!-- Popup Form untuk mengirim pesan -->
    <div id="contactPopup" class="popup-form">
        <div class="popup-content">
            <span class="close-button" id="closeForm">&times;</span>
            <h2>Contact Me</h2>
            <form id="contactForm">
                <label for="name">Nama:</label>
                <input type="text" id="name" name="name" required>

                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>

                <label for="message">Pesan:</label>
                <textarea id="message" name="message" required></textarea>

                <button type="submit">Kirim Pesan</button>
            </form>
            <div id="formMessage" style="display: none;">Pesan berhasil dikirim!</div> <!-- Notifikasi -->
        </div>
    </div>
    <script src="script.js"></script>

    <footer>
        <p>&copy; 2024 TNCP Express. All rights reserved.</p>
    </footer>

</body>

</html>