/**
 * User: Dmitriy Sinenkiy
 * Date: 11.06.13
 * Time: 13:16
 * since 1.0
 */

var subscription = function ($scope, $http) {
    $scope.userData = {};

    $scope.subscribe = function (userData) {
        $scope.resetError();

        $http.post('subscription/register/' + userData).success(function () {
            $scope.firstName = "";
            $scope.lastName = "";
            $scope.gender = "";
            $scope.password = "";
        }).error(function () {
                    $scope.setError("Can't subscribe!")
                });
    };

    $scope.resetError = function () {
        $scope.error = false;
        $scope.errorMessage = '';
    };

    $scope.setError = function (message) {
        $scope.error = true;
        $scope.errorMessage = message;
    };
};
