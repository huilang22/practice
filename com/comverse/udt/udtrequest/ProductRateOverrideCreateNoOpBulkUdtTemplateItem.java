/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductRateOverrideCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateOverrideCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductRateOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductRateOverrideCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateOverrideCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateOverrideObjectData noOpInIn) {
    super(id, context, "ProductRateOverrideCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(noOpIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
/**
 *
 * Sets the  ProductRateOverride
 * @param noOpInIn ProductRateOverrideObjectData to set
 *
 */
  public void setProductRateOverride(ProductRateOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductRateOverride passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateOverrideObjectData getProductRateOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductRateOverrideObjectHelper.fromMap(inputMap, "ProductRateOverride");
  }
}
