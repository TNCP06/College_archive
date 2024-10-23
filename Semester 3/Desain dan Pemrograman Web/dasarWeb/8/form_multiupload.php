<!DOCTYPE html>
<html>
<head>
    <title>Multiupload Document</title>
</head>
<body>
    <h2>Ungguh Dokumen</h2>
    <form action="proses_upload.php" method="post" enctype="multipart/form-data">
        <input type="file" name="files[]" multiple="multiple" accept=".jpg, .jpeg, .png, .gif">
        <input type="submit" value="Unggah">
    </form>
</body>
</html>