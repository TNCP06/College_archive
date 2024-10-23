<?php
if (isset($_POST["submit"])) {
    $targetdir = "uploads/";
    $targetfile = $targetdir . basename($_FILES["myfile"]["name"]);
    $fileType = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

    $allowedExtensions = array("txt", "pdf", "doc", "pdf", "pptx");
    $maxsize = 3 * 1024 * 1024;

    if (in_array($fileType, $allowedExtensions) && $_FILES["myfile"]["size"] <= $maxsize) {
        if (move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)) {
            echo "File uploaded successfully";

            // if ($fileType == "jpg" || $fileType == "jpeg" || $fileType == "png") {
            //     echo "<br><br>Thumbnail:<br>";
            //     echo "<img src='$targetfile' width='200' alt='Thumbnail'>";
            // }
        } else {
            echo "Error uploading file";
        }
    } else {
        echo "File tidak valid melebihi ukuran maksimum yang diizinkan";
    }
}
?>