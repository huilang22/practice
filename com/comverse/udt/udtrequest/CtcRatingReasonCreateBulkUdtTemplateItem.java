/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingReasonObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcRatingReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingReasonObjectData CreateInIn) {
    super(id, context, "CtcRatingReasonCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(CreateIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }


/**
 *
 * Sets the CtcRatingReason
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcRatingReason(CtcRatingReasonObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcRatingReasonObjectHelper.fromMap(inputMap, "CtcRatingReason");
  }

/**
 *
 * Gets the CtcRatingReason
 * @return Value of the CtcRatingReason
 *
 */

  public CtcRatingReasonObjectData getCtcRatingReason( ) {
    return CreateIn;
  }

}
