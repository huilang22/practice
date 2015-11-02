/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseFilter CustomerContractDeleteListIn;
/**
 *
 * Constructor to create a  CustomerContractDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseFilter CustomerContractDeleteListInIn) {
    super(id, context, "CustomerContractDeleteList");
    CustomerContractDeleteListIn = CustomerContractDeleteListInIn;
  }

  public void translateToMap() {
    if (CustomerContractDeleteListIn != null) {
      Integer index =  CustomerContractDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractDeleteListIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractDeleteListInIn Value of the CustomerContractDeleteListIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseFilter CustomerContractDeleteListInIn) {
    CustomerContractDeleteListIn = CustomerContractDeleteListInIn;
  }

  public void translateFromMap() {
    CustomerContractDeleteListIn = CustomerContractObjectBaseHelper.fromMapFilter(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseFilter getCustomerContract( ) {
    return CustomerContractDeleteListIn;
  }

}
