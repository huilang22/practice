/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsReasonUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsReasonUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsReasonUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsReasonUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectData noOpInIn) {
    super(id, context, "InvsReasonUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(noOpIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
/**
 *
 * Sets the  InvsReason
 * @param noOpInIn InvsReasonObjectData to set
 *
 */
  public void setInvsReason(InvsReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsReason passed into the constructor
 * @return Simulated response
 *
 */
  public InvsReasonObjectData getInvsReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsReasonObjectHelper.fromMap(inputMap, "InvsReason");
  }
}
