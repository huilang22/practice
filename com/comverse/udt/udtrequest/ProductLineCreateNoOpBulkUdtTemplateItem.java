/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductLineCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductLineCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductLineObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductLineCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductLineCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductLineObjectData noOpInIn) {
    super(id, context, "ProductLineCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductLine", ProductLineObjectHelper.toMap(noOpIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
/**
 *
 * Sets the  ProductLine
 * @param noOpInIn ProductLineObjectData to set
 *
 */
  public void setProductLine(ProductLineObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductLine passed into the constructor
 * @return Simulated response
 *
 */
  public ProductLineObjectData getProductLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductLineObjectHelper.fromMap(inputMap, "ProductLine");
  }
}
