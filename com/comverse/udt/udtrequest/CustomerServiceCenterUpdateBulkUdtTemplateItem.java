/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerServiceCenterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerServiceCenterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerServiceCenterObjectData CSCupdateIn;
/**
 *
 * Constructor to create a  CustomerServiceCenterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerServiceCenterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectData CSCupdateInIn) {
    super(id, context, "CustomerServiceCenterUpdate");
    CSCupdateIn = CSCupdateInIn;
  }

  public void translateToMap() {
    if (CSCupdateIn != null) {
      CSCupdateIn.resetFlags(true, true);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(CSCupdateIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }


/**
 *
 * Sets the CustomerServiceCenter
 * @param CSCupdateInIn Value of the CSCupdateIn
 *
 */

  public void setCustomerServiceCenter(CustomerServiceCenterObjectData CSCupdateInIn) {
    CSCupdateIn = CSCupdateInIn;
  }

  public void translateFromMap() {
    CSCupdateIn = CustomerServiceCenterObjectHelper.fromMap(inputMap, "CustomerServiceCenter");
  }

/**
 *
 * Gets the CustomerServiceCenter
 * @return Value of the CustomerServiceCenter
 *
 */

  public CustomerServiceCenterObjectData getCustomerServiceCenter( ) {
    return CSCupdateIn;
  }

}
