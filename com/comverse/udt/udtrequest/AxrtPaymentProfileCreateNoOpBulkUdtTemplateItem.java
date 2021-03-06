/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AxrtPaymentProfileCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AxrtPaymentProfileCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AxrtPaymentProfileObjectData noOpIn;

/**
 *
 * Constructor to create a   AxrtPaymentProfileCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AxrtPaymentProfileCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AxrtPaymentProfileObjectData noOpInIn) {
    super(id, context, "AxrtPaymentProfileCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(noOpIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
/**
 *
 * Sets the  AxrtPaymentProfile
 * @param noOpInIn AxrtPaymentProfileObjectData to set
 *
 */
  public void setAxrtPaymentProfile(AxrtPaymentProfileObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AxrtPaymentProfile passed into the constructor
 * @return Simulated response
 *
 */
  public AxrtPaymentProfileObjectData getAxrtPaymentProfile() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AxrtPaymentProfileObjectHelper.fromMap(inputMap, "AxrtPaymentProfile");
  }
}
