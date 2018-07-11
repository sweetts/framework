<table class="easyui-datagrid" title="Basic DataGrid" style="width:100%;height:100%"
       data-options="singleSelect:true,collapsible:true,url:'bwList',method:'post'"
        id="1111-datagrid">
    <thead>
    <tr>
        <th data-options="field:'bwid001',width:80">BWID001</th>
        <th data-options="field:'bwnr001',width:80">BWNR001</th>
        <%--<th data-options="field:'itemid',width:80">Item ID</th>--%>
        <%--<th data-options="field:'productid',width:100">Product</th>--%>
        <%--<th data-options="field:'listprice',width:80,align:'right'">List Price</th>--%>
        <%--<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>--%>
        <%--<th data-options="field:'attr1',width:250">Attribute</th>--%>
        <%--<th data-options="field:'status',width:60,align:'center'">Status</th>--%>
    </tr>
    </thead>
</table>
<button id="1111-test">test</button>
<script type="text/javascript">
    (function ($) {
        $(function () {
            $('#1111-test').click(function () {
                $.post('deleteBw',$('#1111-datagrid').datagrid('getSelected'), function (data) {
                    if(data.success){
                        $('#1111-datagrid').datagrid('reload');
                    }
                })
                $.messager.alert('', JSON.stringify($('#1111-datagrid').datagrid('getSelected')),'info');
            });

        });
    })(jQuery);
</script>