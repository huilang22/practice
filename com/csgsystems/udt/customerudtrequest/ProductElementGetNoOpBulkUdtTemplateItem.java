/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductElementGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductElementGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductElementObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductElementGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductElementGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectData noOpInIn) {
    super(id, context, "ProductElementGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductElement", ProductElementObjectHelper.toMap(noOpIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
/**
 *
 * Sets the  ProductElement
 * @param noOpInIn ProductElementObjectData to set
 *
 */
  public void setProductElement(ProductElementObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductElement passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectData getProductElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductElementObjectHelper.fromMap(inputMap, "ProductElement");
  }
}
