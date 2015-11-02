/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageFindPendingByComponentBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageFindPendingByComponentBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageFindPendingByComponentBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageJoinItemObjectFilter FindPendingByCompIn;
/**
 *
 * Constructor to create a  ProductPackageFindPendingByComponentBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageFindPendingByComponentBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageJoinItemObjectFilter FindPendingByCompInIn) {
    super(id, context, "ProductPackageFindPendingByComponent");
    FindPendingByCompIn = FindPendingByCompInIn;
  }

  public void translateToMap() {
    if (FindPendingByCompIn != null) {
      Integer index =  FindPendingByCompIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(FindPendingByCompIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param FindPendingByCompInIn Value of the FindPendingByCompIn
 *
 */

  public void setProductPackage(ProductPackageJoinItemObjectFilter FindPendingByCompInIn) {
    FindPendingByCompIn = FindPendingByCompInIn;
  }

  public void translateFromMap() {
    FindPendingByCompIn = ProductPackageJoinItemObjectHelper.fromMapFilter(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageJoinItemObjectFilter getProductPackage( ) {
    return FindPendingByCompIn;
  }

}
