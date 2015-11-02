/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapFindPendingBulkUdtTemplateItem.java
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
 * Class used to create a CustomerIdEquipMapFindPendingBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerIdEquipMapFindPendingBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindByServiceOrderIn;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  CustomerIdEquipMapFindPendingBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerIdEquipMapFindPendingBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindByServiceOrderInIn, String ServiceOrderIdIn) {
    super(id, context, "CustomerIdEquipMapFindPending");
    CustomerIdEquipMapFindByServiceOrderIn = CustomerIdEquipMapFindByServiceOrderInIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (CustomerIdEquipMapFindByServiceOrderIn != null) {
      Integer index =  CustomerIdEquipMapFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapFindByServiceOrderIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param CustomerIdEquipMapFindByServiceOrderInIn Value of the CustomerIdEquipMapFindByServiceOrderIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectFilter CustomerIdEquipMapFindByServiceOrderInIn) {
    CustomerIdEquipMapFindByServiceOrderIn = CustomerIdEquipMapFindByServiceOrderInIn;
  }

/**
 *
 * Sets the ServiceOrderId
 * @param ServiceOrderIdIn Value of the ServiceOrderId
 *
 */

  public void setServiceOrderId(String ServiceOrderIdIn) {
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateFromMap() {
    CustomerIdEquipMapFindByServiceOrderIn = CustomerIdEquipMapObjectHelper.fromMapFilter(inputMap, "CustomerIdEquipMap");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectFilter getCustomerIdEquipMap( ) {
    return CustomerIdEquipMapFindByServiceOrderIn;
  }

/**
 *
 * Gets the ServiceOrderId
 * @return Value of the ServiceOrderId
 *
 */

  public String getServiceOrderId( ) {
    return ServiceOrderId;
  }

}
