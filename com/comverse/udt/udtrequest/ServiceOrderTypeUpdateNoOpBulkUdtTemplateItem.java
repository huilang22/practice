/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectData noOpInIn) {
    super(id, context, "ServiceOrderTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
/**
 *
 * Sets the  ServiceOrderType
 * @param noOpInIn ServiceOrderTypeObjectData to set
 *
 */
  public void setServiceOrderType(ServiceOrderTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderType passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderTypeObjectData getServiceOrderType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderTypeObjectHelper.fromMap(inputMap, "ServiceOrderType");
  }
}
