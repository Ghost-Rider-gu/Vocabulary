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
 *  extensions   - app extensions
 *  components   - registration application components
 *      request      - for query processing component
 *      cache        - config caching
 *      user         - user management
 *      i18n         - localization
 *      errorHandler - error processing
 *      mailer       - config mailing
 *      log          - config log application
 *      db           - config database
 *      eauth        - authorization from social net
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

    'extensions' => require(__DIR__ . '/../vendor/yiisoft/extensions.php'),

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

        'i18n' => [
            'translations' => [
                'app*' => [
                    'class' => 'yii\il8n\PhpMessageSource',
                    'basePath' => '@app/messages',
                    'fileMap' => [
                        'app'       => 'app.php',
                        'app_error' => 'error.php',
                    ]
                ],
                'eauth' => [
                    'class' => 'yii\i18n\PhpMessageSource',
                    'basePath' => '@eauth/messages',
                ],
            ],
        ],

        'eauth' => [
            'class' => 'nodge\eauth\EAuth',
            'popup' => true,
            'cache' => false,
            'cacheExpire' => 0,
            'services' => [
                'google_oauth' => [
                    'class' => 'nodge\eauth\services\GoogleOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                    'title' => 'Google',
                ],
                'facebook' => [
                    'class' => 'nodge\eauth\services\FacebookOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                ],
                'twitter' => [
                    'class' => 'nodge\eauth\services\TwitterOAuth1Service',
                    'key' => '...',
                    'secret' => '...',
                ],
                'yahoo' => [
                    'class' => 'nodge\eauth\services\YahooOpenIDService',
                ],
                'linkedin_oauth2' => [
                    'class' => 'nodge\eauth\services\LinkedinOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                    'title' => 'LinkedIn (OAuth2)',
                ],
                'yandex_oauth' => [
                    'class' => 'nodge\eauth\services\YandexOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                    'title' => 'Yandex',
                ],
                'vkontakte' => [
                    'class' => 'nodge\eauth\services\VKontakteOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                ],
                'mailru' => [
                    'class' => 'nodge\eauth\services\MailruOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                ],
                'odnoklassniki' => [
                    'class' => 'nodge\eauth\services\OdnoklassnikiOAuth2Service',
                    'clientId' => '...',
                    'clientSecret' => '...',
                    'clientPublic' => '...',
                    'title' => 'Odnoklas.',
                ],
            ]
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
