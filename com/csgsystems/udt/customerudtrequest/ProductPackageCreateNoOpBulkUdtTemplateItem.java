/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductPackageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductPackageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductPackageObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductPackageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductPackageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData noOpInIn) {
    super(id, context, "ProductPackageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(noOpIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
/**
 *
 * Sets the  ProductPackage
 * @param noOpInIn ProductPackageObjectData to set
 *
 */
  public void setProductPackage(ProductPackageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductPackage passed into the constructor
 * @return Simulated response
 *
 */
  public ProductPackageObjectData getProductPackage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
  }
}
