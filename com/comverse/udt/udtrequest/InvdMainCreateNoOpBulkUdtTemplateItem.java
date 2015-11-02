/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdMainCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectData noOpInIn) {
    super(id, context, "InvdMainCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdMain", InvdMainObjectHelper.toMap(noOpIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
/**
 *
 * Sets the  InvdMain
 * @param noOpInIn InvdMainObjectData to set
 *
 */
  public void setInvdMain(InvdMainObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMain passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainObjectData getInvdMain() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainObjectHelper.fromMap(inputMap, "InvdMain");
  }
}
