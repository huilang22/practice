/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerLifetimeIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerLifetimeIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerLifetimeIdObjectData CLcreate_In;
/**
 *
 * Constructor to create a  CustomerLifetimeIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerLifetimeIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectData CLcreate_InIn) {
    super(id, context, "CustomerLifetimeIdCreate");
    CLcreate_In = CLcreate_InIn;
  }

  public void translateToMap() {
    if (CLcreate_In != null) {
      CLcreate_In.resetFlags(true, true);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLcreate_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }


/**
 *
 * Sets the CustomerLifetimeId
 * @param CLcreate_InIn Value of the CLcreate_In
 *
 */

  public void setCustomerLifetimeId(CustomerLifetimeIdObjectData CLcreate_InIn) {
    CLcreate_In = CLcreate_InIn;
  }

  public void translateFromMap() {
    CLcreate_In = CustomerLifetimeIdObjectHelper.fromMap(inputMap, "CustomerLifetimeId");
  }

/**
 *
 * Gets the CustomerLifetimeId
 * @return Value of the CustomerLifetimeId
 *
 */

  public CustomerLifetimeIdObjectData getCustomerLifetimeId( ) {
    return CLcreate_In;
  }

}
