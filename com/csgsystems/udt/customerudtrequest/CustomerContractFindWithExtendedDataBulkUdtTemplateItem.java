/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectFilter CCFindWithIn;
/**
 *
 * Constructor to create a  CustomerContractFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectFilter CCFindWithInIn) {
    super(id, context, "CustomerContractFindWithExtendedData");
    CCFindWithIn = CCFindWithInIn;
  }

  public void translateToMap() {
    if (CCFindWithIn != null) {
      Integer index =  CCFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(CCFindWithIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CCFindWithInIn Value of the CCFindWithIn
 *
 */

  public void setCustomerContract(CustomerContractObjectFilter CCFindWithInIn) {
    CCFindWithIn = CCFindWithInIn;
  }

  public void translateFromMap() {
    CCFindWithIn = CustomerContractObjectHelper.fromMapFilter(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectFilter getCustomerContract( ) {
    return CCFindWithIn;
  }

}
