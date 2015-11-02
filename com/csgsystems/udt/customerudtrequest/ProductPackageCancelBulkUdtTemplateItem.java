/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageCancelBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData cancelIn;
/**
 *
 * Constructor to create a  ProductPackageCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData cancelInIn) {
    super(id, context, "ProductPackageCancel");
    cancelIn = cancelInIn;
  }

  public void translateToMap() {
    if (cancelIn != null) {
      cancelIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(cancelIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param cancelInIn Value of the cancelIn
 *
 */

  public void setProductPackage(ProductPackageObjectData cancelInIn) {
    cancelIn = cancelInIn;
  }

  public void translateFromMap() {
    cancelIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return cancelIn;
  }

}
