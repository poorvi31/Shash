<%-- 
    Document   : notification
    Created on : 29-Nov-2023, 1:26:53 am
    Author     : NexGen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>Sidebar Menu | Side Navigation Bar</title>
    <!-- CSS -->
    <link rel="stylesheet" href="../css/sidebar.css" />
    <!-- Boxicons CSS -->
    <link
      href="https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <nav>
      <div class="logo">
        <i class="bx bx-menu menu-icon"></i>
        <span class="logo-name">SHASHWAT</span>
      </div>
      <div class="sidebar">
        

        <div class="sidebar-content">
          <ul class="lists">
            <li class="list">
              <a href="newpost.jsp" class="nav-link">
                <i class="bx bx-pointer icon"></i>
                <span class="link">+ New Post</span>
              </a>
            </li>
            <li class="list">
                <a href="profile.html" class="nav-link">
                  <i class="bx bx-user-pin icon"></i>
                  <span class="link">My Profile</span>
                </a>
              </li>
            <li class="list">
                <a href="myblog.jsp" class="nav-link">
                <i class="bx bx-book-alt icon"></i>
                <span class="link">My Blog</span>
              </a>
            </li>
            <li class="list">
                <a href="notification.jsp" class="nav-link">
                <i class="bx bx-bell icon"></i>
                <span class="link">Notifications</span>
              </a>
            </li>
            
            <li class="list">
                <a href="subscription.jsp" class="nav-link">
                <i class="bx bxs-user-badge icon"></i>
                <span class="link">Get Premium</span>
              </a>
            </li>
            <li class="list">
                <a href="likes.jsp" class="nav-link">
                <i class="bx bx-heart icon"></i>
                <span class="link">Likes</span>
              </a>
            </li>
            <li class="list">
                <a href="myreadinglist.jsp" class="nav-link">
                <i class="bx bx-list-check icon"></i>
                <span class="link">My Reading List</span>
              </a>
            </li>
            <li class="list">
                <a href="#" class="nav-link">
                  <i class="bx bx-cog icon"></i>
                  <span class="link">Settings</span>
                </a>
              </li>
              <li class="list">
                <a href="#" class="nav-link">
                  <i class="bx bx-log-out icon"></i>
                  <span class="link">Logout</span>
                </a>
              </li>
          </ul>

         
        </div>
      </div>
    </nav>

    <section class="overlay"></section>

    <script src="../js/sidebar.js"></script>
  </body>
</html>
