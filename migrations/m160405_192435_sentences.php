<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for 'sentences' table
 *
 * Fields:
 *      id          - unique identification word
 *      user_id     - who added the phrase
 *      phrase      - the phrase
 *      translate   - translation of the phrase
 *      month       - what month it was added to the phrase (for static)
 *      year        - what year it was added to the phrase (for static)
 *      category    - category of the phrase
 */
class m160405_192435_sentences extends Migration
{
    /**
     * Create table 'sentences' (transaction)
     */
    public function safeUp()
    {
        $this->createTable('sentences', [
            'id'        => Schema::TYPE_PK,
            'user_id'   => Schema::TYPE_INTEGER . ' NOT NULL',
            'phrase'    => Schema::TYPE_STRING  . ' NOT NULL',
            'translate' => Schema::TYPE_STRING  . ' NOT NULL',
            'month'     => Schema::TYPE_STRING  . ' NOT NULL',
            'year'      => Schema::TYPE_INTEGER . ' NOT NULL',
            'category'  => Schema::TYPE_STRING  . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    /**
     * Rollback data (transaction)
     */
    public function safeDown()
    {
        $this->dropTable('sentences');
    }
}
