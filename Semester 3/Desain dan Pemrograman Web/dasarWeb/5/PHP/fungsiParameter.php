<?php
//membuat fungsi
function perkenalan($nama, $salam){
    echo $salam.", ";
    echo "Perkenalkan, nama saya $nama <br>";
    echo "Senang berkenalan denganmu <br>";
}

//memanggil fungsi yang sudah dibuat
perkenalan("Hamdana", "Hello");
echo "<hr>";

$saya = "Elok";
$ucapanSalam = "Selamat Pagi";

//memanggil lagi
perkenalan($saya, $$ucapanSalam);
?>