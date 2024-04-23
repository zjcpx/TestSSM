<%@ page contentType="text/html;charset=utf-8"%>
<!doctype html>
<html lang="zh-CN">
<head>
    <!-- 必须的 meta 标签 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script src="js/jQuery.js"></script>
    <script src="js/jquerysession.js"></script>
    <script src="js/refilled.js"></script>
    <!-- Bootstrap 的 CSS 文件 -->
    <link rel="icon" href="imgs/zjcpx.jpg" type="image/gif">
    <link rel="stylesheet" href="css/bootstrap.min.css" >
    <link rel="stylesheet" href="css/index.css">
    <title>制单界面</title>
</head>
<body>
<form  id="index" class="form-horizontal" role="form" action="#">
    <div>
        <table class="table">
            <tbody>
            <tr>
                <td style="width: 100px">申报地海关</td>
                <td class="padding0">
                    <input type="text" class="ac_input innerbgd inputText" maxlength="4" title="" name="custommaster"
                           value="洋山">
                </td>
                <td style="width: 90px">流水号</td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtSerial_no" maxlength="10" title="" disabled="disabled" name="id">
                </td>
                <td style="width:90Px">报关单号</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText" id="txtCustoms_id" maxlength="18" title=""  name="customsdeclarationno">
                </td>
                <td><a id="a_changeEDI" style="text-decoration: blink; color: black; cursor: default;">预录入号</a></td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText" id="txtPre_entry_id" maxlength="18"  title=""  name="preentryid">
                </td>
            </tr>
            <tr>
                <td>申报日期</td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtD_date" title=""  name="ddate">
                </td>
                <td>标志</td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtFlag" title="" name="ieflag">
                </td>

                <td>出境关别</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText" id="txtI_e_port" title="" name="ieport">
                </td>
                <td>出口日期</td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtI_e_date" title="" name="iedate">
                </td>
            </tr>
            <tr>
                <td>备案号</td>
                <td class="padding0" colspan="3">
                    <input type="text" class="inputText" id="txtManual_no" maxlength="12"  title="" name = "manualno">
                </td>

                <td>合同协议号</td>
                <td class="padding0" colspan="4">
                    <input type="text" class="inputText" id="txtContr_no" title="" name="contrno">
                </td>
            </tr>
            <tr>
                <td>境内收发货人</td>
                <td class="padding0">
                    <input type="text" class="inputText innerbgd" id="txtTrade_co18" placeholder="18位社会信用代码" maxlength="18" title="" name="tradecoscc">
                </td>
                <td class="padding0">
                    <input type="text" class="inputText innerbgd" id="txtTrade_co" placeholder="10位海关编码" maxlength="10" title="" name="tradeco">
                </td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtTradeCIQCode" style="background: #fff; width: 110px; color: #000;" placeholder="10位检验检疫编码" maxlength="10" title="" name="tradeciqcode">
                </td>
                <td class="padding0" colspan="3">
                    <input type="text" class="inputText innerbgd" id="txtTrade_name" placeholder="企业名称（中文）" title="" name="tradename">
                </td>

            </tr>
            <tr>
                <td>境外收发货人</td>
                <td class="padding0" colspan="3">
                    <input type="text" class="inputText" id="txtOverseasConsignee" placeholder="境外收货人编码" maxlength="20" title="" name="overseasconsigneecode">
                </td>
                <td class="padding0" colspan="6">
                    <input type="text" class="inputText innerbgd" id="txtOverseasConsigneeName" placeholder="企业名称（外文）" maxlength="100" title="" name="overseasconsignorename">
                </td>
            </tr>
            <tr>
                <td>生产销售单位</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText innerbgd" id="txtOwner_code18" placeholder="18位社会信用代码" maxlength="18" title="" name="ownercodescc">
                </td>
                <td class="padding0">
                    <input type="text" class="inputText innerbgd" id="txtOwner_code" placeholder="10位海关编码" maxlength="10" title="" name="ownercode" >
                </td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtOwnerCIQCode" style="background: #fff; color: #000;" placeholder="10位检验检疫编码" maxlength="10" title="" name="ownerciqcode">
                </td>
                <td class="padding0" colspan="5">
                    <input type="text" class="inputText innerbgd" id="txtOwner_name" placeholder="企业名称（中文）" title="" name="ownername">
                </td>
            </tr>
            <tr>
                <td>申报单位</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText innerbgd" id="txtAgent_code18" placeholder="18位社会信用代码" maxlength="18" title="" name="agentcodescc" value="123456789">
                </td>
                <td class="padding0">
                    <input type="text" class="inputText innerbgd" id="txtAgent_code" placeholder="10位海关编码" maxlength="10" title="" name="agentcode">
                </td>
                <td class="padding0">
                    <input type="text" class="inputText" id="txtAgentCIQCode" style="background: #fff; color: #000;" placeholder="10位检验检疫编码" maxlength="10" title=""  name = "declciqcode">
                </td>

                <td class="padding0" colspan="4">
                    <input type="text" class="inputText innerbgd" id="txtAgent_name" placeholder="企业名称（中文）" title="" name="agentname" value = "心海报关">
                </td>

            </tr>
            <tr>
                <td>运输方式</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText ac_input innerbgd" id="txtTraf_mode" title="2" name="trafmode" value="水路运输">
                </td>
                <td>运输工具名称</td>
                <td class="padding0" colspan="3">
                    <input type="text" class="inputText" id="txtTraf_name" maxlength="50"  title="" name="shipnameen">
                </td>
                <td>航次号</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText" id="txtVoyage_no" maxlength="32" title="" name="voyageno">
                </td>
            </tr>
            <tr>
                <td>提运单号</td>
                <td class="padding0" colspan="2">

                    <input type="text" class="inputText" id="txtBill_no" maxlength="32"title="" name="billno">
                </td>
                <td>监管方式</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText ac_input innerbgd zhidancolor" id="txtTrade_mode" title="0110" name="trademode">
                </td>
                <td>征免性质</td>
                <td class="padding0" colspan="2">
                    <input type="text" class="inputText ac_input" id="txtCut_mode" title="101" name="cutmode">
                </td>
            </tr>

            </tbody>
        </table>
        <button type="button" class="btn btn-outline-primary offset-3 mr-2" onclick="submitForm()">表单提交</button>



        <button type="reset" class="btn btn-outline-danger ">Reset重置</button>
    </div>
</form>


<div style="width: calc(100% - 18px); border: 1px solid #C9C9C9; margin-top: 4px; padding: 4px 8px;" id="detail">


    <div class="" id="de_r" style="width: calc(100% - 2px); height: 123px; border: 1px solid #C9C9C9; overflow: scroll;">
        <table class="Table_List" border="1" cellpadding="0" cellspacing="0" frame="below" id="tb_list">
            <tbody>
            <tr>

                <th style="width: 36px;">项号</th>
                <!-- <th style="width: 120px;">价格区间异常</th> -->
                <th style="width: 54px;">备案序号</th>
                <th style="width: 94px;">商品编号</th>
                <th style="width: 71px;">CIQ编号</th>
                <!-- <th style="width: 90px;">检验检疫名称</th> -->
                <th style="width: 90px;">商品名称</th>
                <th style="width: 90px;">规格型号</th>
                <th style="width: 106px;">数量</th>
                <th style="width: 59px;">单位</th>
                <th style="width: 59px;">币制</th>
                <th style="width: 100px;">成交总价</th>
                <th style="width: 100px;">单价</th>
                <th style="width: 83px;">监管证件</th>
                <th style="width: 83px;">出口税率</th>
                <th style="width: 83px;">暂定税率</th>
                <th style="width: 83px;">出口税</th>
                <th style="width: 260px;">商品英文名称</th>
            </tr>

            <tr id="trPriceInterVal0">

                <td class="tdlist">1</td>
                <td class="tdlist"></td>

                <td class="tdlist">8428101090</td>
                <td class="tdlist"></td>

                <td class="tdlist">
                    <div style="width:48px;margin: 0px 3px;">客用电梯</div>
                </td>
                <td class="tdlist">
                    <div style="width:148.5px;height:34px;margin: 0px 3px; overflow:hidden;word-wrap: break-word;" title="4|0|载客|SIGMA牌|(SOLON 2.0)|1 M/S|3层|450 KG">
                        <div style="white-space: nowrap;">4|0|载客|SIGMA牌|(SOLON</div>
                        <div style="white-space: nowrap;"> 2.0)|1 M/S|3层|450 K</div>
                    </div>
                </td>
                <td class="tdlist">1.00000</td>
                <td class="tdlist">001</td>
                <td class="tdlist">CNY</td>
                <td class="tdlist">102692.98</td>
                <td class="tdlist">102692.9800</td>
                <td class="tdlist"></td>
                <td class="tdlist"></td>
                <td class="tdlist"></td>
                <td class="tdlist"></td>
                <td class="tdlist"></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div style="width: 100%; margin-top: 8px; background: #f0f0f0;" id="div_tdlist" class="form_list">
    <table class="table" cellpadding="1" cellspacing="1" rules="cols" id="tdlist">
        <tbody>
        <tr>
            <td class="padding0" style="width:3%">
                <input type="text" class="inputText" id="txtG_no" style="text-align: center;" value="1" maxlength="2" title="" >
            </td>
            <td>
                备案序号
            </td>
            <td class="padding0">
                <input type="text" class="ac_input innerbgd inputText" title="" >
            </td>
            <td>关联编号</td>
            <td class="padding0">
                <input type="text" class="ac_input innerbgd inputText" title="" >
            </td>
            <td>商品编号</td>
            <td>
                <input type="text" class="ac_input innerbgd inputText" title="" >
            </td>

            <td>CIQ</td>
            <td class="padding0">
                <input type="text" class="ac_input innerbgd inputText" style="background: #ccc;" id="txtCode_ciq" maxlength="3" title="" >
            </td>
        </tr>
        <tr>
            <td colspan="2">商品名称</td>
            <td class="padding0">
                <input type="text" class="innerbgd inputText" id="txtG_name" title="">
            </td>
            <td>规格型号</td>
            <td class="padding0" colspan="6">
                <input type="text" class="inputText" id="txtG_model" title="" >
            </td>
        </tr>

        </tbody></table>
</div>
</body>
</html>
