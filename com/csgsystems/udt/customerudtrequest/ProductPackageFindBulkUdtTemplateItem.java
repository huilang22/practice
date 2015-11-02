/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectFilter findIn;
/**
 *
 * Constructor to create a  ProductPackageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectFilter findInIn) {
    super(id, context, "ProductPackageFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(findIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param findInIn Value of the findIn
 *
 */

  public void setProductPackage(ProductPackageObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ProductPackageObjectHelper.fromMapFilter(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectFilter getProductPackage( ) {
    return findIn;
  }

}
