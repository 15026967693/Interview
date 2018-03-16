require.config({
    paths: {
        jquery: "lib/jquery/jquery.min",
        bootstrap: "lib/bootstrap/bootstrap-js/bootstrap.min",
        angular:"lib/angularjs/angular.min"
    },
    shim: {
        bootstrap:{
            deps: ['jquery']
        },
        angular:{ 
        	exports: 'angular'
        		}

    }
});
define(['bootstrap','jquery','angular'],function(_,$){
	$('body').append(`<button class='btn btn-primary'>eeee</button>`)
	console.log(angular)
})
