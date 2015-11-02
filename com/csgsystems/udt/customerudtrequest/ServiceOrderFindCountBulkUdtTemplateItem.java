/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderFindCountBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseFilter ServiceOrderFindCountIn;
/**
 *
 * Constructor to create a  ServiceOrderFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseFilter ServiceOrderFindCountInIn) {
    super(id, context, "ServiceOrderFindCount");
    ServiceOrderFindCountIn = ServiceOrderFindCountInIn;
  }

  public void translateToMap() {
    if (ServiceOrderFindCountIn != null) {
      Integer index =  ServiceOrderFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderFindCountIn, new HashMap(), "ServiceOrderCount").get("ServiceOrderCount"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderFindCountInIn Value of the ServiceOrderFindCountIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseFilter ServiceOrderFindCountInIn) {
    ServiceOrderFindCountIn = ServiceOrderFindCountInIn;
  }

  public void translateFromMap() {
    ServiceOrderFindCountIn = ServiceOrderObjectBaseHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseFilter getServiceOrder( ) {
    return ServiceOrderFindCountIn;
  }

}
