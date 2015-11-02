/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProductJurisdictionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductJurisdictionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductJurisdictionObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductJurisdictionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductJurisdictionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectData noOpInIn) {
    super(id, context, "ProductJurisdictionGet");
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
