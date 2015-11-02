/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderTypeObjectFilter ServiceOrderTypeFindIn;
/**
 *
 * Constructor to create a  ServiceOrderTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectFilter ServiceOrderTypeFindInIn) {
    super(id, context, "ServiceOrderTypeFind");
    ServiceOrderTypeFindIn = ServiceOrderTypeFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderTypeFindIn != null) {
      Integer index =  ServiceOrderTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeFindIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }


/**
 *
 * Sets the ServiceOrderType
 * @param ServiceOrderTypeFindInIn Value of the ServiceOrderTypeFindIn
 *
 */

  public void setServiceOrderType(ServiceOrderTypeObjectFilter ServiceOrderTypeFindInIn) {
    ServiceOrderTypeFindIn = ServiceOrderTypeFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderTypeFindIn = ServiceOrderTypeObjectHelper.fromMapFilter(inputMap, "ServiceOrderType");
  }

/**
 *
 * Gets the ServiceOrderType
 * @return Value of the ServiceOrderType
 *
 */

  public ServiceOrderTypeObjectFilter getServiceOrderType( ) {
    return ServiceOrderTypeFindIn;
  }

}
