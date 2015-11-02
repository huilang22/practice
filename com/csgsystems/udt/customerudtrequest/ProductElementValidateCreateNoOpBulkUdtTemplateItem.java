/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementValidateCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProductElementValidateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductElementValidateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductElementObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductElementValidateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductElementValidateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectData noOpInIn) {
    super(id, context, "ProductElementValidateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(noOpIn, new HashMap(), "ProductElementValidate").get("ProductElementValidate"));
    }
  }
/**
 *
 * Sets the  ProductElementValidate
 * @param noOpInIn ProductElementObjectData to set
 *
 */
  public void setProductElementValidate(ProductElementObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductElementValidate passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectData getProductElementValidate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductElementObjectHelper.fromMap(inputMap, "ProductElementValidate");
  }
}
