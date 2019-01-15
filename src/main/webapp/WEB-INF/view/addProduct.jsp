<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>

            <p class="lead">Fill the below information to add a product:</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/productInventory/saveProduct"
                   method="post"
                   commandName="product" enctype="multipart/form-data">
                
        <div class="form-group"> 
            <label for="name">Name</label>  <form:errors path="productName" cssStyle="color:red"/>  
            <form:input path="productName" name="productName" id="name" class="form-Control"/>
        </div>
              
               <div class="form-group">
                 <label for="name">Category</label>  <form:errors path="productCategory" cssStyle="color:red"/> 
                 <label class="checkbox-inline"><form:radiobutton path="productCategory" id="" value="Electronics"></form:radiobutton>Electronics</label>
                 <label class="checkbox-inline"><form:radiobutton path="productCategory" id="" value="Furniture"></form:radiobutton>Furniture</label>
                 <label class="checkbox-inline"><form:radiobutton path="productCategory" id="" value="Sports"></form:radiobutton>Sports</label>
              </div>
              
              <div class="form-group">
                 <label for="name">Description</label>  <form:errors path="productDescription" cssStyle="color:red"/> 
                 <form:input path="productDescription" id="productDescription" class="form-control"/>
              </div>
              
               <div class="form-group">
                 <label for="name">Price</label> <form:errors path="productPrice" cssStyle="color:red"/>
                 <form:input path="productPrice" id="productPrice" class="form-control"/>
              </div>
              
               <div class="form-group">
                 <label for="name">Condition</label> <form:errors path="productCondition" cssStyle="color:red"/>
                 <label class="checkbox-inline"><form:radiobutton path="productCondition" id="" value="New"/>New</label>
                 <label class="checkbox-inline"><form:radiobutton path="productCondition" id="" value="Old"/>Old</label>
              </div>
              
               <div class="form-group">
                 <label for="name">Status</label> <form:errors path="productState" cssStyle="color:red"/>
                 <label class="checkbox-inline"><form:radiobutton path="productState" id="" value="Active"/>Active</label>
                 <label class="checkbox-inline"><form:radiobutton path="productState" id="" value="Deactive"/>Deactive</label>
              </div>
              
               <div class="form-group"> 
                 <label for="name">Unit In Stock</label> <form:errors path="unitInStock" cssStyle="color:red"/>
                 <form:input path="unitInStock" id="unitInStock" class="form-control"/>
              </div>
              
               <div class="form-group">
                 <label for="name">Manfacture</label>  <form:errors path="productManfacture" cssStyle="color:red"/>
                 <form:input path="productManfacture" id="productManfacture" class="form-control"/>
              </div>
              
             <div class="form-group">
                <label class="control-label" for="productImage">Upload Picture</label>
                <form:input id="productImage" path="productImage" type="file" class="form:input-large" />
             </div>

              <br>
               <input type="submit" value="Submit" class="btn btn-primary">
               <a class="btn btn-primary" href='<c:url value="/admin/productInventory"></c:url>' role="button">Cancel</a>
           </form:form>
 <%@include file = "/WEB-INF/view/template/footer.jsp"%>