<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" text="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
    </script>
    <script>
        $(document).ready(function(){
            $("#flip").click(function(){
                    $("#panel").slideToggle("slow");
                });
            });
    </script>
    <title>Data Mahasiswa</title>
</head>
<body>
    <h1 >DATA SISWA</h1>
    <div id="flip">Click to Show Database</div>
    <div id="panel">
    <table>
        <tr>
            <th>Nama</th>
            <th>Umur</th>
            <th>Kelas</th>
            <th>Alamt</th>
        </tr>
        <?php
            $mhs = array(
                array("Zeta", 18, "12J", "Malang"),
                array("Takina", 17, "12C", "Batu"),
                array("Chisato", 16, "11B", "Anggrek"),
                array("Vestia", 15, "10A", "Flamingo")
            );
            
                foreach($mhs as $mhs_list){
                    echo "<tr>";
                        echo "<td>" . $mhs_list[0] . "</td>";
                        echo "<td>" . $mhs_list[1] . "</td>";
                        echo "<td>" . $mhs_list[2] . "</td>";
                        echo "<td>" . $mhs_list[3] . "</td>";
                    echo "</tr>";
                }
                
                echo "</tr>";

                ?>
    </table>
        <?php
            $usia = 0;
            foreach($mhs as $mhs_list){
                $usia += $mhs_list[1];
            }
            $avg_usia = $usia / count($mhs);
            echo "<h2>Rata - Rata Umur Siswa: {$avg_usia}</h2>";
        ?>
    </div>
    <div class="bottomRight"></div>
</body>
</html>