// mainMod.js
// define custom module - mainMod

angular.module('translationsModule', ['ngMessages'])

// --------------- CONTROLLERS
	.controller('translationsCtrl', function($scope,$http,$rootScope	) {
		
		//$scope.loadConfigs = function(){
		$http.get("listConfig")
	    .then(function(response) {
	    //	alert(response.data.Translations);
	    	$rootScope.names = response.data.Translations;
	    	})
	    
	})
	.controller('tabsCtrl', function() { 	// scope-less controller
		// default tab
		this.tab = 1;
		// set tab
		this.setTab = function(idx) {
			this.tab = idx;
		};
		// check tab
		this.isTab = function(idx) {
			return (this.tab == idx);
		};
	})
	.controller('addCtrl',['$scope','$rootScope',
		function(scope, rtScope) {
		scope.Translations = {};
			// save handler
			scope.save = function() {
				if(angular.isDefined(scope.review)) {
					rtScope.names.push(scope.Translations);
					scope.Translations = {};
				}
			};
	}]);
