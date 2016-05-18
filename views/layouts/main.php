<?php

/* @var $this \yii\web\View */
/* @var $content string */

use yii\helpers\Html;
use app\assets\AppAsset;

AppAsset::register($this);
?>

<?php $this->beginPage() ?>

<!DOCTYPE html>
<html lang="<?= Yii::$app->language ?>">
<head>
    <meta charset="<?= Yii::$app->charset ?>">
    <link rel="stylesheet" href="css/main.css" />
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <?= Html::csrfMetaTags() ?>
    <title><?= Html::encode(Yii::$app->name . ' ' . $this->title) ?></title>
    <?php $this->head() ?>
</head>

<body>
<?php $this->beginBody() ?>

<!-- Header -->
<header id="header">
    <a href="#" class="image avatar"><img src="images/logo.png" alt="" /></a>
    <h1>
        <a href="#"> Словарь </a>
    </h1>
    <h1>
        <a href="#"> Фразы </a>
    </h1>
    <h1>
        <a href="#"> Материалы </a>
    </h1>
    <h1>
        <a href="#"> Вход </a>
    </h1>
    <h1>
        <a href="#"> UserName </a>
    </h1>
    <h1>
        <a href="#"> Выход </a>
    </h1>
    <h1>
        <a href="#"> Личный кабинет </a>
    </h1>
</header>
<!-- /Header -->

<!-- Content -->
<div id="main">
    <?= $content ?>
</div>
<!-- /Content -->

<!-- Footer -->
<footer id="footer">
    <ul class="icons">
        <li><a href="<?= Yii::$app->params['twitter']; ?>" class="icon fa-twitter" target="_blank"><span class="label">Twitter</span></a></li>
        <li><a href="<?= Yii::$app->params['github']; ?>" class="icon fa-github" target="_blank"><span class="label">Github</span></a></li>
        <li><a href="<?= Yii::$app->params['facebook']; ?>" class="icon fa-facebook" target="_blank"><span class="label">Facebook</span></a></li>
        <li><a href="<?= Yii::$app->params['linkedin']; ?>" class="icon fa-linkedin" target="_blank"><span class="label">LinkedIn</span></a></li>
        <li><a href="<?= Yii::$app->params['email']; ?>" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
    </ul>
    <ul class="copyright">
        <li>&copy; SienDev <?= date("Y"); ?></li>
    </ul>
</footer>
<!-- /Footer -->

<?php $this->endBody() ?>
</body>
</html>

<?php $this->endPage() ?>
