<#import "partials/header.ftlh" as main>

<@main.renderWith scripts=["js/card.js"]>

    <div id="containerCard">
        <h1 class="my-3 text-center">Тестовый запрос на карточку ${card.id}</h1>
        <br>

        <div class="row flex-wrap">
            <p>Id: ${card.id}</p>
            <p>Title: ${card.title}</p>
            <p>Created: ${card.created}</p>
            <p>Updated: ${card.updated}</p>
            <p>Archived: ${card.archived}</p>
            <p>asap: ${card.asap}</p>
            <p>Due Date: <#if card.due_date??>${card.due_date}</#if></p>
            <p>Sort Order: ${card.sort_order}</p>
            <p>Description: <#if card.description??>${card.description}</#if></p>
            <p>State: ${card.state}</p>
            <p>expires_later: ${card.expires_later}</p>
            <p>board_id: ${card.board_id}</p>
            <p>column_id: ${card.column_id}</p>
            <p>lane_id: ${card.lane_id}</p>
        </div>
    </div>

</@main.renderWith>