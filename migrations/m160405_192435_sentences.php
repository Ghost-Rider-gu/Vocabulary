<?php

use yii\db\Migration;
use yii\db\Schema;

class m160405_192435_sentences extends Migration
{
    public function up()
    {
        $this->createTable('sentences', [
            'id'        => Schema::TYPE_PK,
            'phrase'    => Schema::TYPE_STRING  . ' NOT NULL',
            'translate' => Schema::TYPE_STRING  . ' NOT NULL',
            'month'     => Schema::TYPE_STRING  . ' NOT NULL',
            'year'      => Schema::TYPE_INTEGER . ' NOT NULL',
            'category'  => Schema::TYPE_STRING  . ' NOT NULL',
        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    public function down()
    {
        $this->dropTable('sentences');
    }
}
