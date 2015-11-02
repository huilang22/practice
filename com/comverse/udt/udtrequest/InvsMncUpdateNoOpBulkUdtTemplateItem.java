/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsMncUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsMncUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsMncObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsMncUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsMncUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectData noOpInIn) {
    super(id, context, "InvsMncUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(noOpIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
/**
 *
 * Sets the  InvsMnc
 * @param noOpInIn InvsMncObjectData to set
 *
 */
  public void setInvsMnc(InvsMncObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsMnc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMncObjectData getInvsMnc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsMncObjectHelper.fromMap(inputMap, "InvsMnc");
  }
}
