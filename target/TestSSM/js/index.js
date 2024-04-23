$(function(){
	var now = new Date();
	const year = now.getFullYear();
	const month = ('0' + (now.getMonth() + 1)).slice(-2);
	const day = ('0' + now.getDate()).slice(-2);
	const hours = ('0' + now.getHours()).slice(-2);
	const minutes = ('0' + now.getMinutes()).slice(-2);
	const seconds = ('0' + now.getSeconds()).slice(-2);
	const timeStamp = year + month + day + hours + minutes + seconds
	
	$("#txtCustoms_id").val("2231" + timeStamp);
	$("#txtPre_entry_id").val("QTW_" + timeStamp);
	$("#txtD_date").val(year + month + day);
	$("#txtI_e_date").val(year + month + day);


	//给表头部分的input元素绑定blur事件
	$("#index").find("input").keydown(function(event){
		if(event.keyCode == 13){
			console.log("回车")
			//focusNextInput($("#index"),this);
		}
	})


});
//保存报关单表头
function submitForm(){
	console.log($("#index").serialize());
	// $.ajax({
	// 	type:"post",
	// 	url:"/TDhechead/addTDechead",
	// 	data:$("#index").serialize(),
	// 	dataType:"json",
	// 	success:function(){
	// 		console.log("Succeed");
	// 		alert("保存成功！");
	// 	}
	// })
	$.post("/TDhechead/addTDechead",$("#index").serialize(), function(data){
		console.dir(data);
		if(data.status == 200){
			$.messager.alert('提示','新增商品成功!');
		}
	});
	
}

function focusNextInput(element,that){
	var inputs = element.find("input");
	for(var i = 0; i < inputs.length; i++){
		//最后一个input，把焦点移到第一个
		if(i == (inputs.length - 1)){
			//submitForm();
			inputs[0].focus();
			break;
		}else if(that == inputs[i]){
			//下一个input获得焦点
			inputs[i + 1].focus();
			break;
		}else{
			
		}
		
	}
}

