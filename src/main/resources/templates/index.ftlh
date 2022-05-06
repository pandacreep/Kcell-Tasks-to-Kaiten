<#import "partials/header.ftlh" as main>

<@main.renderWith scripts=[]>

    <div id="containerNewTaskForm">
        <h1 class="my-3 text-center">Инструкции:</h1>
        <p>Для добавления новой задачи</p>
        <p>Выбрать в меню пункт '<a href="/cards/add">Добавить карточку</a>'</p>
        <p>Заполнить поле <b>Название</b> задачи (обязательно)</p>
        <p>Заполнить поле <b>Описание</b> задачи (обязательно)</p>
        <p>Нажать кнопку создать</p>
        <p>Новая задача будет создана в Backlog-е доски Big Data DownStream</p>
    </div>

</@main.renderWith>