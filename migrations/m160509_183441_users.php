<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for users table (type in console - yii migrate/create users)
 * Format class name - mYYMMDD_HHMMSS_YourName (m + Year(2 last number) + Month(2 number) + Day(2 nubmer)_ + hours + minutes + seconds_ + your type name)
 * Use abstract class Schema, to use abstract types that migration was independent of the database
 *
 * Fields:
 *      id          - unique identification
 *      login       - user login
 *      password    - user password
 */
class m160509_183441_users extends Migration
{
    /**
     * Create table 'users'
     * Wrapper to transaction (safeUp instead up)
     */
    public function safeUp()
    {
        $this->createTable('users', [
            'id'        => Schema::TYPE_PK,
            'login'     => Schema::TYPE_STRING . ' NOT NULL',
            'password'  => Schema::TYPE_STRING . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    /**
     * Rollback data
     * To indicate that migration is irreversible, it is necessary to return false (return false;)
     * Wrapper to transaction (safeDown instead down)
     */
    public function safeDown()
    {
        $this->dropTable('users');
    }
}
