<?php

/* @var $this yii\web\View */

$this->title = '- Главная';
?>

<div>

    <section id="one">
        <header class="major">
            <h2>Статистические данные</h2>
        </header>
        <p>Общая статистика по пользователям, словам, фразам, ресурсам</p>
    </section>

    <section id="two">
    </section>

    <section id="three">
        <h2> Обратная связь </h2>
        <div class="row">
            <div class="8u 12u$(small)">
                <form method="post" action="#">
                    <div class="row uniform 50%">
                        <div class="6u 12u$(xsmall)"><input type="text" name="name" id="name" placeholder="Имя" /></div>
                        <div class="6u$ 12u$(xsmall)"><input type="email" name="email" id="email" placeholder="Email" /></div>
                        <div class="12u$"><textarea name="message" id="message" placeholder="Сообщение" rows="4"></textarea></div>
                    </div>
                </form>
                <ul class="actions">
                    <li><input type="submit" value="Отправить" /></li>
                </ul>
            </div>
        </div>
    </section>

</div>
