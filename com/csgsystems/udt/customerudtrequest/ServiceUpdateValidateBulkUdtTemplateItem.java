/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceUpdateValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceUpdateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceUpdateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseData ServiceUpdValidateIn;
/**
 *
 * Constructor to create a  ServiceUpdateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceUpdateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData ServiceUpdValidateInIn) {
    super(id, context, "ServiceUpdateValidate");
    ServiceUpdValidateIn = ServiceUpdValidateInIn;
  }

  public void translateToMap() {
    if (ServiceUpdValidateIn != null) {
      ServiceUpdValidateIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceUpdValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceUpdValidateInIn Value of the ServiceUpdValidateIn
 *
 */

  public void setService(ServiceObjectBaseData ServiceUpdValidateInIn) {
    ServiceUpdValidateIn = ServiceUpdValidateInIn;
  }

  public void translateFromMap() {
    ServiceUpdValidateIn = ServiceObjectBaseHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData getService( ) {
    return ServiceUpdValidateIn;
  }

}
