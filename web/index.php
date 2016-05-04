<?php
/**
 * ---------------------------------------------------------------------------------------------------------------------
 * Init our web application
 *
 * This is the entry point.
 * Here we set the debug mode and indicate that we have a development environment.
 * It is necessary to yii output all errors. At the end of the development and debugging of the application,
 * we need to remove the debug mode and set the environment in the production.
 * Next we connect itself yii and application settings.
 * We create an instance of the application and then run it.
 * ---------------------------------------------------------------------------------------------------------------------
 */

// Turn on debug mode (only development)
defined('YII_DEBUG') or define('YII_DEBUG', true);

// Set development environment (after dev change to production)
defined('YII_ENV') or define('YII_ENV', 'dev');

// Connect autoload lib
require(__DIR__ . '/../vendor/autoload.php');

// Connect Yii
require(__DIR__ . '/../vendor/yiisoft/yii2/Yii.php');

// Set application config
$config = require(__DIR__ . '/../config/web.php');

// Create app and run it
(new yii\web\Application($config))->run();
