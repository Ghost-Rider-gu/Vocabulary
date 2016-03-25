<?php

/**
 * -----------------------------------------------------------------
 *  Config database (MySQL)
 *
 *  dns - string connection
 *  username - your login for MySQL
 *  password - your password for MySQL
 *  charset  - encoding
 *  tablePrefix - not use
 * -----------------------------------------------------------------
 */

return [
    'class' => 'yii\db\Connection',
    'dsn' => 'mysql:host=localhost;dbname=vocabulary',
    'username' => 'root',
    'password' => '',
    'charset' => 'utf8',
];
