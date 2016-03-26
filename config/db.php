<?php

/**
 * ---------------------------------------------------------------------------------------------------------------------
 *  Config database (MySQL)
 *
 *  class    - connection to a database via PDO
 *  dns      - string connection (driver, host, database name)
 *  username - your login for MySQL
 *  password - your password for MySQL
 *  charset  - encoding
 * ---------------------------------------------------------------------------------------------------------------------
 */

return [
    'class' => 'yii\db\Connection',
    'dsn' => 'mysql:host=localhost;dbname=vocabulary',
    'username' => 'root',
    'password' => '',
    'charset' => 'utf8',
];
