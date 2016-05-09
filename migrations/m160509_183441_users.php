<?php

use yii\db\Migration;
use yii\db\Schema;

class m160509_183441_users extends Migration
{
    public function up()
    {
        $this->createTable('users', [
            'id'        => Schema::TYPE_PK,

        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    public function down()
    {
        $this->dropTable('users');
    }
}
