/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceExternalFindAllBulkUdtTemplateItem.java
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
 * Class used to create a ServiceExternalFindAllBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceExternalFindAllBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceXIDFindAIn;
/**
 *
 * Constructor to create a  ServiceExternalFindAllBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceExternalFindAllBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceXIDFindAInIn) {
    super(id, context, "ServiceExternalFindAll");
    ServiceXIDFindAIn = ServiceXIDFindAInIn;
  }

  public void translateToMap() {
    if (ServiceXIDFindAIn != null) {
      Integer index =  ServiceXIDFindAIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindAIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceXIDFindAInIn Value of the ServiceXIDFindAIn
 *
 */

  public void setService(ServiceObjectFilter ServiceXIDFindAInIn) {
    ServiceXIDFindAIn = ServiceXIDFindAInIn;
  }

  public void translateFromMap() {
    ServiceXIDFindAIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceXIDFindAIn;
  }

}
