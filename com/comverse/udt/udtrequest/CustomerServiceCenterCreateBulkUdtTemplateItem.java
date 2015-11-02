/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerServiceCenterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerServiceCenterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerServiceCenterObjectData CSCcreateIn;
/**
 *
 * Constructor to create a  CustomerServiceCenterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerServiceCenterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectData CSCcreateInIn) {
    super(id, context, "CustomerServiceCenterCreate");
    CSCcreateIn = CSCcreateInIn;
  }

  public void translateToMap() {
    if (CSCcreateIn != null) {
      CSCcreateIn.resetFlags(true, true);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCcreateIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }


/**
 *
 * Sets the CustomerServiceCenter
 * @param CSCcreateInIn Value of the CSCcreateIn
 *
 */

  public void setCustomerServiceCenter(CustomerServiceCenterObjectData CSCcreateInIn) {
    CSCcreateIn = CSCcreateInIn;
  }

  public void translateFromMap() {
    CSCcreateIn = CustomerServiceCenterObjectHelper.fromMap(inputMap, "CustomerServiceCenter");
  }

/**
 *
 * Gets the CustomerServiceCenter
 * @return Value of the CustomerServiceCenter
 *
 */

  public CustomerServiceCenterObjectData getCustomerServiceCenter( ) {
    return CSCcreateIn;
  }

}
