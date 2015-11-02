/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingReasonUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CtcRatingReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingReasonObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcRatingReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectData UpdateInIn) {
    super(id, context, "CtcRatingReasonUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }


/**
 *
 * Sets the CtcRatingReason
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcRatingReason(CtcRatingReasonObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcRatingReasonObjectHelper.fromMap(inputMap, "CtcRatingReason");
  }

/**
 *
 * Gets the CtcRatingReason
 * @return Value of the CtcRatingReason
 *
 */

  public CtcRatingReasonObjectData getCtcRatingReason( ) {
    return UpdateIn;
  }

}
