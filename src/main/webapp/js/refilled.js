$(function(){
  // 从sessionStorage获取数据
  const param = window.location.search;
  var id = param.split("=")[1];
  $.ajax({
    url: "/TDhechead/getTDechead", //要请求的后端地址
    type: "GET", //数据发送的方式(POST或者GET)
    data: {"id":parseInt(id)}, //需要传递的参数
    dataType: "json", //后端返回的数据格式
    success: function (data) {//ajax请求成功后触发的方法
      var inputs = $("#index input");
      for (let i = 0; i < inputs.length; i++) {
        var nameStr = inputs[i].name;
        $("input[name='"+nameStr+"']").val((data.data)[nameStr]);
      }
    },
    error: function () {//ajax请求失败后触发的方法
      console.log('Send Request Fail..');
    }
  });
  //表头部分
  $("#index input").keydown(function(event){
    // console.log(event);
    if(event.keyCode == 13){
      focusOnNextInput(this,"#index")
    }
    var keyCode = event.keyCode || event.which || event.charCode;
    var ctrlKey = event.ctrlKey || event.metaKey;
    if(ctrlKey && keyCode == 81){
      console.log("Ctrl Q");
    }

  })


});

function focusOnNextInput(thisInput,element){
  var inputs = $(element+ " input");
  for (var i = 0; i < inputs.length; i++) {
    if(i == inputs.length -1){
      inputs[0].focus();
    }else if(thisInput == inputs[i]){
      if(inputs[i + 1].disabled){
        i++;
      };
      inputs[i + 1].focus();
      break;
    }
  }

}