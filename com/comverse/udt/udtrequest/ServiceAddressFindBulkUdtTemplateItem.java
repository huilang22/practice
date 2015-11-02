/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressObjectFilter findIn;
/**
 *
 * Constructor to create a  ServiceAddressFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressObjectFilter findInIn) {
    super(id, context, "ServiceAddressFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddress", ServiceAddressObjectHelper.toMap(findIn, new HashMap(), "ServiceAddress").get("ServiceAddress"));
    }
  }


/**
 *
 * Sets the ServiceAddress
 * @param findInIn Value of the findIn
 *
 */

  public void setServiceAddress(ServiceAddressObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ServiceAddressObjectHelper.fromMapFilter(inputMap, "ServiceAddress");
  }

/**
 *
 * Gets the ServiceAddress
 * @return Value of the ServiceAddress
 *
 */

  public ServiceAddressObjectFilter getServiceAddress( ) {
    return findIn;
  }

}
