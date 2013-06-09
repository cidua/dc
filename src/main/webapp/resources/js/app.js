/**
 * User: Dmitriy Sinenkiy
 * Since 1.0
 */

'use strict';

var dc = {};

var App = angular.module('dc');

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/users', {
        templateUrl: 'users/layout',
        controller: UserController
    });

//    $routeProvider.when('/trains', {
//        templateUrl: 'trains/layout',
//        controller: TrainController
//    });
//
//    $routeProvider.when('/railwaystations', {
//        templateUrl: 'railwaystations/layout',
//        controller: RailwayStationController
//    });

    $routeProvider.otherwise({redirectTo: '/users'});
}]);
