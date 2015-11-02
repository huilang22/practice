/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobObjectData noOpIn;

/**
 *
 * Constructor to create a   InvJobDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectData noOpInIn) {
    super(id, context, "InvJobDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvJob", InvJobObjectHelper.toMap(noOpIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }
/**
 *
 * Sets the  InvJob
 * @param noOpInIn InvJobObjectData to set
 *
 */
  public void setInvJob(InvJobObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJob passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobObjectData getInvJob() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobObjectHelper.fromMap(inputMap, "InvJob");
  }
}
