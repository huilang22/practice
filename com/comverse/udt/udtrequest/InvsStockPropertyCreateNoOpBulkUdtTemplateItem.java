/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStockPropertyCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStockPropertyCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStockPropertyObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsStockPropertyCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStockPropertyCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectData noOpInIn) {
    super(id, context, "InvsStockPropertyCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(noOpIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
/**
 *
 * Sets the  InvsStockProperty
 * @param noOpInIn InvsStockPropertyObjectData to set
 *
 */
  public void setInvsStockProperty(InvsStockPropertyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStockProperty passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropertyObjectData getInvsStockProperty() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStockPropertyObjectHelper.fromMap(inputMap, "InvsStockProperty");
  }
}
