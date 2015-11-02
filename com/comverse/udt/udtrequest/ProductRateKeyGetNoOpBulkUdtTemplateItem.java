/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductRateKeyGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateKeyGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductRateKeyObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductRateKeyGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateKeyGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectData noOpInIn) {
    super(id, context, "ProductRateKeyGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(noOpIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
/**
 *
 * Sets the  ProductRateKey
 * @param noOpInIn ProductRateKeyObjectData to set
 *
 */
  public void setProductRateKey(ProductRateKeyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductRateKey passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateKeyObjectData getProductRateKey() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductRateKeyObjectHelper.fromMap(inputMap, "ProductRateKey");
  }
}
