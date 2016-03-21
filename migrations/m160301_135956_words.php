<?php

use yii\db\Migration;
use yii\db\Schema;

class m160301_135956_words extends Migration
{
    public function up()
    {
        $this->createTable('words', [
            'id'        => Schema::TYPE_PK,
            'word'      => Schema::TYPE_STRING . ' NOT NULL',
            'translate' => Schema::TYPE_STRING . ' NOT NULL',
            'month'     => Schema::TYPE_STRING . ' NOT NULL',
            'year'      => Schema::TYPE_INTEGER . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    public function down()
    {
        $this->dropTable('words');
    }
}
