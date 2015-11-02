/*
 * Generated code DO NOT EDIT
 * Generated file: ProductChargeMapUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ProductChargeMapUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductChargeMapUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductChargeMapObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductChargeMapUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductChargeMapUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductChargeMapObjectData noOpInIn) {
    super(id, context, "ProductChargeMapUpdate");
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
