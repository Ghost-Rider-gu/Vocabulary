<?php

use yii\db\Migration;
use yii\db\Schema;

/**
 * This class of migration for 'resources' table
 *
 * Fields:
 *      id                      - unique identification word
 *      user_id                 - who added the resources
 *      resources_category      - added resource category
 *      resources_data          - resource material
 *      resources_description   - a brief description of the resource
 */
class m160509_184041_resources extends Migration
{
    /**
     * Create table 'resources' (transaction)
     */
    public function safeUp()
    {
        $this->createTable('resources', [
            'id'                    => Schema::TYPE_PK,
            'user_id'               => Schema::TYPE_INTEGER . ' NOT NULL',
            'resources_category'    => Schema::TYPE_STRING  . ' NOT NULL',
            'resources_data'        => Schema::TYPE_STRING  . ' NOT NULL',
            'resources_description' => Schema::TYPE_STRING  . ' NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    /**
     * Rollback data (transaction)
     */
    public function safeDown()
    {
        $this->dropTable('resources');
    }
}
