/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemRatingReasonDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemRatingReasonDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemRatingReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemRatingReasonDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemRatingReasonDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectData noOpInIn) {
    super(id, context, "CtcItemRatingReasonDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
/**
 *
 * Sets the  CtcItemRatingReason
 * @param noOpInIn CtcItemRatingReasonObjectData to set
 *
 */
  public void setCtcItemRatingReason(CtcItemRatingReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemRatingReason passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingReasonObjectData getCtcItemRatingReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemRatingReasonObjectHelper.fromMap(inputMap, "CtcItemRatingReason");
  }
}
