/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageOwnerFindBulkUdtTemplateItem.java
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
 * Class used to create a ProductPackageOwnerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageOwnerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageOwnerObjectFilter OwnfindIn;
/**
 *
 * Constructor to create a  ProductPackageOwnerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageOwnerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageOwnerObjectFilter OwnfindInIn) {
    super(id, context, "ProductPackageOwnerFind");
    OwnfindIn = OwnfindInIn;
  }

  public void translateToMap() {
    if (OwnfindIn != null) {
      Integer index =  OwnfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageOwnerObjectHelper.toMap(OwnfindIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param OwnfindInIn Value of the OwnfindIn
 *
 */

  public void setProductPackage(ProductPackageOwnerObjectFilter OwnfindInIn) {
    OwnfindIn = OwnfindInIn;
  }

  public void translateFromMap() {
    OwnfindIn = ProductPackageOwnerObjectHelper.fromMapFilter(inputMap, "ProductPackage");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageOwnerObjectFilter getProductPackage( ) {
    return OwnfindIn;
  }

}
