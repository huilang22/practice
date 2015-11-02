/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageOverridesFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageOverridesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageOverridesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectFilter PPOFindIn;
/**
 *
 * Constructor to create a  ProductPackageOverridesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageOverridesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectFilter PPOFindInIn) {
    super(id, context, "ProductPackageOverridesFind");
    PPOFindIn = PPOFindInIn;
  }

  public void translateToMap() {
    if (PPOFindIn != null) {
      Integer index =  PPOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PPOFindIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param PPOFindInIn Value of the PPOFindIn
 *
 */

  public void setProductPackage(ProductPackageObjectFilter PPOFindInIn) {
    PPOFindIn = PPOFindInIn;
  }

  public void translateFromMap() {
    PPOFindIn = ProductPackageObjectHelper.fromMapFilter(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectFilter getProductPackage( ) {
    return PPOFindIn;
  }

}
