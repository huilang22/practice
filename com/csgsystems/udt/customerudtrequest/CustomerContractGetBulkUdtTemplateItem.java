/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractGetBulkUdtTemplateItem.java
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
