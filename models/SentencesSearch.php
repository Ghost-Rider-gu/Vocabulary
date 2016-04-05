<?php

namespace app\models;

use Yii;
use yii\base\Model;
use yii\data\ActiveDataProvider;
use app\models\Sentences;

/**
 * SentencesSearch represents the model behind the search form about `app\models\Sentences`.
 */
class SentencesSearch extends Sentences
{
    /**
     * @inheritdoc
     */
    public function rules()
    {
        return [
            [['id', 'year'], 'integer'],
            [['phrase', 'translate', 'month', 'category'], 'safe'],
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
        $query = Sentences::find();

        // add conditions that should always apply here

        $dataProvider = new ActiveDataProvider([
            'query' => $query,
        ]);

        $this->load($params);

        if (!$this->validate()) {
            // uncomment the following line if you do not want to return any records when validation fails
            // $query->where('0=1');
            return $dataProvider;
        }

        // grid filtering conditions
        $query->andFilterWhere([
            'id' => $this->id,
            'year' => $this->year,
        ]);

        $query->andFilterWhere(['like', 'phrase', $this->phrase])
            ->andFilterWhere(['like', 'translate', $this->translate])
            ->andFilterWhere(['like', 'month', $this->month])
            ->andFilterWhere(['like', 'category', $this->category]);

        return $dataProvider;
    }
}
