/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimJobCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimJobCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimJobObjectData noOpIn;

/**
 *
 * Constructor to create a   InvSimJobCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimJobCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobObjectData noOpInIn) {
    super(id, context, "InvSimJobCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(noOpIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
/**
 *
 * Sets the  InvSimJob
 * @param noOpInIn InvSimJobObjectData to set
 *
 */
  public void setInvSimJob(InvSimJobObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobObjectData getInvSimJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimJobObjectHelper.fromMap(inputMap, "InvSimJob");
  }
}
