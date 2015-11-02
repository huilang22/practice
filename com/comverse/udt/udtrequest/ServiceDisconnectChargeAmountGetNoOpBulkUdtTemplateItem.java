/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceDisconnectChargeAmountGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceDisconnectChargeAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceDisconnectChargeAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceDisconnectChargeAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   ServiceDisconnectChargeAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceDisconnectChargeAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceDisconnectChargeAmountGetOutputData noOpInIn) {
    super(id, context, "ServiceDisconnectChargeAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceDisconnectChargeAmountGetOutputData", ServiceDisconnectChargeAmountGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  ServiceDisconnectChargeAmountGetOutputData
 * @param noOpInIn ServiceDisconnectChargeAmountGetOutputData to set
 *
 */
  public void setServiceDisconnectChargeAmountGetOutputData(ServiceDisconnectChargeAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceDisconnectChargeAmountGetOutputData getServiceDisconnectChargeAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceDisconnectChargeAmountGetOutputHelper.fromMap(inputMap);
  }
}
