function initNavTree() {
    var navData = new kendo.data.HierarchicalDataSource({
        data: [
            { text: "商品管理", expanded:true, items: [
                { text: "水果种类", navId: 'fruitType' },
                { text: "水果管理", navId: 'fruit' }
            ] },
            { text: "订单管理", expanded:true, items: [
                { text: "订单管理", navId: 'order' }
            ] },
            { text: "用户管理", expanded:true, items: [
                { text: "普通用户管理", navId: 'user' },
                { text: "后台用户管理", navId: 'adminUser' }
            ]}
        ]
    });



    $("#nav_tree").kendoTreeView({
        dataSource: navData,
        select: function(e){
            if(this.dataItem(e.node).navId)
                Fruit.Navigation.navigateTo(this.dataItem(e.node).navId);
        }
    });

}