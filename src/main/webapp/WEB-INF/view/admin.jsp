<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
          <div class="page-header">
              <h1>Product Details</h1>
            
              <p class="lead">Here is the details of Product </p>
           </div>
       <h3>
       <a href='<c:url value="/admin/productInventory" />'>Product Inventory</a>
       </h3> 
           
<%@include file = "/WEB-INF/view/template/footer.jsp"%>