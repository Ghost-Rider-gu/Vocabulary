<?php

namespace app\models;

use Yii;
use yii\base\Model;
use yii\data\ActiveDataProvider;
use app\models\Words;

/**
 * WordsSearch represents the model behind the search form about `app\models\Words`.
 */
class WordsSearch extends Words
{
    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['id', 'year'], 'integer'],
            [['word', 'translate', 'month'], 'safe'],
        ];
    }

    /**
     * @inheritdoc
     */
    public function scenarios()
    {
        // bypass scenarios() implementation in the parent class
        return Model::scenarios();
    }

    /**
     * Creates data provider instance with search query applied
     *
     * @param array $params
     *
     * @return ActiveDataProvider
     */
    public function search($params)
    {
        $query = Words::find();

        $dataProvider = new ActiveDataProvider([
            'query' => $query,
        ]);

        $this->load($params);

        if (!$this->validate()) {
            // uncomment the following line if you do not want to return any records when validation fails
            // $query->where('0=1');
            return $dataProvider;
        }

        $query->andFilterWhere([
            'id' => $this->id,
            'year' => $this->year,
        ]);

        $query->andFilterWhere(['like', 'word', $this->word])
            ->andFilterWhere(['like', 'translate', $this->translate])
            ->andFilterWhere(['like', 'month', $this->month]);

        return $dataProvider;
    }
}
