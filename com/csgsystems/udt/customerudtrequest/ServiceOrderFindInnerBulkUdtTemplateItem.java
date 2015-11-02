/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderFindInnerBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderFindInnerBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderFindInnerBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseFilter ServiceOrderInnerFindIn;
/**
 *
 * Constructor to create a  ServiceOrderFindInnerBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderFindInnerBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseFilter ServiceOrderInnerFindInIn) {
    super(id, context, "ServiceOrderFindInner");
    ServiceOrderInnerFindIn = ServiceOrderInnerFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderInnerFindIn != null) {
      Integer index =  ServiceOrderInnerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderInnerFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderInnerFindInIn Value of the ServiceOrderInnerFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseFilter ServiceOrderInnerFindInIn) {
    ServiceOrderInnerFindIn = ServiceOrderInnerFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderInnerFindIn = ServiceOrderObjectBaseHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseFilter getServiceOrder( ) {
    return ServiceOrderInnerFindIn;
  }

}
