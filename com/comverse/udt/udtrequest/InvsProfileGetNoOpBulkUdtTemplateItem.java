/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsProfileGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsProfileGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsProfileObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsProfileGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsProfileGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectData noOpInIn) {
    super(id, context, "InvsProfileGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(noOpIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
/**
 *
 * Sets the  InvsProfile
 * @param noOpInIn InvsProfileObjectData to set
 *
 */
  public void setInvsProfile(InvsProfileObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsProfile passed into the constructor
 * @return Simulated response
 *
 */
  public InvsProfileObjectData getInvsProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsProfileObjectHelper.fromMap(inputMap, "InvsProfile");
  }
}
