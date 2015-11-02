/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvContainerFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderInvContainerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderInvContainerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectData ServiceOrderInvContainerFindIn;
/**
 *
 * Constructor to create a  ServiceOrderInvContainerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderInvContainerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectData ServiceOrderInvContainerFindInIn) {
    super(id, context, "ServiceOrderInvContainerFind");
    ServiceOrderInvContainerFindIn = ServiceOrderInvContainerFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderInvContainerFindIn != null) {
      ServiceOrderInvContainerFindIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ServiceOrderInvContainerFindIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderInvContainerFindInIn Value of the ServiceOrderInvContainerFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ServiceOrderInvContainerFindInIn) {
    ServiceOrderInvContainerFindIn = ServiceOrderInvContainerFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderInvContainerFindIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ServiceOrderInvContainerFindIn;
  }

}
