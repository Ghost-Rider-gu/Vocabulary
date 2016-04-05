<?php

namespace app\models;

use Yii;

/**
 * This is the model class for table "sentences".
 *
 * @property integer $id
 * @property string $phrase
 * @property string $translate
 * @property string $month
 * @property integer $year
 * @property string $category
 */
class Sentences extends \yii\db\ActiveRecord
{
    /**
     * @inheritdoc
     */
    public static function tableName()
    {
        return 'sentences';
    }

    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['phrase', 'translate', 'month', 'year', 'category'], 'required'],
            [['year'], 'integer'],
            [['phrase', 'translate', 'month', 'category'], 'string', 'max' => 255],
        ];
    }

    /**
     * @inheritdoc
     */
    public function attributeLabels()
    {
        return [
            'id' => 'ID',
            'phrase' => 'Phrase',
            'translate' => 'Translate',
            'month' => 'Month',
            'year' => 'Year',
            'category' => 'Category',
        ];
    }
}
