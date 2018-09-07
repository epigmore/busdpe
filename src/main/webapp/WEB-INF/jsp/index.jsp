<%--
  Created by IntelliJ IDEA.
  User: Moon
  Date: 2018/8/27
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" >
<!-- begin::Head -->
<head>
    <meta charset="utf-8" />
    <title>
        Todo
    </title>
    <meta name="description" content="Latest updates and statistic charts">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <jsp:include page="_common/_dot_css.jsp" />
    <!--end::Base Styles -->
    <link rel="shortcut icon" href="${ctx}/assets/default/media/img/logo/favicon.ico" />
</head>
<!-- end::Body -->
<body  class="m-page--fluid m--skin- m-content--skin-light2 m-header--fixed m-header--fixed-mobile m-aside-left--enabled m-aside-left--skin-dark m-aside-left--offcanvas m-footer--push m-aside--offcanvas-default"  >
    <!-- begin:: Page -->
    <div class="m-grid m-grid--hor m-grid--root m-page">
        <jsp:include page="_common/_top.jsp" />
        <!-- begin::Body -->
        <div class="m-grid__item m-grid__item--fluid m-grid m-grid--ver-desktop m-grid--desktop m-body">

            <jsp:include page="_common/_left.jsp" />

            <div class="m-grid__item m-grid__item--fluid m-wrapper">

                <iframe width="100%" height="100%" src="/admin/dashboard" frameborder="0"></iframe>
            </div>
        </div>
        <!-- end:: Body -->

        <jsp:include page="_common/_footer.jsp" />

    </div>
    <!-- end:: Page -->
    <jsp:include page="_common/_dot_plugins.jsp" />
    <jsp:include page="_common/_dot_js.jsp" />

    <script type="application/javascript">

    </script>

</body>
<!-- end::Body -->
</html>