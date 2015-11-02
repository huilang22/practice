/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindCountBulkUdtTemplateItem.java
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
