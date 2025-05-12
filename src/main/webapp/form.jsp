<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Thông Tin</title>
</head>
<body>
    <h2>Nhập thông tin cá nhân</h2>
    <form action="process" method="post">
        Họ tên: <input type="text" name="hoten" required><br><br>
        Email: <input type="email" name="email" required><br><br>

        Giới tính:<br>
        <input type="radio" name="gioitinh" value="Nam" required> Nam
        <input type="radio" name="gioitinh" value="Nữ"> Nữ<br><br>

        Sở thích:<br>
        <input type="checkbox" name="sothich" value="Đọc sách"> Đọc sách
        <input type="checkbox" name="sothich" value="Du lịch"> Du lịch
        <input type="checkbox" name="sothich" value="Nghe nhạc"> Nghe nhạc<br><br>

        <input type="submit" value="Gửi thông tin">
    </form>
</body>
</html>
