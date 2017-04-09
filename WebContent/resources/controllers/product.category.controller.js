angular.module('app').controller('ProductCategoryController', function($scope, $http) {
	$scope.productCategories = [];
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
	
	$scope.findAll = function() {
		$http.get('product_category/findAll').success(function(res) {
			console.log(res);
			$scope.productCategories = res;
		}).error(function(e) {
			console.log(e);
		});
	};
	
	$scope.findAll();
	
});