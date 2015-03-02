var Fruit = window.Fruit || {};

Fruit.Logger = {
    info: function(){
        if(window['console']){
            window.console.log.apply(window.console, arguments);
        }
    }
};

Fruit.RestClient = {
	post: function(options, callback, failCallback){
		callback = callback || options.callback;
		var restUrl = options.url;
        this.ajax('POST', restUrl, options.params||{}, callback, failCallback);
	},
	get: function(options, callback, failCallback){
		callback = callback || options.callback;
		var restUrl = options.url;
        this.ajax('GET', restUrl, options.params||{}, callback, failCallback);
	},

    /**
     * @private
     * @param type
     * @param url
     * @param options
     * @param callback
     * @param failCallback
     */
    ajax: function(type, url, options, callback, failCallback){
        if(!failCallback){
            failCallback = function(){
                Fruit.Logger.info('Request failed..');
            };
        }
        $.ajax({
            type: type,
            url: url,
            data: options,
            dataType: 'json',
            success: callback,
            error: failCallback
        });
    }
};

Fruit.Navigation = {
    navigateTo: function(navId){
        var task = new Fruit.Task(navId);
    }
};

