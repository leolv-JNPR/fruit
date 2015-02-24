var Fruit = window.Fruit || {};

Fruit.RestClient = {
	post: function(options, callback){
		callback = callback || options.callback;
		var restUrl = options.url;
		$.post(restUrl, options.params||{}, callback);
	},
	get: function(options, callback){
		callback = callback || options.callback;
		var restUrl = options.url;
		$.get(restUrl, options.params||{}, callback);
	}
};

