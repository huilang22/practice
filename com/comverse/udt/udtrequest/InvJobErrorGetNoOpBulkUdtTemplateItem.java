/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobErrorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobErrorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobErrorObjectData noOpIn;

/**
 *
 * Constructor to create a   InvJobErrorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobErrorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectData noOpInIn) {
    super(id, context, "InvJobErrorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(noOpIn, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
/**
 *
 * Sets the  InvJobError
 * @param noOpInIn InvJobErrorObjectData to set
 *
 */
  public void setInvJobError(InvJobErrorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobError passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobErrorObjectData getInvJobError() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobErrorObjectHelper.fromMap(inputMap, "InvJobError");
  }
}
