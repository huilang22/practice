/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindByServiceOrderBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractFindByServiceOrderBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractFindByServiceOrderBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseFilter CustomerContractFindByServiceOrderIn;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  CustomerContractFindByServiceOrderBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractFindByServiceOrderBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseFilter CustomerContractFindByServiceOrderInIn, String ServiceOrderIdIn) {
    super(id, context, "CustomerContractFindByServiceOrder");
    CustomerContractFindByServiceOrderIn = CustomerContractFindByServiceOrderInIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (CustomerContractFindByServiceOrderIn != null) {
      Integer index =  CustomerContractFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractFindByServiceOrderIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractFindByServiceOrderInIn Value of the CustomerContractFindByServiceOrderIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseFilter CustomerContractFindByServiceOrderInIn) {
    CustomerContractFindByServiceOrderIn = CustomerContractFindByServiceOrderInIn;
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
    CustomerContractFindByServiceOrderIn = CustomerContractObjectBaseHelper.fromMapFilter(inputMap, "CustomerContract");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseFilter getCustomerContract( ) {
    return CustomerContractFindByServiceOrderIn;
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
