/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvModJobCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvModJobCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvModJobObjectData noOpIn;

/**
 *
 * Constructor to create a   InvModJobCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvModJobCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectData noOpInIn) {
    super(id, context, "InvModJobCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectHelper.toMap(noOpIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
/**
 *
 * Sets the  InvModJob
 * @param noOpInIn InvModJobObjectData to set
 *
 */
  public void setInvModJob(InvModJobObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvModJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobObjectData getInvModJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvModJobObjectHelper.fromMap(inputMap, "InvModJob");
  }
}
