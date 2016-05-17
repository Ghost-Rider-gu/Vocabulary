<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for 'profile' table
 *
 * Fields:
 *
 */
class m160512_140433_profile extends Migration
{
    /**
     * Create table 'profile' (transaction)
     */
    public function safeUp()
    {
        $this->createTable('profile', [
            'id'        => Schema::TYPE_PK,
            'user_id'   => Schema::TYPE_INTEGER . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    /**
     * Rollback data (transaction)
     */
    public function safeDown()
    {
        $this->dropTable('profile');
    }
}
