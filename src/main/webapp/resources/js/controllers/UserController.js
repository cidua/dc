'use strict';

/**
 * UserController
 * @constructor
 */
var UserController = function ($scope, $http) {
	$scope.fetchUserData = function () {
		$http.get('users/userInfo/').success(function (userData) {
			$scope.user = userData;
		});
	};
};