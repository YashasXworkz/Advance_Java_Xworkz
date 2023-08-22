<style>
.nav-link:hover {
  border: 1px solid white; background-color: #dc3545; color: #fff; border-radius: 5px;
}
</style>

<nav class="navbar navbar-expand-lg py-0 border-bottom border-danger border-2" style="background-color: #fee3cd;">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"><img src="stackoverflow-icon.svg" height="40" class="align-middle">stack<span class="fw-bold" style="font-family: monospace;">overflow</span></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav fw-semibold">
        <li class="nav-item"><a class="nav-link" aria-current="page" href="index.jsp">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
        <li class="nav-item"><a class="nav-link" href="display.jsp">View Result</a></li>
      </ul>
      <form class="d-flex ms-auto" action="search" method="post">
        <input class="form-control me-2 border border-danger" type="text" placeholder="Search" name="search" required> <input class="btn btn-danger fw-semibold" type="submit" value="Search">
      </form>
    </div>
  </div>
</nav>