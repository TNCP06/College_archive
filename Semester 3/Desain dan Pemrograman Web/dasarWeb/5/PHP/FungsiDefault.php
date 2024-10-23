<?php
//membuat fungsi
function perkenalan($nama, $salam="Assalamualaikum"){
    echo $salam.", ";
    echo "Perkenalkan, nama saya".$nama."<br/>";
    echo "Senang berkenalan denganmu <br/>";
}

//memanggil fungsi yang sudah dibuat
perkenalan("Hamdana", "Hallo");

echo"<hr>";

$saya = "Elok";
$ucapanSalam = "Selamat Pagi";

//memanggil lagi tanpa mengisi parameter salam

perkenalan($saya);
?>