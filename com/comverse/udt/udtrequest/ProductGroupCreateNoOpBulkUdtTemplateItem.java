/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProductGroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductGroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   ProductGroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductGroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductGroupObjectData noOpInIn) {
    super(id, context, "ProductGroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(noOpIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
/**
 *
 * Sets the  ProductGroup
 * @param noOpInIn ProductGroupObjectData to set
 *
 */
  public void setProductGroup(ProductGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ProductGroupObjectData getProductGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductGroupObjectHelper.fromMap(inputMap, "ProductGroup");
  }
}
