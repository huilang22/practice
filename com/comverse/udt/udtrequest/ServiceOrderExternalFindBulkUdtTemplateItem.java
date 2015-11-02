/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectFilter ServiceOrderExternalXFindIn;
/**
 *
 * Constructor to create a  ServiceOrderExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectFilter ServiceOrderExternalXFindInIn) {
    super(id, context, "ServiceOrderExternalFind");
    ServiceOrderExternalXFindIn = ServiceOrderExternalXFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderExternalXFindIn != null) {
      Integer index =  ServiceOrderExternalXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderExternalXFindIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderExternalXFindInIn Value of the ServiceOrderExternalXFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectFilter ServiceOrderExternalXFindInIn) {
    ServiceOrderExternalXFindIn = ServiceOrderExternalXFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderExternalXFindIn = ServiceOrderObjectHelper.fromMapFilter(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectFilter getServiceOrder( ) {
    return ServiceOrderExternalXFindIn;
  }

}
