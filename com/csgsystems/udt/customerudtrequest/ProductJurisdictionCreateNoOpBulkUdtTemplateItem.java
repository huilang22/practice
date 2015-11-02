/*
 * Generated code DO NOT EDIT
 * Generated file: ProductJurisdictionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductJurisdictionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductJurisdictionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductJurisdictionObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductJurisdictionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductJurisdictionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectData noOpInIn) {
    super(id, context, "ProductJurisdictionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
/**
 *
 * Sets the  ProductJurisdiction
 * @param noOpInIn ProductJurisdictionObjectData to set
 *
 */
  public void setProductJurisdiction(ProductJurisdictionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductJurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public ProductJurisdictionObjectData getProductJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductJurisdictionObjectHelper.fromMap(inputMap, "ProductJurisdiction");
  }
}
