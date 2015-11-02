/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsStatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStatusObjectData InvsStatusCreateIn;
/**
 *
 * Constructor to create a  InvsStatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectData InvsStatusCreateInIn) {
    super(id, context, "InvsStatusCreate");
    InvsStatusCreateIn = InvsStatusCreateInIn;
  }

  public void translateToMap() {
    if (InvsStatusCreateIn != null) {
      InvsStatusCreateIn.resetFlags(true, true);
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusCreateIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }


/**
 *
 * Sets the InvsStatus
 * @param InvsStatusCreateInIn Value of the InvsStatusCreateIn
 *
 */

  public void setInvsStatus(InvsStatusObjectData InvsStatusCreateInIn) {
    InvsStatusCreateIn = InvsStatusCreateInIn;
  }

  public void translateFromMap() {
    InvsStatusCreateIn = InvsStatusObjectHelper.fromMap(inputMap, "InvsStatus");
  }

/**
 *
 * Gets the InvsStatus
 * @return Value of the InvsStatus
 *
 */

  public InvsStatusObjectData getInvsStatus( ) {
    return InvsStatusCreateIn;
  }

}
