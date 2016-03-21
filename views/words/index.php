<?php

use yii\helpers\Html;
use yii\grid\GridView;

/* @var $this yii\web\View */
/* @var $searchModel app\models\WordsSearch */
/* @var $dataProvider yii\data\ActiveDataProvider */

$this->title = 'Words';
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="words-index">

    <h1><?= Html::encode($this->title) ?></h1>
    <?php // echo $this->render('_search', ['model' => $searchModel]); ?>

    <p>
        <?= Html::a('Create Words', ['create'], ['class' => 'btn btn-success']) ?>
    </p>

    <?= GridView::widget([
        'dataProvider' => $dataProvider,
        'filterModel' => $searchModel,
        'columns' => [
            ['class' => 'yii\grid\SerialColumn'],

            'id',
            'word',
            'translate',
            'month',
            'year',

            ['class' => 'yii\grid\ActionColumn'],
        ],
    ]); ?>

</div>
