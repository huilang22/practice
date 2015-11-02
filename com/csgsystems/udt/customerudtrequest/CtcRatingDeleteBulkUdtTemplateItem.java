/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcRatingDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingObjectKeyData DeleteInIn) {
    super(id, context, "CtcRatingDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingObjectKeyData").get("CtcRatingObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRating
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcRating(CtcRatingObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcRatingObjectKeyHelper.fromMap(inputMap, "CtcRating");
  }

/**
 *
 * Gets the CtcRating
 * @return Value of the CtcRating
 *
 */

  public CtcRatingObjectKeyData getCtcRating( ) {
    return DeleteIn;
  }

}
