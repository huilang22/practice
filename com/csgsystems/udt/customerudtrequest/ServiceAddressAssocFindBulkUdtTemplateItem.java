/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocObjectFilter SADDRAFindIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectFilter SADDRAFindInIn) {
    super(id, context, "ServiceAddressAssocFind");
    SADDRAFindIn = SADDRAFindInIn;
  }

  public void translateToMap() {
    if (SADDRAFindIn != null) {
      Integer index =  SADDRAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRAFindIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssoc
 * @param SADDRAFindInIn Value of the SADDRAFindIn
 *
 */

  public void setServiceAddressAssoc(ServiceAddressAssocObjectFilter SADDRAFindInIn) {
    SADDRAFindIn = SADDRAFindInIn;
  }

  public void translateFromMap() {
    SADDRAFindIn = ServiceAddressAssocObjectHelper.fromMapFilter(inputMap, "ServiceAddressAssoc");
  }

/**
 *
 * Gets the ServiceAddressAssoc
 * @return Value of the ServiceAddressAssoc
 *
 */

  public ServiceAddressAssocObjectFilter getServiceAddressAssoc( ) {
    return SADDRAFindIn;
  }

}
