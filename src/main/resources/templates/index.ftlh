<#import "partials/header.ftlh" as main>

<@main.renderWith scripts=[]>

    <div id="containerNewTaskForm">
        <h1 class="my-3 text-center">Инструкции:</h1>
        <p>Для добавления новой задачи</p>
        <p>Выбрать в меню пункт '<a href="/cards/add">Добавить карточку</a>'</p>
        <p>Заполнить поля формы перед отправкой</p>
        <p>Следующие поля являются обязательными для заполнения</p>
        <ul>
            <li>ФИО заказчика</li>
            <li>Код заказчика</li>
            <li>Наименование</li>
            <li>Описание</li>
        </ul>
        <p>Нажать кнопку создать</p>
        <p>Новая задача будет создана в Backlog-е доски Big Data UpStream</p>
    </div>

</@main.renderWith>