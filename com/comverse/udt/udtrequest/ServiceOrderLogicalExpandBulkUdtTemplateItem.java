/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderLogicalExpandBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderLogicalExpandBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderLogicalExpandBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderLogicalExpandIn;
/**
 *
 * Constructor to create a  ServiceOrderLogicalExpandBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderLogicalExpandBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderLogicalExpandInIn) {
    super(id, context, "ServiceOrderLogicalExpand");
    ServiceOrderLogicalExpandIn = ServiceOrderLogicalExpandInIn;
  }

  public void translateToMap() {
    if (ServiceOrderLogicalExpandIn != null) {
      ServiceOrderLogicalExpandIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderLogicalExpandIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderLogicalExpandInIn Value of the ServiceOrderLogicalExpandIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderLogicalExpandInIn) {
    ServiceOrderLogicalExpandIn = ServiceOrderLogicalExpandInIn;
  }

  public void translateFromMap() {
    ServiceOrderLogicalExpandIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderLogicalExpandIn;
  }

}
