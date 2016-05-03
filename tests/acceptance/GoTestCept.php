<?php 
$I = new AcceptanceTester($scenario);
$I->wantTo('Load page');
$I->amOnPage('/words');
$I->see('Vocabulary');
