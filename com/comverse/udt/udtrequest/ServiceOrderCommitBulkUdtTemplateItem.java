/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCommitBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderCommitBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderCommitBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderCommitIn;
/**
 *
 * Constructor to create a  ServiceOrderCommitBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderCommitBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderCommitInIn) {
    super(id, context, "ServiceOrderCommit");
    ServiceOrderCommitIn = ServiceOrderCommitInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCommitIn != null) {
      ServiceOrderCommitIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderCommitIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderCommitInIn Value of the ServiceOrderCommitIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderCommitInIn) {
    ServiceOrderCommitIn = ServiceOrderCommitInIn;
  }

  public void translateFromMap() {
    ServiceOrderCommitIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderCommitIn;
  }

}
