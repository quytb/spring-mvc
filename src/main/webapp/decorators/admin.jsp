<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >

<head>
    <meta charset="utf-8">
    <title>HOME</title>
    <!-- Custom fonts for this template-->
    <link href="<c:url value='/template/admin/vendor/fontawesome-free/css/all.css'/>" rel="stylesheet" type="text/css">
    <!-- Page level plugin CSS-->
    <link href="<c:url value='/template/admin/vendor/datatables/dataTables.bootstrap4.css'/>" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="<c:url value='/template/admin/css/sb-admin.css'/>" rel="stylesheet">

</head>
<%@ include file="/common/admin/header.jsp" %>
<body id="page-top">
<dec:body />

<!-- Bootstrap core JavaScript-->
<script src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>

<!-- Core plugin JavaScript-->
<script src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>

<!-- Page level plugin JavaScript-->
<script src="<c:url value='/template/admin/vendor/chart.js/Chart.min.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/datatables/jquery.dataTables.js'/>"></script>
<script src="<c:url value='/template/admin/vendor/datatables/dataTables.bootstrap4.js'/>"></script>

<!-- Custom scripts for all pages-->
<script src="<c:url value='/template/admin/js/sb-admin.min.js'/>"></script>

<!-- Demo scripts for this page-->
<script src="<c:url value='/template/admin/js/demo/datatables-demo.js'/>"></script>
<script src="<c:url value='/template/admin/js/demo/chart-area-demo.js'/>"></script>

</body>
</html>
