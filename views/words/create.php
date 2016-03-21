<?php

use yii\helpers\Html;


/* @var $this yii\web\View */
/* @var $model app\models\Words */

$this->title = 'Create Words';
$this->params['breadcrumbs'][] = ['label' => 'Words', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="words-create">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
