/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData noOpInIn) {
    super(id, context, "ServiceOrderCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(noOpIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
/**
 *
 * Sets the  ServiceOrder
 * @param noOpInIn ServiceOrderObjectBaseData to set
 *
 */
  public void setServiceOrder(ServiceOrderObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrder passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectBaseData getServiceOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
  }
}
