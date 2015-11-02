/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectData noOpInIn) {
    super(id, context, "InvsLocationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
/**
 *
 * Sets the  InvsLocation
 * @param noOpInIn InvsLocationObjectData to set
 *
 */
  public void setInvsLocation(InvsLocationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocation passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationObjectData getInvsLocation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationObjectHelper.fromMap(inputMap, "InvsLocation");
  }
}
