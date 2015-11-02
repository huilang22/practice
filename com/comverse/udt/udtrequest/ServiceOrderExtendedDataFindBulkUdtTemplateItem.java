/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderEDFindIn;
/**
 *
 * Constructor to create a  ServiceOrderExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderEDFindInIn) {
    super(id, context, "ServiceOrderExtendedDataFind");
    ServiceOrderEDFindIn = ServiceOrderEDFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderEDFindIn != null) {
      ServiceOrderEDFindIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderEDFindIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderEDFindInIn Value of the ServiceOrderEDFindIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderEDFindInIn) {
    ServiceOrderEDFindIn = ServiceOrderEDFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderEDFindIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderEDFindIn;
  }

}
