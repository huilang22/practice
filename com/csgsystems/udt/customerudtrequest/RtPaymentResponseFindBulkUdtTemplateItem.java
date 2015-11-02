/*
 * Generated code DO NOT EDIT
 * Generated file: RtPaymentResponseFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a RtPaymentResponseFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RtPaymentResponseFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RtPaymentResponseObjectFilter RPRFindIn;
/**
 *
 * Constructor to create a  RtPaymentResponseFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RtPaymentResponseFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RtPaymentResponseObjectFilter RPRFindInIn) {
    super(id, context, "RtPaymentResponseFind");
    RPRFindIn = RPRFindInIn;
  }

  public void translateToMap() {
    if (RPRFindIn != null) {
      Integer index =  RPRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(RPRFindIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }


/**
 *
 * Sets the RtPaymentResponse
 * @param RPRFindInIn Value of the RPRFindIn
 *
 */

  public void setRtPaymentResponse(RtPaymentResponseObjectFilter RPRFindInIn) {
    RPRFindIn = RPRFindInIn;
  }

  public void translateFromMap() {
    RPRFindIn = RtPaymentResponseObjectHelper.fromMapFilter(inputMap, "RtPaymentResponse");
  }

/**
 *
 * Gets the RtPaymentResponse
 * @return Value of the RtPaymentResponse
 *
 */

  public RtPaymentResponseObjectFilter getRtPaymentResponse( ) {
    return RPRFindIn;
  }

}
