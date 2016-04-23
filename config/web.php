<?php

/**
 * ---------------------------------------------------------------------------------------------------------------------
 *  Main config application.
 *
 *  id           - unique identifier of the application
 *  basePath     - root directory of the application
 *  bootstrap    - loading of components, modules at boot applications
 *                 (initial charge should be used cautiously, as it reduces the application download speeds)
 *  name         - application name
 *  language     - application language (for multilingual)
 *  params       - globally available application settings
 *  timeZone     - setting a time zone
 *  version      - version of the application
 *  components   - registration application components
 *  request      - for query processing component
 *  cache        - config caching
 *  user         - user management
 *  errorHandler - error processing
 *  mailer       - config mailing
 *  log          - config log application
 *  db           - config database
 * ---------------------------------------------------------------------------------------------------------------------
 */

$params = require(__DIR__ . '/params.php');

$config = [
    'id'       => 'F5LNED',
    'basePath' => dirname(__DIR__),

    'bootstrap' => ['log'],
    'params'    => $params,

    'name'     => 'Vocabulary',
    'language' => 'ru-RU',
    'timeZone' => 'Europe/Moscow',
    'version'  => '0.1b',

    'components' => [
        'request' => [
            'cookieValidationKey' => '70RgKOHBAHURB6dI-KDGySxCOL8zjd6h',
        ],
        'cache' => [
            'class' => 'yii\caching\FileCache',
        ],
        'user' => [
            'identityClass' => 'app\models\User',
            'enableAutoLogin' => true,
        ],
        'errorHandler' => [
            'errorAction' => 'site/error',
        ],
        'mailer' => [
            'class' => 'yii\swiftmailer\Mailer',
            'useFileTransport' => true,
        ],
        'log' => [
            'traceLevel' => YII_DEBUG ? 3 : 0,
            'targets' => [
                [
                    'class' => 'yii\log\FileTarget',
                    'levels' => ['error', 'warning'],
                ],
            ],
        ],
        'db' => require(__DIR__ . '/db.php'),
    ],
];

//----------------------------------------------------------------------------------------------------------------------
// Connection module debug and code generator (gii) (sample - localhost:80/your path site/web/index.php?r=gii)
if (YII_ENV_DEV) {
    $config['bootstrap'][] = 'debug';
    $config['modules']['debug'] = [
        'class' => 'yii\debug\Module',
    ];

    $config['bootstrap'][] = 'gii';
    $config['modules']['gii'] = [
        'class' => 'yii\gii\Module',
    ];
}
//----------------------------------------------------------------------------------------------------------------------

return $config;
