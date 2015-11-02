/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceCenterTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceCenterTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceCenterTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceCenterTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceCenterTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterTypeObjectData noOpInIn) {
    super(id, context, "ServiceCenterTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(noOpIn, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }
/**
 *
 * Sets the  ServiceCenterType
 * @param noOpInIn ServiceCenterTypeObjectData to set
 *
 */
  public void setServiceCenterType(ServiceCenterTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceCenterType passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterTypeObjectData getServiceCenterType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceCenterTypeObjectHelper.fromMap(inputMap, "ServiceCenterType");
  }
}
