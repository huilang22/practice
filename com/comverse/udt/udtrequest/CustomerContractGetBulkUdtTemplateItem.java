/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractGetBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseKeyData CustomerContractGetIn;
/**
 *
 * Constructor to create a  CustomerContractGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseKeyData CustomerContractGetInIn) {
    super(id, context, "CustomerContractGet");
    CustomerContractGetIn = CustomerContractGetInIn;
  }

  public void translateToMap() {
    if (CustomerContractGetIn != null) {
      CustomerContractGetIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(CustomerContractGetIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractGetInIn Value of the CustomerContractGetIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseKeyData CustomerContractGetInIn) {
    CustomerContractGetIn = CustomerContractGetInIn;
  }

  public void translateFromMap() {
    CustomerContractGetIn = CustomerContractObjectBaseKeyHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseKeyData getCustomerContract( ) {
    return CustomerContractGetIn;
  }

}
