<?php

use yii\db\Migration;
use yii\db\Schema;

class m160509_184041_sources extends Migration
{
    public function up()
    {
        $this->createTable('sources', [
            'id'        => Schema::TYPE_PK,

        ], 'ENGINE=InnoDB DEFAULT CHARSET=utf8');
    }

    public function down()
    {
        $this->dropTable('sources');
    }
}
