<!DOCTYPE html>
<html lang="en">
<head>
    <title>Form Input PHP</title>
</head>
<body>
    <h2>Form Input PHP</h2>
    <form action="proses_form.php" method="POST">
        <label for="nama">Nama : </label>
        <input type="text" name="nama" required><br><br>

        <label for="email">Email : </label>
        <input type="email" name="email" id="email" required><br><br>

        <input type="submit" name="sumbit" value="submit">
    </form>
</body>
</html>