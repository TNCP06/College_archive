<?php
    // function tampilHaloDunia(){
    //     echo "Halo Dunia! <br>";

    //     tampilHaloDunia();
    // }

    // tampilHaloDunia();

    function tampilAngka(int $jumlah, int $indeks = 1) {
        echo "Perulangan ke-{$indeks} <br>";

        if ($indeks < $jumlah) {
            tampilAngka($jumlah, $indeks + 1);
    }

    }
    tampilAngka(20);
?>