/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CustomerServiceCenterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerServiceCenterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerServiceCenterObjectKeyData CSCgetIn;
/**
 *
 * Constructor to create a  CustomerServiceCenterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerServiceCenterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectKeyData CSCgetInIn) {
    super(id, context, "CustomerServiceCenterGet");
    CSCgetIn = CSCgetInIn;
  }

  public void translateToMap() {
    if (CSCgetIn != null) {
      CSCgetIn.resetFlags(true, true);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectKeyHelper.toMap(CSCgetIn, new HashMap(), "CustomerServiceCenterObjectKeyData").get("CustomerServiceCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the CustomerServiceCenter
 * @param CSCgetInIn Value of the CSCgetIn
 *
 */

  public void setCustomerServiceCenter(CustomerServiceCenterObjectKeyData CSCgetInIn) {
    CSCgetIn = CSCgetInIn;
  }

  public void translateFromMap() {
    CSCgetIn = CustomerServiceCenterObjectKeyHelper.fromMap(inputMap, "CustomerServiceCenter");
  }

/**
 *
 * Gets the CustomerServiceCenter
 * @return Value of the CustomerServiceCenter
 *
 */

  public CustomerServiceCenterObjectKeyData getCustomerServiceCenter( ) {
    return CSCgetIn;
  }

}
