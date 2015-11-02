/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsMccCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsMccCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsMccCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsMccCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsMccCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMccCodeObjectData noOpInIn) {
    super(id, context, "InvsMccCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(noOpIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }
/**
 *
 * Sets the  InvsMccCode
 * @param noOpInIn InvsMccCodeObjectData to set
 *
 */
  public void setInvsMccCode(InvsMccCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsMccCode passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMccCodeObjectData getInvsMccCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsMccCodeObjectHelper.fromMap(inputMap, "InvsMccCode");
  }
}
