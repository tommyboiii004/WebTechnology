<?php
if ($_SERVER['REQUEST_METHOD'] === 'GET') {
    if (isset($_GET['file'])) {
        $file = $_GET['file'];
        if (file_exists($file)) {
            // Serve the content of the specified XML file
            header('Content-Type: application/xml');
            readfile($file);
        }
    }
} elseif ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $newContent = file_get_contents('php://input');
    file_put_contents($file, $newContent);
}
?>
