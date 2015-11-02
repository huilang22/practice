/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CustomerLifetimeIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerLifetimeIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerLifetimeIdObjectFilter CLfind_In;
/**
 *
 * Constructor to create a  CustomerLifetimeIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerLifetimeIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectFilter CLfind_InIn) {
    super(id, context, "CustomerLifetimeIdFind");
    CLfind_In = CLfind_InIn;
  }

  public void translateToMap() {
    if (CLfind_In != null) {
      Integer index =  CLfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLfind_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }


/**
 *
 * Sets the CustomerLifetimeId
 * @param CLfind_InIn Value of the CLfind_In
 *
 */

  public void setCustomerLifetimeId(CustomerLifetimeIdObjectFilter CLfind_InIn) {
    CLfind_In = CLfind_InIn;
  }

  public void translateFromMap() {
    CLfind_In = CustomerLifetimeIdObjectHelper.fromMapFilter(inputMap, "CustomerLifetimeId");
  }

/**
 *
 * Gets the CustomerLifetimeId
 * @return Value of the CustomerLifetimeId
 *
 */

  public CustomerLifetimeIdObjectFilter getCustomerLifetimeId( ) {
    return CLfind_In;
  }

}
