/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementRateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProductElementRateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductElementRateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductElementRateOutputData noOpIn;

/**
 *
 * Constructor to create a   ProductElementRateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductElementRateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementRateOutputData noOpInIn) {
    super(id, context, "ProductElementRate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductElementRateOutputData", ProductElementRateOutputHelper.toMap(noOpIn).get("ProductElementRateOutputData"));
    }
  }
/**
 *
 * Sets the  ProductElementRateOutputData
 * @param noOpInIn ProductElementRateOutputData to set
 *
 */
  public void setProductElementRateOutputData(ProductElementRateOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductElementRateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementRateOutputData getProductElementRateOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductElementRateOutputHelper.fromMap(inputMap);
  }
}
