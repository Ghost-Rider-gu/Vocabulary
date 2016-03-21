<?php

namespace app\models;

use Yii;

/**
 * This is the model class for table "words".
 *
 * @property integer $id
 * @property string $word
 * @property string $translate
 * @property string $month
 * @property integer $year
 */
class Words extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'words';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['word', 'translate', 'month', 'year'], 'required'],
            [['year'], 'integer'],
            [['word'], 'unique'],
            [['word', 'translate', 'month'], 'string', 'max' => 255]
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'id' => 'ID',
            'word' => 'Word',
            'translate' => 'Translate',
            'month' => 'Month',
            'year' => 'Year',
        ];
    }
}
