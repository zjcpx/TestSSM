<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh-CN">
<head>
    <!-- 必须的 meta 标签 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<script src="js/jQuery.js"></script>
	<script src="js/jquerysession.js"></script>
    <script src="js/main.js"></script>
	<link rel="icon" href="imgs/zjcpx.jpg" type="image/gif">
    <script src="js/bootstrap-table.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/jquery.serializejson.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap-table-zh-CN.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- Bootstrap 的 CSS 文件 -->
    <link rel="stylesheet" href="/css/bootstrap.min.css" >
    <link rel="stylesheet" href="/css/index.css">
    <title>main</title>
</head>
<body>
<div>
    <table class="table">
        <tr>
        	<td>
        		<span class="input-group-addon" >预录入号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
        	
        	<td>
        		<span class="input-group-addon" >提运单号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>

			<td>
        		<span class="input-group-addon" >报关单号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
        	
        	<td>
        		<span class="input-group-addon" >流水号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >客户自编号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >是否可申报</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
            
        </tr>
        <tr>
        
        	<td>
        		<span class="input-group-addon" >客户简称</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="Username" name ="">
        	</td>
        	
        	<td>
        		<span class="input-group-addon" >境内收发货人代码/名称</span>
       		</td>
       		<td colspan = "2">
				<input type="text" class="form-control" placeholder="请输入收发货人代码" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >日期条件</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="请输入日期条件" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >部门</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="请输入部门" name ="">
        	</td>
            
			<td>
        		<span class="input-group-addon" >制单人</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="制单人" name ="">
        	</td>
            
        </tr>
        <tr>
        
        	<td>
        		<span class="input-group-addon" >当前状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >业务类型</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
        	
        	<td>
        		<span class="input-group-addon" >流程状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >预约状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >拼箱自编号</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="拼箱自编号" name ="">
        	</td>

            <td>
        		<span class="input-group-addon" >火箭状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>

        </tr>
        <tr>
        
        	 <td>
        		<span class="input-group-addon" >海管家状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
           
           
           <td>
        		<span class="input-group-addon" >开港时间</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="" name ="">
        	</td>
            
            <td>
        		<span class="input-group-addon" >修改文件状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>

			<td>
        		<span class="input-group-addon" >盈合状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
        	
        	<td>
        		<span class="input-group-addon" >客户端状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>

            <td>
        		<span class="input-group-addon" >商检B证比对状态</span>
       		</td>
       		<td>
				<input type="text" class="form-control" placeholder="全部" name ="">
        	</td>
            
        </tr>
        
   </table>
</div>
    <div id="divBtnTools" style="width: 100%; height: 40px; margin: 0px auto; position: relative; margin-bottom: 15px; z-index: 109;">
        <button type="button" class="btn btn-warning">定制查询列</button>
        <button type="button" class="btn btn-warning">预约申报（提前）</button>
        <button type="button" class="btn btn-warning">QA</button>
        <button type="button" class="btn btn-warning">收藏</button>
        <input type="text" name="" value="不设置">
        <button type="button" class="btn btn-warning">批量设置</button>
        <input type="text" name="" value="仓单和运抵">
        <button type="button" class="btn btn-warning">刷新</button>
        <button type="button" class="btn btn-warning">制单指派</button>
        <button type="button" class="btn btn-warning">申报至亿通</button>
        <button type="button" class="btn btn-warning">发送至单一</button>
        <button type="button" class="btn btn-warning">强制发送至单一</button>
        <button type="button" class="btn btn-warning">查询</button>
        <button type="button" class="btn btn-warning">导出</button>
        <button type="button" class="btn btn-warning">批量打印</button>
        <input type="button" value="" class="btn">
    </div>
	<div class="row row-lg">
		<div class="col-sm-12">
			<!-- Example Card View -->
			<div class="example-wrap">
				<div class="example">
					<table id="table_list">
					</table>
				</div>
			</div>
			<!-- End Example Card View -->
		</div>
	</div>
</body>
</html>