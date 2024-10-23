<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $names = $_POST['name'];
    $lastNames = $_POST['lastName'];
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submitted Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <h1 class="text-center">Submitted Data</h1>
    <div class="center-table">
        <div class="table-container">
            <table class="table table-bordered table-striped">
                <thead class="table-dark">
                    <tr>
                        <th>Name</th>
                        <th>Last Name</th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                for ($i = 0; $i < count($names); $i++) {
                    echo "<tr>";
                    echo "<td>" . htmlspecialchars($names[$i]) . "</td>";
                    echo "<td>" . htmlspecialchars($lastNames[$i]) . "</td>";
                    echo "</tr>";
                }
                ?>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>
<?php
} else {
    echo "No data submitted.";
}
?>