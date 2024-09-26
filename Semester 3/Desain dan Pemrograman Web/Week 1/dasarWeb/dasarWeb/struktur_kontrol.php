<?php
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf: A";
} elseif ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} elseif ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf: D";
}
echo "<br>";

$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}

echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";
echo "<br>";

$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah";
echo "<br>";

$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "Total skor ujian adalah: $totalSkor";
echo "<br>";

$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (Tidak lulus) <br>";
        continue;
    }
    echo "Nilai: $nilai (Lulus) <br>";
}

$totalNilai = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
$jumlahNilai = 0;

$max = max($totalNilai);
$max2 = 0;
for ($i=0; $i < count($totalNilai); $i++) { 
    $max2 = $max;
    if ($max < $totalNilai[$i]) {
        $max = $totalNilai[$i];
    }
    $jumlahNilai += $totalNilai[$i];
}

$min = 0;
$min2 = 0;
for ($i=0; $i < count($totalNilai)-1; $i++) { 
    if ($totalNilai[$i+1] < $totalNilai[$i]) {
        $min2 = $min;
        $min = $totalNilai[$i+1];
    }
}

$jumlahNilai -= $max - $max2 - $min - $min2;
$rataRataNilai = $jumlahNilai / (count($totalNilai)-4);

echo "Nilai Max 1: $max <br>";
echo "Nilai Max 2: $max2 <br>";
echo "Nilai Min 1: $min <br>";
echo "Nilai Min 2: $min2 <br>";
echo "Jumlah Nilai: $jumlahNilai <br>";
echo "Rata-rata Nilai: $rataRataNilai <br>";

