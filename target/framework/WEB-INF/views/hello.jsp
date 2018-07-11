<!DOCTYPE html>
<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>

    <link rel="stylesheet" type="text/css" href="www/libs/jquery-easyui/1.5.1/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="www/assets/wu.css" />
    <link rel="stylesheet" type="text/css" href="www/assets/icon.css" />
    <script type="text/javascript" src="www/libs/jquery/3.1.1/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="www/libs/jquery-easyui/1.5.1/jquery.easyui.min.js"></script>

</head>
<body class="easyui-layout">

<div class="wu-header" data-options="region:'north',border:false,split:true">
    <div class="wu-header-left">
        <h1>First Web</h1>
    </div>
    <div class="wu-header-center">
        <p><a href="javascript:;" title="基础数据" id="1111">模块1</a>
        <a name="point" href="javascript:;" title="积分管理" id="222">模块2</a></p>
    </ul>
    </div>
    <div class="wu-header-right">
        <p><strong class="easyui-tooltip" title="2条未读消息">admin</strong>，欢迎您！</p>
        <p><a href="#">个人资资料</a>|<a href="#">修改密码</a>|<a href="#">安全退出</a></p>
    </div>
</div>

<div class="wu-sidebar" data-options="region:'west',split:true,border:true" id="menu">
</div>

<div data-options="region:'center'" class="easyui-panel" style="height: 100%" id="content">
</div>

<div class="wu-footer" data-options="region:'south',border:true,split:true">
    &copy; 2013 Wu All Rights Reserved
</div>

<script type="text/javascript">
    (function ($) {
        $(function () {
            $('#1111').click(function () {
                console.log('#1111 click function');
                $('.wu-sidebar').panel('refresh','menu');
            });

        });

    })(jQuery);

</script>
</body>
</html>