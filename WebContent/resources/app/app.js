angular.module('app', ['ui.router']).config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/");
	
	 $stateProvider
     .state('home', {
         url: '/',
         templateUrl: 'resources/views/index.view.html',
         controller: 'Home.IndexController'
     })
     .state('product-category', {
    	 url: '/product-category',
    	 templateUrl: 'resources/views/product_category.html',
         controller: 'ProductCategoryController'
     })
     .state('product', {
    	 url: '/product',
    	 templateUrl: 'resources/views/product.html',
         controller: 'ProductController'
     });
});