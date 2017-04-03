angular.module('app').controller('ProductCategoryController', function($scope, $http) {
	
	$scope.save = function() {
		console.log($scope.categoryName);
		$http.post('product_category/save', { categoryName: $scope.categoryName }).success(function(response) {
			if (response.status) {
				alert('บันทึกข้อมูลสำเร็จ');
				$scope.categoryName = '';
			} else {
				alert('บันทึกข้อมูลไม่สำเร็จ');
			}
		}).error(function(e) {
			console.log(e);
		});
	};
});