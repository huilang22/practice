/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectFilter ServiceOrderExternalFindWEDIn;
/**
 *
 * Constructor to create a  ServiceOrderFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectFilter ServiceOrderExternalFindWEDInIn) {
    super(id, context, "ServiceOrderFindWithExtendedData");
    ServiceOrderExternalFindWEDIn = ServiceOrderExternalFindWEDInIn;
  }

  public void translateToMap() {
    if (ServiceOrderExternalFindWEDIn != null) {
      Integer index =  ServiceOrderExternalFindWEDIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderExternalFindWEDIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderExternalFindWEDInIn Value of the ServiceOrderExternalFindWEDIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectFilter ServiceOrderExternalFindWEDInIn) {
    ServiceOrderExternalFindWEDIn = ServiceOrderExternalFindWEDInIn;
  }

  public void translateFromMap() {
    ServiceOrderExternalFindWEDIn = ServiceOrderObjectHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectFilter getServiceOrder( ) {
    return ServiceOrderExternalFindWEDIn;
  }

}
