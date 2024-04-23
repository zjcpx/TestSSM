
$(document).ready(function () {

	//初始化表格,动态从服务器加载数据  
    $("#table_list").bootstrapTable({
		locale: 'zh-CN',
		//使用get请求到服务器获取数据
        method: "GET",
        //必须设置，不然request.getParameter获取不到请求参数
        contentType: "application/x-www-form-urlencoded",
        //获取数据的Servlet地址  
        url: "/TDhechead/pagedQuery",
        //表格显示条纹  
        striped: true,
        //启动分页  
        pagination: true,
        sortable: true,      //是否启用排序
        sortOrder: "asc",     //排序方式
        showColumns: true,                  //是否显示所有的列
        //每页显示的记录数  
        pageSize1: 10,
        //当前第几页  
        pageNumber1: 1,
        //记录数可选列表  
        pageList: [2, 5, 10, 15, 20, 25],
        //是否启用查询  
        //search: true,
        //是否启用详细信息视图  与detailFormatter 结合使用，detailFormatter为显示的具体字段名称
        //detailView:true,
        //detailFormatter:detailFormatter,
        //表示服务端请求  
        sidePagination: "server",
        //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
        //设置为limit可以获取limit, offset, search, sort, order  
        queryParamsType: "undefined",
        //得到查询的参数
        queryParams : function (params) {
            //console.log(params);
            var temp = $("#query_form").serializeJSON();
            //console.log(temp);
            temp["sortName"]= params.sortName,
            temp["sortOrder"]= params.sortOrder,
            temp["page"]= params.pageNumber,
            temp["rows"]= params.pageSize;
            //console.log(temp);
            return temp;
        },
		onLoadSuccess: function (data) {
	       $('.fixed-table-loading').hide();
  
	    },
        //json数据解析
        responseHandler: function(data) {
			// console.dir(data);
            if(data.code == 200){
                return {
                    "rows": data.resultList,
                    "total": data.count
                };
            }else{
                console.log("接口异常。。。。。。");
            }
        },
        //数据列
        columns: [{
				field: '',
	            title: '序号',
	            sortable: true,
	            align: "center",
	            width: 40,
	            formatter: function (value, row, index) {
	                return index + 1;
	            }
			},{
	            title: "流水号",
	            field: "id" ,
	            sortable: true,
				formatter: function(value) {
	                
	                return '<a href = "javascript:void(0)" onclick="getBillDetail('+value+')">'+value+'</a>';
	            }
			},{
	            title: "预录单号",
	            field: "preentryid" ,
	            sortable: true,
				formatter: function(value) {
	                
	                return '<a href = "">'+value+'</a>';
	            }
			},{
	            title: "QA",
	            field: "" ,
	            sortable: true,
				formatter: function(value) {
					// console.log(value);
					if(value== null)
	                return value;
	            }
			},{
	            title: "提单号",
	            field: "billno" ,
	            sortable: true,
				formatter: function(value) {

	                return '<a href = "">'+value+'</a>';
	            }
			},{
	            title: "运输工具名称及航次号",
	            field: "shipnameen" ,
	            sortable: true,
				formatter: function(value) {

	                return '<a href = "">'+value+'</a>';
	            }

			},{
	            title: "认领",
	            field: "" ,
	            sortable: true,
				formatter: function(value) {

	                return '<a href = "">认领</a>';
	            }
			 }]
		});
	});

function getBillDetail(event){
	window.location.href = "refilled.jsp?id="+event;
}
