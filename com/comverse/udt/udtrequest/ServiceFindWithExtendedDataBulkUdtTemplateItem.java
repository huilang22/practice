/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a ServiceFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceFindWithIn;
/**
 *
 * Constructor to create a  ServiceFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceFindWithInIn) {
    super(id, context, "ServiceFindWithExtendedData");
    ServiceFindWithIn = ServiceFindWithInIn;
  }

  public void translateToMap() {
    if (ServiceFindWithIn != null) {
      Integer index =  ServiceFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceFindWithIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceFindWithInIn Value of the ServiceFindWithIn
 *
 */

  public void setService(ServiceObjectFilter ServiceFindWithInIn) {
    ServiceFindWithIn = ServiceFindWithInIn;
  }

  public void translateFromMap() {
    ServiceFindWithIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceFindWithIn;
  }

}
