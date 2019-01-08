<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/header.jsp"%>

    <div class="container-wrapper">
    <div class="container">
          <div class="page-header">
              <h1>All products</h1>
            
              <p class="lead">Check out all products are available</p>
           </div>
            
            <table class="table table-striped table-hover">
              <thead>
                <tr class="bg-success">
                 <th>Photo Thumb</th>
                 <th>ProductName</th>
                 <th>Product Category</th>
                 <th>Product Condition</th>
                 <th>Product Price</th>
                 <th></th>
                </tr>
              </thead>
              <c:forEach items="${products}" var="prod" >
              <tr>
                 <td><img src="<c:url value="/resources/images/${prod.productId}.png"/>" alt="image"style="width: 100%"></td>
                 <td>${prod.productName}</td>
                 <td>${prod.productCategory}</td>
                 <td>${prod.productCondition}</td>
                 <td>${prod.productPrice}</td>
                 <th><a href=' <c:url value="/getproducts/viewproduct/${prod.productId}"  />'><span class="glyphicon glyphicon-info-sign"></span></a>
              </tr>
              </c:forEach>
            </table>
    
  <%@include file="/WEB-INF/view/template/footer.jsp"%>