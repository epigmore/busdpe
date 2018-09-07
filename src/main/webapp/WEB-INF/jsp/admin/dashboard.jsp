<%--
  Created by IntelliJ IDEA.
  User: Moon
  Date: 2018/9/6
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dashboard</title>
    <jsp:include page="../_common/_dot_css.jsp"/>
</head>
<body class="m-page--fluid m--skin- m-content--skin-light2 m-aside-left--enabled m-aside-left--skin-dark m-aside-left--offcanvas m-footer--push m-aside--offcanvas-default">
<!-- begin:: Page -->

<div class="m-grid m-grid--hor m-grid--root m-body">
    <!-- BEGIN: Subheader -->
    <div class="m-subheader ">
        <div class="d-flex align-items-center">
            <div class="mr-auto">
                <h3 class="m-subheader__title ">
                    Dashboard
                </h3>
            </div>
            <div>
                <span class="m-subheader__daterange" id="m_dashboard_daterangepicker">
                    <span class="m-subheader__daterange-label">
                        <span class="m-subheader__daterange-title"></span>
                        <span class="m-subheader__daterange-date m--font-brand"></span>
                    </span>
                    <a href="#" class="btn btn-sm btn-brand m-btn m-btn--icon m-btn--icon-only m-btn--custom m-btn--pill">
                        <i class="la la-angle-down"></i>
                    </a>
                </span>
            </div>
        </div>
    </div>
    <!-- END: Subheader -->
    <div class="m-content " >
            <!--Begin::Section-->
            <h1>Dashboard</h1>
            <%--<div class="row">
                <div class="col-xl-6 col-lg-12">

                </div>
                <div class="col-xl-6 col-lg-12">
                    <!--Begin::Portlet-->

                    <!--End::Portlet-->
                </div>
            </div>--%>
            <!--End::Section-->
        </div>
</div>
<!--begin::Page Snippets -->
<jsp:include page="../_common/_dot_js.jsp"/>
<script src="${ctx}/assets/app/js/dashboard.js" type="text/javascript"></script>
<!--end::Page Snippets -->
<script type="application/javascript">
    console.log("dashboard：${ctx}");
</script>
</body>
</html>
