/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcRatingCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectData CreateInIn) {
    super(id, context, "CtcRatingCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcRating", CtcRatingObjectHelper.toMap(CreateIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }


/**
 *
 * Sets the CtcRating
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcRating(CtcRatingObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcRatingObjectHelper.fromMap(inputMap, "CtcRating");
  }

/**
 *
 * Gets the CtcRating
 * @return Value of the CtcRating
 *
 */

  public CtcRatingObjectData getCtcRating( ) {
    return CreateIn;
  }

}
