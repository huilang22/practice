/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceXIDFindIn;
/**
 *
 * Constructor to create a  ServiceExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceXIDFindInIn) {
    super(id, context, "ServiceExternalFind");
    ServiceXIDFindIn = ServiceXIDFindInIn;
  }

  public void translateToMap() {
    if (ServiceXIDFindIn != null) {
      Integer index =  ServiceXIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceXIDFindInIn Value of the ServiceXIDFindIn
 *
 */

  public void setService(ServiceObjectFilter ServiceXIDFindInIn) {
    ServiceXIDFindIn = ServiceXIDFindInIn;
  }

  public void translateFromMap() {
    ServiceXIDFindIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceXIDFindIn;
  }

}
