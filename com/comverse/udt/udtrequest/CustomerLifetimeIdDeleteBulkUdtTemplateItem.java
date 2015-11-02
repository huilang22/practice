/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CustomerLifetimeIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerLifetimeIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerLifetimeIdObjectKeyData CLdelete_In;
/**
 *
 * Constructor to create a  CustomerLifetimeIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerLifetimeIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectKeyData CLdelete_InIn) {
    super(id, context, "CustomerLifetimeIdDelete");
    CLdelete_In = CLdelete_InIn;
  }

  public void translateToMap() {
    if (CLdelete_In != null) {
      CLdelete_In.resetFlags(true, true);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(CLdelete_In, new HashMap(), "CustomerLifetimeIdObjectKeyData").get("CustomerLifetimeIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the CustomerLifetimeId
 * @param CLdelete_InIn Value of the CLdelete_In
 *
 */

  public void setCustomerLifetimeId(CustomerLifetimeIdObjectKeyData CLdelete_InIn) {
    CLdelete_In = CLdelete_InIn;
  }

  public void translateFromMap() {
    CLdelete_In = CustomerLifetimeIdObjectKeyHelper.fromMap(inputMap, "CustomerLifetimeId");
  }

/**
 *
 * Gets the CustomerLifetimeId
 * @return Value of the CustomerLifetimeId
 *
 */

  public CustomerLifetimeIdObjectKeyData getCustomerLifetimeId( ) {
    return CLdelete_In;
  }

}
