/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcRatingUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectData UpdateInIn) {
    super(id, context, "CtcRatingUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcRating", CtcRatingObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }


/**
 *
 * Sets the CtcRating
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcRating(CtcRatingObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcRatingObjectHelper.fromMap(inputMap, "CtcRating");
  }

/**
 *
 * Gets the CtcRating
 * @return Value of the CtcRating
 *
 */

  public CtcRatingObjectData getCtcRating( ) {
    return UpdateIn;
  }

}
