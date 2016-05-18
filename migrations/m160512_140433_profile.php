<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for 'profile' table
 *
 * Fields:
 *      id          - unique identification word
 *      user_id     - user profile
 *      nickname    - user login (register)
 *      email       - user email (or empty)
 *      website     - user website (or empty)
 *      avatar      - user pict (or empty)
 *      realname    - user real name (or empty)
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
            'nickname'  => Schema::TYPE_STRING  . ' NOT NULL',
            'email'     => Schema::TYPE_STRING  . ' NULL',
            'website'   => Schema::TYPE_STRING  . ' NULL',
            'avatar'    => Schema::TYPE_STRING  . ' NULL',
            'realname'  => Schema::TYPE_STRING  . ' NULL',
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
