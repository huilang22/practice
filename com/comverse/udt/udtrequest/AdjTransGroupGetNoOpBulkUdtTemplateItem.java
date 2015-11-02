/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a AdjTransGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjTransGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ATGObjectData noOpIn;

/**
 *
 * Constructor to create a   AdjTransGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjTransGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ATGObjectData noOpInIn) {
    super(id, context, "AdjTransGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdjTransGroup", ATGObjectHelper.toMap(noOpIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
/**
 *
 * Sets the  AdjTransGroup
 * @param noOpInIn ATGObjectData to set
 *
 */
  public void setAdjTransGroup(ATGObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjTransGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ATGObjectData getAdjTransGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ATGObjectHelper.fromMap(inputMap, "AdjTransGroup");
  }
}
