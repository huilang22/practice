/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceFindCountBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceXIDFindCIn;
/**
 *
 * Constructor to create a  ServiceFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceXIDFindCInIn) {
    super(id, context, "ServiceFindCount");
    ServiceXIDFindCIn = ServiceXIDFindCInIn;
  }

  public void translateToMap() {
    if (ServiceXIDFindCIn != null) {
      Integer index =  ServiceXIDFindCIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindCIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceXIDFindCInIn Value of the ServiceXIDFindCIn
 *
 */

  public void setService(ServiceObjectFilter ServiceXIDFindCInIn) {
    ServiceXIDFindCIn = ServiceXIDFindCInIn;
  }

  public void translateFromMap() {
    ServiceXIDFindCIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceXIDFindCIn;
  }

}
