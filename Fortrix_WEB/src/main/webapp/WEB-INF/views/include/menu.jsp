<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="/webproject">HOME</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/webproject/member/login_member.do">TESTCASE1_re</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">TESTCASE2</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/webproject/member/login.do">로그인/로그아웃</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            TESTCASE3
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <li><a class="dropdown-item" href="#">TEST1re</a></li>
            <li><a class="dropdown-item" href="#">TEST2</a></li>
            <li><a class="dropdown-item" href="#">TEST3</a></li>
           
          </ul>
        </li>
         </ul>
        
    </div>
  </div>
</nav>

