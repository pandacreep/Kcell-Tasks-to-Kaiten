<#import "partials/header.ftlh" as main>

<@main.renderWith scripts=[]>

    <div id="containerNewTaskForm">
        <h1 class="my-3 text-center">Добавить новую задачу</h1>
        <br>
        <form action="/cards/add" method="post">
            <#if errors??>
                <div class="alert alert-danger">
                    <#list errors as fieldError>
                        <#if fieldError.field == 'customerName'>
                            <p class="text-danger my-0">${fieldError.defaultMessage!'-- no message --'}</p>
                        </#if>
                    </#list>
                    <#list errors as fieldError>
                        <#if fieldError.field == 'customerCode'>
                            <p class="text-danger my-0">${fieldError.defaultMessage!'-- no message --'}</p>
                        </#if>
                    </#list>
                    <#list errors as fieldError>
                        <#if fieldError.field == 'title'>
                            <p class="text-danger my-0">${fieldError.defaultMessage!'-- no message --'}</p>
                        </#if>
                    </#list>
                    <#list errors as fieldError>
                        <#if fieldError.field == 'description'>
                            <p class="text-danger my-0">${fieldError.defaultMessage!'-- no message --'}</p>
                        </#if>
                    </#list>
                </div>
            </#if>

            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">ФИО заказчика <span class="required">(обязательно)</span></span>
                </div>
                <div class="col-4">
                    <input type="text" name="customerName" style="width: 100%">
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Код заказчика <span class="required">(обязательно)</span></span>
                </div>
                <div class="col-4">
                    <input type="text" name="customerCode" style="width: 100%">
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Наименование <span class="required">(обязательно)</span></span>
                </div>
                <div class="col-4">
                    <input type="text" name="title" style="width: 100%">
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Описание задачи <span class="required">(обязательно)</span></span>
                </div>
                <div class="col-4">
                    <textarea name="description" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Что ожидаете на выходе? Что будет считаться готовой задачей?</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionExpectedResult" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Какие данные есть?</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionInputData" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Есть ли разметка данных?</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionDataLabeling" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Гипотеза/назначение</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionTarget" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Экономический эффект от выполнения задачи</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionFinancialImpact" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Как часто нужна выгрузка?</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionFrequency" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="row mt-2">
                <div class="col-2">
                    <span class="label-input-text">Дополнительная информация</span>
                </div>
                <div class="col-4">
                    <textarea name="descriptionExtraInfo" cols="20" rows="4" style="width: 100%"></textarea>
                </div>
            </div>
            <div class="mt-3">
                <button class="btn btn-primary" type="submit">Добавить задачу</button>
            </div>
        </form>
        <br>
        <br>
    </div>

</@main.renderWith>