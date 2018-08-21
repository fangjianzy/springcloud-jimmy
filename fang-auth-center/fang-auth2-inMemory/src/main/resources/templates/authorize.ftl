<html>
<head>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.js"></script>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h2>单点登录请确认</h2>
<p>
您是否授权 "${authorizationRequest.clientId}" 访问 "${authorizationRequest.redirectUri}" ? 访问范围是： ${authorizationRequest.scope?join(", ")}.
</p>
<form id="confirmationForm" name="confirmationForm"
action="../oauth/authorize" method="post">
<#list authorizationRequest.scope as scop>
<input type="hidden" name="scope.${scop}" value="true"/>
</#list>
<input name="user_oauth_approval" value="true" type="hidden"/>
<input type="hidden" id="csrf_token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<button class="btn btn-primary" type="submit">登录</button>
</form>
<form id="denyForm" name="confirmationForm"
action="../oauth/authorize" method="post">
<input name="user_oauth_approval" value="false" type="hidden"/>
<input type="hidden" id="csrf_token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<button class="btn btn-primary" type="submit">否认</button>
</form>
</div>
</body>
</html>