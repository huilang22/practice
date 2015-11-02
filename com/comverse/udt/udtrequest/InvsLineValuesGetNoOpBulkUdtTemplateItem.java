/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLineValuesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLineValuesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLineValuesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLineValuesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLineValuesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineValuesObjectData noOpInIn) {
    super(id, context, "InvsLineValuesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
/**
 *
 * Sets the  InvsLineValues
 * @param noOpInIn InvsLineValuesObjectData to set
 *
 */
  public void setInvsLineValues(InvsLineValuesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLineValues passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineValuesObjectData getInvsLineValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLineValuesObjectHelper.fromMap(inputMap, "InvsLineValues");
  }
}
