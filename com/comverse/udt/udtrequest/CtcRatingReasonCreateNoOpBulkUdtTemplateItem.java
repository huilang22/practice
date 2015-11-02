/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcRatingReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcRatingReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectData noOpInIn) {
    super(id, context, "CtcRatingReasonCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(noOpIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
/**
 *
 * Sets the  CtcRatingReason
 * @param noOpInIn CtcRatingReasonObjectData to set
 *
 */
  public void setCtcRatingReason(CtcRatingReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRatingReason passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingReasonObjectData getCtcRatingReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingReasonObjectHelper.fromMap(inputMap, "CtcRatingReason");
  }
}
