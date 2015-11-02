/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractCreateInternalBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractCreateInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractCreateInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData CustomerContractCreateIn;
/**
 *
 * Constructor to create a  CustomerContractCreateInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractCreateInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData CustomerContractCreateInIn) {
    super(id, context, "CustomerContractCreateInternal");
    CustomerContractCreateIn = CustomerContractCreateInIn;
  }

  public void translateToMap() {
    if (CustomerContractCreateIn != null) {
      CustomerContractCreateIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractCreateIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractCreateInIn Value of the CustomerContractCreateIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData CustomerContractCreateInIn) {
    CustomerContractCreateIn = CustomerContractCreateInIn;
  }

  public void translateFromMap() {
    CustomerContractCreateIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return CustomerContractCreateIn;
  }

}
