/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdReserveEndUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdReserveEndUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdReserveEndObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdReserveEndUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdReserveEndUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectData noOpInIn) {
    super(id, context, "InvdReserveEndUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(noOpIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
/**
 *
 * Sets the  InvdReserveEnd
 * @param noOpInIn InvdReserveEndObjectData to set
 *
 */
  public void setInvdReserveEnd(InvdReserveEndObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdReserveEnd passed into the constructor
 * @return Simulated response
 *
 */
  public InvdReserveEndObjectData getInvdReserveEnd() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdReserveEndObjectHelper.fromMap(inputMap, "InvdReserveEnd");
  }
}
