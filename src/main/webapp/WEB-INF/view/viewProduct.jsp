<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/view/template/header.jsp"%>

    <div class="container-wrapper">
    <div class="container">
          <div class="page-header">
              <h1>Product Details</h1>
            
              <p class="lead">Here is the details of Product </p>
           </div>
            
           <div class="container">
              <div class="row">
                  <div class="col-md-5">
                      <img src="#" alt="image" style="width:100% height:300px" />
                  </div>
                  <div class="col-md-5">
                    <h3>Product Name :<c:out value="${product.productName}"/></h3>
                    <p>Product Description: <c:out value="${product.productDescription}"/></p>
                     <p>Manufacture : <c:out value="${product.productManfacture}"/></p>
                     <p>Category : <c:out value="${product.productCategory}"/></p>
                     <p>Condition : <c:out value="${product.productCondition}"/></p>
                     <p>Price : <c:out value="${product.productPrice}"/></p>
                  </div>
                  
              </div>
           </div>
    
  <%@include file="/WEB-INF/view/template/footer.jsp"%>