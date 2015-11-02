/*
 * Generated code DO NOT EDIT
 * Generated file: ProductBillToReevaluateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductBillToReevaluateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductBillToReevaluateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ProductBillToReevaluateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductBillToReevaluateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseData noOpInIn) {
    super(id, context, "ProductBillToReevaluate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Product", ProductObjectBaseHelper.toMap(noOpIn, new HashMap(), "Product").get("Product"));
    }
  }
/**
 *
 * Sets the  Product
 * @param noOpInIn ProductObjectBaseData to set
 *
 */
  public void setProduct(ProductObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Product passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectBaseData getProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductObjectBaseHelper.fromMap(inputMap, "Product");
  }
}
