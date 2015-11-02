/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ServiceProviderFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceProviderFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceProviderObjectFilter ServiceProviderFindIn;
/**
 *
 * Constructor to create a  ServiceProviderFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceProviderFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectFilter ServiceProviderFindInIn) {
    super(id, context, "ServiceProviderFind");
    ServiceProviderFindIn = ServiceProviderFindInIn;
  }

  public void translateToMap() {
    if (ServiceProviderFindIn != null) {
      Integer index =  ServiceProviderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderFindIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }


/**
 *
 * Sets the ServiceProvider
 * @param ServiceProviderFindInIn Value of the ServiceProviderFindIn
 *
 */

  public void setServiceProvider(ServiceProviderObjectFilter ServiceProviderFindInIn) {
    ServiceProviderFindIn = ServiceProviderFindInIn;
  }

  public void translateFromMap() {
    ServiceProviderFindIn = ServiceProviderObjectHelper.fromMapFilter(inputMap, "ServiceProvider");
  }

/**
 *
 * Gets the ServiceProvider
 * @return Value of the ServiceProvider
 *
 */

  public ServiceProviderObjectFilter getServiceProvider( ) {
    return ServiceProviderFindIn;
  }

}
