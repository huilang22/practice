/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageActivateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ProductPackageActivateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductPackageActivateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductPackageObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductPackageActivateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductPackageActivateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData noOpInIn) {
    super(id, context, "ProductPackageActivate");
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
