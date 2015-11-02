/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageDeleteListBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductPackageDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectFilter ProductPackageDeleteListIn;
  protected Date InactiveDate;
/**
 *
 * Constructor to create a  ProductPackageDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectFilter ProductPackageDeleteListInIn, Date InactiveDateIn) {
    super(id, context, "ProductPackageDeleteList");
    ProductPackageDeleteListIn = ProductPackageDeleteListInIn;
    InactiveDate = InactiveDateIn;
  }

  public void translateToMap() {
    if (ProductPackageDeleteListIn != null) {
      Integer index =  ProductPackageDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(ProductPackageDeleteListIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param ProductPackageDeleteListInIn Value of the ProductPackageDeleteListIn
 *
 */

  public void setProductPackage(ProductPackageObjectFilter ProductPackageDeleteListInIn) {
    ProductPackageDeleteListIn = ProductPackageDeleteListInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param InactiveDateIn Value of the InactiveDate
 *
 */

  public void setInactiveDate(Date InactiveDateIn) {
    InactiveDate = InactiveDateIn;
  }

  public void translateFromMap() {
    ProductPackageDeleteListIn = ProductPackageObjectHelper.fromMapFilter(inputMap, "ProductPackage");
    InactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectFilter getProductPackage( ) {
    return ProductPackageDeleteListIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return InactiveDate;
  }

}
