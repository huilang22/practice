/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseFilter ServiceOrderFindIn;
/**
 *
 * Constructor to create a  ServiceOrderFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseFilter ServiceOrderFindInIn) {
    super(id, context, "ServiceOrderFind");
    ServiceOrderFindIn = ServiceOrderFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderFindIn != null) {
      Integer index =  ServiceOrderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderFindInIn Value of the ServiceOrderFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseFilter ServiceOrderFindInIn) {
    ServiceOrderFindIn = ServiceOrderFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderFindIn = ServiceOrderObjectBaseHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseFilter getServiceOrder( ) {
    return ServiceOrderFindIn;
  }

}
