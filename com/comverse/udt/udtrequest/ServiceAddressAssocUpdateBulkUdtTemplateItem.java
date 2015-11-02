/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocObjectData SADDRAUpdateIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectData SADDRAUpdateInIn) {
    super(id, context, "ServiceAddressAssocUpdate");
    SADDRAUpdateIn = SADDRAUpdateInIn;
  }

  public void translateToMap() {
    if (SADDRAUpdateIn != null) {
      SADDRAUpdateIn.resetFlags(true, true);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRAUpdateIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssoc
 * @param SADDRAUpdateInIn Value of the SADDRAUpdateIn
 *
 */

  public void setServiceAddressAssoc(ServiceAddressAssocObjectData SADDRAUpdateInIn) {
    SADDRAUpdateIn = SADDRAUpdateInIn;
  }

  public void translateFromMap() {
    SADDRAUpdateIn = ServiceAddressAssocObjectHelper.fromMap(inputMap, "ServiceAddressAssoc");
  }

/**
 *
 * Gets the ServiceAddressAssoc
 * @return Value of the ServiceAddressAssoc
 *
 */

  public ServiceAddressAssocObjectData getServiceAddressAssoc( ) {
    return SADDRAUpdateIn;
  }

}
