/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocObjectData SADDRACreatelIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectData SADDRACreatelInIn) {
    super(id, context, "ServiceAddressAssocCreate");
    SADDRACreatelIn = SADDRACreatelInIn;
  }

  public void translateToMap() {
    if (SADDRACreatelIn != null) {
      SADDRACreatelIn.resetFlags(true, true);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRACreatelIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssoc
 * @param SADDRACreatelInIn Value of the SADDRACreatelIn
 *
 */

  public void setServiceAddressAssoc(ServiceAddressAssocObjectData SADDRACreatelInIn) {
    SADDRACreatelIn = SADDRACreatelInIn;
  }

  public void translateFromMap() {
    SADDRACreatelIn = ServiceAddressAssocObjectHelper.fromMap(inputMap, "ServiceAddressAssoc");
  }

/**
 *
 * Gets the ServiceAddressAssoc
 * @return Value of the ServiceAddressAssoc
 *
 */

  public ServiceAddressAssocObjectData getServiceAddressAssoc( ) {
    return SADDRACreatelIn;
  }

}
