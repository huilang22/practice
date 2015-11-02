/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcEventGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcEventGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcEventObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcEventGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcEventGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcEventObjectData noOpInIn) {
    super(id, context, "CtcEventGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcEvent", CtcEventObjectHelper.toMap(noOpIn, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
/**
 *
 * Sets the  CtcEvent
 * @param noOpInIn CtcEventObjectData to set
 *
 */
  public void setCtcEvent(CtcEventObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcEvent passed into the constructor
 * @return Simulated response
 *
 */
  public CtcEventObjectData getCtcEvent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcEventObjectHelper.fromMap(inputMap, "CtcEvent");
  }
}
