Fruit.Task = function(navId){
    $('#main').load('tasks/'+navId+'.jsp', function(){
        console.log('loaded');
    });
};