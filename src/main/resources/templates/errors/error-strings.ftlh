<#import "../partials/header.ftlh" as main>

<@main.renderWith scripts=[]>

    <div id="containerError">
        <h1 class="my-3 text-left">Возникла ошибка!</h1>
        <#list strings as string>
            <p>${string}</p>
        </#list>
    </div>

</@main.renderWith>