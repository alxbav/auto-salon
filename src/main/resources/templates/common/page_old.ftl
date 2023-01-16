<#macro page>
    <!DOCTYPE html>
    <html lang="en" xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Auto Salon</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
                crossorigin="anonymous"></script>

    </head>
    <body>


    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">QRent Info System</a>
                <button class="navbar-toggler" type="button"
                        data-bs-toggle="collapse"
                        data-bs-target="#navbarNav"
                        aria-controls="navbarNav"
                        aria-expanded="false"
                        aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/home">Home</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/home/add">Home Add</a>
                        </li>


                        <li class="nav-item">
                            <a class="nav-link" href="/driver/link">Links</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="/remont">Remont</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/qrental-cars">Cars</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/driver">Drivers</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/balance">Balance</a>
                        </li>

                        <#--                        <li class="nav-item">-->
                        <#--                            <a class="nav-link active" aria-current="page" href="/">Home</a>-->
                        <#--                        </li>-->
                        <#--                        <li class="nav-item">-->
                        <#--                            <a class="nav-link" href="/available-cars">Available Cars</a>-->
                        <#--                        </li>-->
                        <#--                        <li class="nav-item">-->
                        <#--                            <a class="nav-link" href="/remont">Remont</a>-->
                        <#--                        </li>-->
                        <#--                        <li class="nav-item">-->
                        <#--                            <a class="nav-link" href="/clients">Clients</a>-->
                        <#--                        </li>-->
                        <#--                        <li class="nav-item">-->
                        <#--                            <a class="nav-link" href="/employees">Employees</a>-->
                        <#--                        </li>-->


                    </ul>
                </div>
            </div>

        </nav>


        <#nested>
    </div>

    </body>
    </html>

</#macro>