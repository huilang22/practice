/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductRateKeyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductRateKeyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductRateKeyObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductRateKeyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductRateKeyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectData noOpInIn) {
    super(id, context, "ProductRateKeyUpdate");
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
