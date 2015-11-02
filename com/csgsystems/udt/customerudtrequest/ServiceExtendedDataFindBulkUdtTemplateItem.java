/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseKeyData sedfIn;
/**
 *
 * Constructor to create a  ServiceExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseKeyData sedfInIn) {
    super(id, context, "ServiceExtendedDataFind");
    sedfIn = sedfInIn;
  }

  public void translateToMap() {
    if (sedfIn != null) {
      sedfIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(sedfIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Service
 * @param sedfInIn Value of the sedfIn
 *
 */

  public void setService(ServiceObjectBaseKeyData sedfInIn) {
    sedfIn = sedfInIn;
  }

  public void translateFromMap() {
    sedfIn = ServiceObjectBaseKeyHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseKeyData getService( ) {
    return sedfIn;
  }

}
