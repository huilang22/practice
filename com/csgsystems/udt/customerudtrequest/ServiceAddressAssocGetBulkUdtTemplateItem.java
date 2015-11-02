/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocObjectKeyData SADDRAGetIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectKeyData SADDRAGetInIn) {
    super(id, context, "ServiceAddressAssocGet");
    SADDRAGetIn = SADDRAGetInIn;
  }

  public void translateToMap() {
    if (SADDRAGetIn != null) {
      SADDRAGetIn.resetFlags(true, true);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectKeyHelper.toMap(SADDRAGetIn, new HashMap(), "ServiceAddressAssocObjectKeyData").get("ServiceAddressAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssoc
 * @param SADDRAGetInIn Value of the SADDRAGetIn
 *
 */

  public void setServiceAddressAssoc(ServiceAddressAssocObjectKeyData SADDRAGetInIn) {
    SADDRAGetIn = SADDRAGetInIn;
  }

  public void translateFromMap() {
    SADDRAGetIn = ServiceAddressAssocObjectKeyHelper.fromMap(inputMap, "ServiceAddressAssoc");
  }

/**
 *
 * Gets the ServiceAddressAssoc
 * @return Value of the ServiceAddressAssoc
 *
 */

  public ServiceAddressAssocObjectKeyData getServiceAddressAssoc( ) {
    return SADDRAGetIn;
  }

}
