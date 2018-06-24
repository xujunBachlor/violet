window.violet
.config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/ahri',{
		templateUrl: './../views/Lovers/lover.html',
		controller: 'loverController'
	})
	.otherwise({
		redirectTo: '/ahri'
	})
}])