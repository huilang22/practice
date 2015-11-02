/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ProductChargeMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductChargeMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductChargeMapObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductChargeMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductChargeMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectData noOpInIn) {
    super(id, context, "ProductChargeMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(noOpIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
/**
 *
 * Sets the  ProductChargeMap
 * @param noOpInIn ProductChargeMapObjectData to set
 *
 */
  public void setProductChargeMap(ProductChargeMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductChargeMap passed into the constructor
 * @return Simulated response
 *
 */
  public ProductChargeMapObjectData getProductChargeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductChargeMapObjectHelper.fromMap(inputMap, "ProductChargeMap");
  }
}
