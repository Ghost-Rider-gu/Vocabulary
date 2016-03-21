<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\Words */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="words-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'word')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'translate')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'month')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'year')->textInput() ?>

    <div class="form-group">
        <?= Html::submitButton($model->isNewRecord ? 'Create' : 'Update', ['class' => $model->isNewRecord ? 'btn btn-success' : 'btn btn-primary']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
