/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RtPaymentResponseGetBulkUdtTemplateItem.java
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
 * Class used to create a RtPaymentResponseGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RtPaymentResponseGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RtPaymentResponseObjectData RPRGetIn;
/**
 *
 * Constructor to create a  RtPaymentResponseGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RtPaymentResponseGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RtPaymentResponseObjectData RPRGetInIn) {
    super(id, context, "RtPaymentResponseGet");
    RPRGetIn = RPRGetInIn;
  }

  public void translateToMap() {
    if (RPRGetIn != null) {
      RPRGetIn.resetFlags(true, true);
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(RPRGetIn, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }


/**
 *
 * Sets the RtPaymentResponse
 * @param RPRGetInIn Value of the RPRGetIn
 *
 */

  public void setRtPaymentResponse(RtPaymentResponseObjectData RPRGetInIn) {
    RPRGetIn = RPRGetInIn;
  }

  public void translateFromMap() {
    RPRGetIn = RtPaymentResponseObjectHelper.fromMap(inputMap, "RtPaymentResponse");
  }

/**
 *
 * Gets the RtPaymentResponse
 * @return Value of the RtPaymentResponse
 *
 */

  public RtPaymentResponseObjectData getRtPaymentResponse( ) {
    return RPRGetIn;
  }

}
