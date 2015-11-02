/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageFindPendingByPackageBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageFindPendingByPackageBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageFindPendingByPackageBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageJoinItemObjectFilter FindPendingByPackageIn;
/**
 *
 * Constructor to create a  ProductPackageFindPendingByPackageBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageFindPendingByPackageBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageJoinItemObjectFilter FindPendingByPackageInIn) {
    super(id, context, "ProductPackageFindPendingByPackage");
    FindPendingByPackageIn = FindPendingByPackageInIn;
  }

  public void translateToMap() {
    if (FindPendingByPackageIn != null) {
      Integer index =  FindPendingByPackageIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(FindPendingByPackageIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param FindPendingByPackageInIn Value of the FindPendingByPackageIn
 *
 */

  public void setProductPackage(ProductPackageJoinItemObjectFilter FindPendingByPackageInIn) {
    FindPendingByPackageIn = FindPendingByPackageInIn;
  }

  public void translateFromMap() {
    FindPendingByPackageIn = ProductPackageJoinItemObjectHelper.fromMapFilter(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageJoinItemObjectFilter getProductPackage( ) {
    return FindPendingByPackageIn;
  }

}
