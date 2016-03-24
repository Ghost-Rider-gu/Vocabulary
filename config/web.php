<?php

$params = require(__DIR__ . '/params.php');

$config = [
    'id' => 'F5LNED', // уникальный индекс приложения
    'basePath' => dirname(__DIR__), // корневая директория приложения

    //'aliases' => [], // настройка псевдонимов
    //'defaultRoute' => 'main/index',
    //'catchAll' => [], // действие контроллера, который будет обрабатывать все входящие запросы (режим обслуживания)
    'bootstrap' => ['log'], // загрузка компонентов, модулей при начальной загрузке приложения (начальную загрузку следует использовать осторожно, так как это снижает скорость загрузки приложения)
    //'controllerMap' => [], // соответствие между ID контроллера и его классом (переопределение или псевдонимы для контроллеров)
    //'controllerNamespace' => [], // наименование пространства имен для классов контроллеров
    'name' => 'Vocabulary', // название приложения
    'language' => 'ru', // язык приложения (для мультиязычных приложений)
    'params' => $params, // глобально доступные параметры приложения
    'timeZone' => 'Europe/Moscow', // временная зона
    'sourceLanguage' => '', // язык на котором написан код приложения
    'version' => '', // версия приложения
    //'modules' => [], // модули приложения
    'components' => [ // регистрация компонентов приложения
        'request' => [
            'cookieValidationKey' => '70RgKOHBAHURB6dI-KDGySxCOL8zjd6h',
        ],
        //настройка хранилища сессий
        //'session' => [
            //'class' => 'yii\web\DbSession',
            // 'db' => 'mydb',  // ID компонента для взаимодействия с БД. По умолчанию 'db'.
            // 'sessionTable' => 'my_session', // название таблицы для хранения данных сессии. По умолчанию 'session'.
        //],
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

        // настройка ЧПУ
       /* 'urlManager' => [
            'enablePrettyUrl' => true,
            'showScriptName' => false,
            'enableStrictParsing' => false,
            'suffix' => '.html',
            'rules' => [
                // настройка правила
                [
                    //'class' => '', // можно указать свой класс для определения маршрута
                    'pattern' => 'words',
                    'route' => 'words/index',
                    //'suffix' => '.html',
                ],
            ],
        ],*/

    ],
];

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

return $config;
