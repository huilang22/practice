/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStatusUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStatusObjectData InvsStatusUpdateIn;
/**
 *
 * Constructor to create a  InvsStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectData InvsStatusUpdateInIn) {
    super(id, context, "InvsStatusUpdate");
    InvsStatusUpdateIn = InvsStatusUpdateInIn;
  }

  public void translateToMap() {
    if (InvsStatusUpdateIn != null) {
      InvsStatusUpdateIn.resetFlags(true, true);
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusUpdateIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }


/**
 *
 * Sets the InvsStatus
 * @param InvsStatusUpdateInIn Value of the InvsStatusUpdateIn
 *
 */

  public void setInvsStatus(InvsStatusObjectData InvsStatusUpdateInIn) {
    InvsStatusUpdateIn = InvsStatusUpdateInIn;
  }

  public void translateFromMap() {
    InvsStatusUpdateIn = InvsStatusObjectHelper.fromMap(inputMap, "InvsStatus");
  }

/**
 *
 * Gets the InvsStatus
 * @return Value of the InvsStatus
 *
 */

  public InvsStatusObjectData getInvsStatus( ) {
    return InvsStatusUpdateIn;
  }

}
