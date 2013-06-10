/**
 * User: Dmitriy Sinenkiy
 * Since 1.0
 */

'use strict';

var dc = {};

var App = angular.module('dc', ['dc.filters', 'dc.services', 'dc.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/users', {
        templateUrl: 'users/layout',
        controller: UserController
    });

//    $routeProvider.otherwise({redirectTo: '/users'});
}]);
