<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\SentencesSearch */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="sentences-search">

    <?php $form = ActiveForm::begin([
        'action' => ['index'],
        'method' => 'get',
    ]); ?>

    <?= $form->field($model, 'id') ?>

    <?= $form->field($model, 'phrase') ?>

    <?= $form->field($model, 'translate') ?>

    <?= $form->field($model, 'month') ?>

    <?= $form->field($model, 'year') ?>

    <?php // echo $form->field($model, 'category') ?>

    <div class="form-group">
        <?= Html::submitButton('Search', ['class' => 'btn btn-primary']) ?>
        <?= Html::resetButton('Reset', ['class' => 'btn btn-default']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
