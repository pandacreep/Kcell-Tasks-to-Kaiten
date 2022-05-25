<#import "partials/header.ftlh" as main>

<@main.renderWith scripts=["js/card.js"]>

    <div id="containerCard">
        <h1 class="my-3 text-center">Задание создано</h1>
        <br>

        <div class="row flex-wrap">
            <p>Id: ${card.id}</p>
            <p>Title: ${card.title}</p>
            <p>Created: ${card.created}</p>
            <p>Description: <#if card.description??>${card.description}</#if></p>
        </div>
    </div>

</@main.renderWith>