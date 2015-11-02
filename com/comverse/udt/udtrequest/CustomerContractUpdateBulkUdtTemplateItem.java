/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData CustomerContractUpdateIn;
/**
 *
 * Constructor to create a  CustomerContractUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData CustomerContractUpdateInIn) {
    super(id, context, "CustomerContractUpdate");
    CustomerContractUpdateIn = CustomerContractUpdateInIn;
  }

  public void translateToMap() {
    if (CustomerContractUpdateIn != null) {
      CustomerContractUpdateIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractUpdateIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractUpdateInIn Value of the CustomerContractUpdateIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData CustomerContractUpdateInIn) {
    CustomerContractUpdateIn = CustomerContractUpdateInIn;
  }

  public void translateFromMap() {
    CustomerContractUpdateIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return CustomerContractUpdateIn;
  }

}
