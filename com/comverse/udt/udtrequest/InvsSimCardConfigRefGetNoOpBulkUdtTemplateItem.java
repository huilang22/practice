/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimCardConfigRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimCardConfigRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimCardConfigRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimCardConfigRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimCardConfigRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectData noOpInIn) {
    super(id, context, "InvsSimCardConfigRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
/**
 *
 * Sets the  InvsSimCardConfigRef
 * @param noOpInIn InvsSimCardConfigRefObjectData to set
 *
 */
  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimCardConfigRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimCardConfigRefObjectHelper.fromMap(inputMap, "InvsSimCardConfigRef");
  }
}
