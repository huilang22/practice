/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWithLogicalFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderWithLogicalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderWithLogicalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseFilter ServiceOrderWithLogicalFindIn;
/**
 *
 * Constructor to create a  ServiceOrderWithLogicalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderWithLogicalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseFilter ServiceOrderWithLogicalFindInIn) {
    super(id, context, "ServiceOrderWithLogicalFind");
    ServiceOrderWithLogicalFindIn = ServiceOrderWithLogicalFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderWithLogicalFindIn != null) {
      Integer index =  ServiceOrderWithLogicalFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderWithLogicalFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderWithLogicalFindInIn Value of the ServiceOrderWithLogicalFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseFilter ServiceOrderWithLogicalFindInIn) {
    ServiceOrderWithLogicalFindIn = ServiceOrderWithLogicalFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderWithLogicalFindIn = ServiceOrderObjectBaseHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseFilter getServiceOrder( ) {
    return ServiceOrderWithLogicalFindIn;
  }

}
