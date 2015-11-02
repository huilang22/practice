/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimCardConfigCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimCardConfigCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimCardConfigObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimCardConfigCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimCardConfigCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectData noOpInIn) {
    super(id, context, "InvsSimCardConfigCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
/**
 *
 * Sets the  InvsSimCardConfig
 * @param noOpInIn InvsSimCardConfigObjectData to set
 *
 */
  public void setInvsSimCardConfig(InvsSimCardConfigObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimCardConfig passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigObjectData getInvsSimCardConfig() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimCardConfigObjectHelper.fromMap(inputMap, "InvsSimCardConfig");
  }
}
