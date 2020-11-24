<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录入口</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <%--    导入bootstrap.min.css - 样式文件--%>
    <link rel="stylesheet" type="text/css" href="/mvc/plugins/bootstrap/css/bootstrap.min.css">
    <style>
        #login_div{
            /*border: 1px solid red;*/
            padding-top: 50px;
            margin-top: 80px;

            border-radius: 25px;

            box-shadow: 2px 0px 8px #ccc;
        }
    </style>
</head>
<body>

<%--    引入导航 - jsp包含指令--%>
<%@ include file="../common/nav.jsp"%>

<%--    登录begin--%>
<div class="container">
    <div class="row" id="login_div">
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label class="col-sm-2 control-label">邮箱地址</label>
                <div class="col-sm-4">
                    <input type="email" class="form-control" id="emails" placeholder="请输入邮箱地址">
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">验证码</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="lastname" placeholder="请输入验证码">
                </div>
                <div class="col-sm-2">
                    <button type="button" class="btn btn-success" onclick="sendCode()">发送验证码</button>
                </div>
            </div>
<%--            <div class="form-group">--%>
<%--                <div class="col-sm-offset-2 col-sm-10">--%>
<%--                    <div class="checkbox">--%>
<%--                        <label>--%>
<%--                            <input type="checkbox">请记住我--%>
<%--                        </label>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">登录</button>
                </div>
            </div>
        </form>
    </div>
</div>

<%--    登录end--%>



<%--    引入jquery文件 - jquery本身也是一个框架,它是js框架
    而我们的bootstrap框架本身是依赖于jquery框架的,bootstrap.min.js文件中
    很多是采用jquery的语法的,所以因此必须先引入jquery框架
--%>
<script src="/mvc/plugins/jquery/jquery.min.js"></script>

<%--    引入bootstrap.min.js文件--%>
<script src="/mvc/plugins/bootstrap/js/bootstrap.min.js"></script>

<script>
    function sendCode() {
        let email_value = $("#emails").val();

        $.get("/mvc/users/sendCode","email="+email_value,function(data){
            if(data.code=="200"){
                alert(data.msg);
            }else{
                alert(data.msg);
            }
        })
    }
</script>


</body>
</html>
