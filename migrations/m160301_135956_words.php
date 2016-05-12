<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for 'words' table
 *
 * Fields:
 *      id          - unique identification word
 *      user_id     - who added the word
 *      word        - the word
 *      translate   - translation of the word
 *      month       - what month it was added to the word (for static)
 *      year        - what year it was added to the word (for static)
 */
class m160301_135956_words extends Migration
{
    /**
     * Create table 'words' (transaction)
     */
    public function safeUp()
    {
        $this->createTable('words', [
            'id'        => Schema::TYPE_PK,
            'user_id'   => Schema::TYPE_INTEGER . ' NOT NULL',
            'word'      => Schema::TYPE_STRING  . ' NOT NULL',
            'translate' => Schema::TYPE_STRING  . ' NOT NULL',
            'month'     => Schema::TYPE_STRING  . ' NOT NULL',
            'year'      => Schema::TYPE_INTEGER . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    /**
     * Rollback data (transaction)
     */
    public function safeDown()
    {
        $this->dropTable('words');
    }
}
