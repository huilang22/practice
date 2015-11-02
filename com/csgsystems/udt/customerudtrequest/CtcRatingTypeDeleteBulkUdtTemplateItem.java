/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcRatingTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcRatingTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectKeyData DeleteInIn) {
    super(id, context, "CtcRatingTypeDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingTypeObjectKeyData").get("CtcRatingTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcRatingTypeObjectKeyHelper.fromMap(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectKeyData getCtcRatingType( ) {
    return DeleteIn;
  }

}
