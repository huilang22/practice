/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceExternalGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceExternalGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceExternalGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseKeyData ServiceXIDGetIn;
/**
 *
 * Constructor to create a  ServiceExternalGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceExternalGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseKeyData ServiceXIDGetInIn) {
    super(id, context, "ServiceExternalGet");
    ServiceXIDGetIn = ServiceXIDGetInIn;
  }

  public void translateToMap() {
    if (ServiceXIDGetIn != null) {
      ServiceXIDGetIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceXIDGetIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceXIDGetInIn Value of the ServiceXIDGetIn
 *
 */

  public void setService(ServiceObjectBaseKeyData ServiceXIDGetInIn) {
    ServiceXIDGetIn = ServiceXIDGetInIn;
  }

  public void translateFromMap() {
    ServiceXIDGetIn = ServiceObjectBaseKeyHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseKeyData getService( ) {
    return ServiceXIDGetIn;
  }

}
