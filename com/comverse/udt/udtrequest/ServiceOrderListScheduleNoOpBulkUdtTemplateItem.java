/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderListScheduleNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderListScheduleNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderListScheduleNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderListScheduleOutputData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderListScheduleNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderListScheduleNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderListScheduleOutputData noOpInIn) {
    super(id, context, "ServiceOrderListSchedule");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrderListScheduleOutputData", ServiceOrderListScheduleOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  ServiceOrderListScheduleOutputData
 * @param noOpInIn ServiceOrderListScheduleOutputData to set
 *
 */
  public void setServiceOrderListScheduleOutputData(ServiceOrderListScheduleOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderListScheduleOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderListScheduleOutputData getServiceOrderListScheduleOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderListScheduleOutputHelper.fromMap(inputMap);
  }
}
