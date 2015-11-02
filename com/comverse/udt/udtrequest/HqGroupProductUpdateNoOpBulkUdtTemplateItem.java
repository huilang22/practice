/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupProductUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupProductUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupProductUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupProductObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupProductUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupProductUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupProductObjectData noOpInIn) {
    super(id, context, "HqGroupProductUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
/**
 *
 * Sets the  HqGroupProduct
 * @param noOpInIn HqGroupProductObjectData to set
 *
 */
  public void setHqGroupProduct(HqGroupProductObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupProduct passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupProductObjectData getHqGroupProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupProductObjectHelper.fromMap(inputMap, "HqGroupProduct");
  }
}
