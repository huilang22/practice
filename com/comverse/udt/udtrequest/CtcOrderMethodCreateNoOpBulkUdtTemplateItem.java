/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOrderMethodCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOrderMethodCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOrderMethodObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOrderMethodCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOrderMethodCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectData noOpInIn) {
    super(id, context, "CtcOrderMethodCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(noOpIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
/**
 *
 * Sets the  CtcOrderMethod
 * @param noOpInIn CtcOrderMethodObjectData to set
 *
 */
  public void setCtcOrderMethod(CtcOrderMethodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOrderMethod passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOrderMethodObjectData getCtcOrderMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOrderMethodObjectHelper.fromMap(inputMap, "CtcOrderMethod");
  }
}
