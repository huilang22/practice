/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdGetBulkUdtTemplateItem.java
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
 * Class used to create a CustomerLifetimeIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerLifetimeIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerLifetimeIdObjectKeyData CLget_In;
/**
 *
 * Constructor to create a  CustomerLifetimeIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerLifetimeIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectKeyData CLget_InIn) {
    super(id, context, "CustomerLifetimeIdGet");
    CLget_In = CLget_InIn;
  }

  public void translateToMap() {
    if (CLget_In != null) {
      CLget_In.resetFlags(true, true);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(CLget_In, new HashMap(), "CustomerLifetimeIdObjectKeyData").get("CustomerLifetimeIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the CustomerLifetimeId
 * @param CLget_InIn Value of the CLget_In
 *
 */

  public void setCustomerLifetimeId(CustomerLifetimeIdObjectKeyData CLget_InIn) {
    CLget_In = CLget_InIn;
  }

  public void translateFromMap() {
    CLget_In = CustomerLifetimeIdObjectKeyHelper.fromMap(inputMap, "CustomerLifetimeId");
  }

/**
 *
 * Gets the CustomerLifetimeId
 * @return Value of the CustomerLifetimeId
 *
 */

  public CustomerLifetimeIdObjectKeyData getCustomerLifetimeId( ) {
    return CLget_In;
  }

}
