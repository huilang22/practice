/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcItemRatingReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemRatingReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemRatingReasonObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcItemRatingReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemRatingReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemRatingReasonObjectData CreateInIn) {
    super(id, context, "CtcItemRatingReasonCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }


/**
 *
 * Sets the CtcItemRatingReason
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcItemRatingReason(CtcItemRatingReasonObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcItemRatingReasonObjectHelper.fromMap(inputMap, "CtcItemRatingReason");
  }

/**
 *
 * Gets the CtcItemRatingReason
 * @return Value of the CtcItemRatingReason
 *
 */

  public CtcItemRatingReasonObjectData getCtcItemRatingReason( ) {
    return CreateIn;
  }

}
