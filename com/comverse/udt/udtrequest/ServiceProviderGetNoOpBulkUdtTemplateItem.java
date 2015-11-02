/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ServiceProviderGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceProviderGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceProviderObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceProviderGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceProviderGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectData noOpInIn) {
    super(id, context, "ServiceProviderGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(noOpIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
/**
 *
 * Sets the  ServiceProvider
 * @param noOpInIn ServiceProviderObjectData to set
 *
 */
  public void setServiceProvider(ServiceProviderObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceProvider passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceProviderObjectData getServiceProvider() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceProviderObjectHelper.fromMap(inputMap, "ServiceProvider");
  }
}
