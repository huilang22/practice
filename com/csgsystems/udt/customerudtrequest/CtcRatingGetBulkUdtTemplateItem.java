/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcRatingGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectKeyData GetInIn) {
    super(id, context, "CtcRatingGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingObjectKeyData").get("CtcRatingObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRating
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcRating(CtcRatingObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcRatingObjectKeyHelper.fromMap(inputMap, "CtcRating");
  }

/**
 *
 * Gets the CtcRating
 * @return Value of the CtcRating
 *
 */

  public CtcRatingObjectKeyData getCtcRating( ) {
    return GetIn;
  }

}
