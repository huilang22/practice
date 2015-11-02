/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAlternateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAlternateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAlternateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ServiceAlternateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAlternateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData noOpInIn) {
    super(id, context, "ServiceAlternateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseHelper.toMap(noOpIn, new HashMap(), "Service").get("Service"));
    }
  }
/**
 *
 * Sets the  Service
 * @param noOpInIn ServiceObjectBaseData to set
 *
 */
  public void setService(ServiceObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Service passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectBaseData getService() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceObjectBaseHelper.fromMap(inputMap, "Service");
  }
}
