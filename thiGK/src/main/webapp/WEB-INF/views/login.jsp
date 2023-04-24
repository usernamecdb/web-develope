<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Đăng nhập hệ thống</title>
    <link rel="stylesheet" href="tainguyen/CSS/style.css">
  </head>
  <body>
    <div class="container">
      <div class="form-container">
        <h1>ĐĂNG NHẬP QUẢN TRỊ HỆ THỐNG ABC</h1>
        <form action="login.html" method="post">
          <div class="form-group">
            <label for="id">Tên đăng nhập</label>
            <input type="text" name="id" id="id" required>
          </div>
          <div class="form-group">
            <label for="pwd">Mật khẩu</label>
            <input type="password" name="pwd" id="pwd" required>
          </div>
          <button type="submit" name="login" id="login">Đăng nhập</button>
        </form>
      </div>
    </div>
  </body>
  
  
</html>


    