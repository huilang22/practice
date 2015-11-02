/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSubjMatterRatingGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSubjMatterRatingGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSubjMatterRatingObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSubjMatterRatingGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSubjMatterRatingGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSubjMatterRatingObjectData noOpInIn) {
    super(id, context, "InvsSubjMatterRatingGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(noOpIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
/**
 *
 * Sets the  InvsSubjMatterRating
 * @param noOpInIn InvsSubjMatterRatingObjectData to set
 *
 */
  public void setInvsSubjMatterRating(InvsSubjMatterRatingObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSubjMatterRating passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSubjMatterRatingObjectData getInvsSubjMatterRating() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSubjMatterRatingObjectHelper.fromMap(inputMap, "InvsSubjMatterRating");
  }
}
