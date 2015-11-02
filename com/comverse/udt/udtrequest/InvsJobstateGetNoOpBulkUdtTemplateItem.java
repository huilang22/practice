/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobstateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobstateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobstateObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsJobstateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobstateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstateObjectData noOpInIn) {
    super(id, context, "InvsJobstateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }
/**
 *
 * Sets the  InvsJobstate
 * @param noOpInIn InvsJobstateObjectData to set
 *
 */
  public void setInvsJobstate(InvsJobstateObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobstate passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstateObjectData getInvsJobstate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobstateObjectHelper.fromMap(inputMap, "InvsJobstate");
  }
}
