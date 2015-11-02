/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CustomerServiceCenterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerServiceCenterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerServiceCenterObjectFilter CSCfindIn;
/**
 *
 * Constructor to create a  CustomerServiceCenterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerServiceCenterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectFilter CSCfindInIn) {
    super(id, context, "CustomerServiceCenterFind");
    CSCfindIn = CSCfindInIn;
  }

  public void translateToMap() {
    if (CSCfindIn != null) {
      Integer index =  CSCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCfindIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }


/**
 *
 * Sets the CustomerServiceCenter
 * @param CSCfindInIn Value of the CSCfindIn
 *
 */

  public void setCustomerServiceCenter(CustomerServiceCenterObjectFilter CSCfindInIn) {
    CSCfindIn = CSCfindInIn;
  }

  public void translateFromMap() {
    CSCfindIn = CustomerServiceCenterObjectHelper.fromMapFilter(inputMap, "CustomerServiceCenter");
  }

/**
 *
 * Gets the CustomerServiceCenter
 * @return Value of the CustomerServiceCenter
 *
 */

  public CustomerServiceCenterObjectFilter getCustomerServiceCenter( ) {
    return CSCfindIn;
  }

}
