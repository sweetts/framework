<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<link rel="stylesheet" type="text/css" href="www/libs/jquery-easyui/1.5.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="www/assets/wu.css" />
<link rel="stylesheet" type="text/css" href="www/assets/icon.css" />
<script type="text/javascript" src="www/libs/jquery/3.1.1/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="www/libs/jquery-easyui/1.5.1/jquery.easyui.min.js"></script>



<div class="easyui-accordion" data-options="border:false,fit:true">
    <div title="快捷菜单" data-options="iconCls:'icon-application-cascade'" style="padding:5px;">
        <ul class="easyui-tree wu-side-tree">
            <li iconCls="icon-chart-organisation"><a href="javascript:void(0)" data-icon="icon-chart-organisation" data-link="2222">菜单导航</a></li>
            <li iconCls="icon-users"><a href="javascript:void(0)" data-icon="icon-users" data-link="3333">用户管理</a></li>
            <li iconCls="icon-user-group"><a href="javascript:void(0)" data-icon="icon-user-group" data-link="test">角色管理</a></li>
            <li iconCls="icon-book"><a href="javascript:void(0)" data-icon="icon-book" data-link="temp/layout-3.html">数据字典</a></li>
            <li iconCls="icon-cog"><a href="javascript:void(0)" data-icon="icon-cog" data-link="temp/layout-3.html">系统参数</a></li>
            <li iconCls="icon-application-osx-error"><a href="javascript:void(0)" data-icon="icon-application-osx-error" data-link="temp/layout-3.html">操作日志</a></li>
        </ul>
    </div>
</div>


<script type="text/javascript">
    (function ($) {
        $(function(){
            $('.wu-side-tree a').click(function(){
                var title = $(this).text();
                var url = $(this).attr('data-link');
                $('#content').panel('refresh' , url);
                console.log('.wu-side-tree a function');
            });
        });
    })(jQuery);

//
//        $('.wu-main').load('test');

</script>
