/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingReasonObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcRatingReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectKeyData GetInIn) {
    super(id, context, "CtcRatingReasonGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingReasonObjectKeyData").get("CtcRatingReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRatingReason
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcRatingReason(CtcRatingReasonObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcRatingReasonObjectKeyHelper.fromMap(inputMap, "CtcRatingReason");
  }

/**
 *
 * Gets the CtcRatingReason
 * @return Value of the CtcRatingReason
 *
 */

  public CtcRatingReasonObjectKeyData getCtcRatingReason( ) {
    return GetIn;
  }

}
