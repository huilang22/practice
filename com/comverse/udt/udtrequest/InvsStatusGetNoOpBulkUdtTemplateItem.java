/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectData noOpInIn) {
    super(id, context, "InvsStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(noOpIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
/**
 *
 * Sets the  InvsStatus
 * @param noOpInIn InvsStatusObjectData to set
 *
 */
  public void setInvsStatus(InvsStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStatus passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStatusObjectData getInvsStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStatusObjectHelper.fromMap(inputMap, "InvsStatus");
  }
}
