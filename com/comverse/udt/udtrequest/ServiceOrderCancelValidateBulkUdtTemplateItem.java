/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderCancelValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderCancelValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderCancelValidateIn;
/**
 *
 * Constructor to create a  ServiceOrderCancelValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderCancelValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderCancelValidateInIn) {
    super(id, context, "ServiceOrderCancelValidate");
    ServiceOrderCancelValidateIn = ServiceOrderCancelValidateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCancelValidateIn != null) {
      ServiceOrderCancelValidateIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderCancelValidateIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderCancelValidateInIn Value of the ServiceOrderCancelValidateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderCancelValidateInIn) {
    ServiceOrderCancelValidateIn = ServiceOrderCancelValidateInIn;
  }

  public void translateFromMap() {
    ServiceOrderCancelValidateIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderCancelValidateIn;
  }

}
