/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerLifetimeIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerLifetimeIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerLifetimeIdObjectData CLupdate_In;
/**
 *
 * Constructor to create a  CustomerLifetimeIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerLifetimeIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectData CLupdate_InIn) {
    super(id, context, "CustomerLifetimeIdUpdate");
    CLupdate_In = CLupdate_InIn;
  }

  public void translateToMap() {
    if (CLupdate_In != null) {
      CLupdate_In.resetFlags(true, true);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(CLupdate_In, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }


/**
 *
 * Sets the CustomerLifetimeId
 * @param CLupdate_InIn Value of the CLupdate_In
 *
 */

  public void setCustomerLifetimeId(CustomerLifetimeIdObjectData CLupdate_InIn) {
    CLupdate_In = CLupdate_InIn;
  }

  public void translateFromMap() {
    CLupdate_In = CustomerLifetimeIdObjectHelper.fromMap(inputMap, "CustomerLifetimeId");
  }

/**
 *
 * Gets the CustomerLifetimeId
 * @return Value of the CustomerLifetimeId
 *
 */

  public CustomerLifetimeIdObjectData getCustomerLifetimeId( ) {
    return CLupdate_In;
  }

}
