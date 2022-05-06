<#macro renderWith title="Kaiten tasks" scripts=[] styles=[]>

    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <title>${title}</title>

        <link rel="stylesheet" href="/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/common.css">
        <#list styles as styleSource>
            <link rel="stylesheet" href="${styleSource}">
        </#list>
    </head>
    <body>
    <header class="header">
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container container-fluid">
                <svg x="0px" y="0px" width="30px" height="30px" viewBox="0 0 500 500" enable-background="new 0 0 500 500" xml:space="preserve">
                    <g id="outer">
                        <path fill="#EC1C24" d="M250,500L0,250C0,388.072,111.925,500,250,500z"></path>
                        <path fill="#EC1C24" d="M250,0l250,250C500,111.932,388.068,0,250,0z"></path>
                        <path fill="#EC1C24" d="M0,250L250,0C111.925,0,0,111.932,0,250z"></path>
                        <path fill="#EC1C24" d="M250,500c138.068,0,250-111.928,250-250L250,500z"></path>
                    </g>
                    <g id="middle">
                        <path fill="#72F4B2" d="M161.615,338.391l-0.004-176.78C112.796,210.425,112.799,289.574,161.615,338.391z"></path>
                        <path fill="#72F4B2" d="M338.393,338.382c48.808-48.808,48.812-127.957,0-176.771V338.382z"></path>
                        <path fill="#72F4B2" d="M161.61,161.61l176.775-0.003C289.574,112.797,210.425,112.797,161.61,161.61z"></path>
                        <path fill="#72F4B2" d="M161.615,338.391c48.813,48.814,127.957,48.814,176.771,0l0.007-0.009L161.615,338.391z"></path>
                    </g>
                    <path id="inner" fill="#9F57FC" d="M296.874,250c0,25.881-20.991,46.875-46.874,46.875S203.125,275.881,203.125,250 c0-25.883,20.992-46.875,46.875-46.875S296.874,224.117,296.874,250z"></path>
                </svg>
                <a class="d-flex justify-content-around navbar-brand mx-2" href="#">Kaiten</a>
                <div class="d-flex justify-content-end collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/">Инструкции</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="/cards/add">Добавить карточку</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="/cards/0">Тестовый показ карточки</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div class="container">
        <#nested>
    </div>

    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
    <#list scripts as scriptSource>
        <script src="${scriptSource}"></script>
    </#list>

    </body>
    </html>

</#macro>