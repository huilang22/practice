/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseFilter ServiceFindIn;
/**
 *
 * Constructor to create a  ServiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseFilter ServiceFindInIn) {
    super(id, context, "ServiceFind");
    ServiceFindIn = ServiceFindInIn;
  }

  public void translateToMap() {
    if (ServiceFindIn != null) {
      Integer index =  ServiceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceFindIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceFindInIn Value of the ServiceFindIn
 *
 */

  public void setService(ServiceObjectBaseFilter ServiceFindInIn) {
    ServiceFindIn = ServiceFindInIn;
  }

  public void translateFromMap() {
    ServiceFindIn = ServiceObjectBaseHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseFilter getService( ) {
    return ServiceFindIn;
  }

}
