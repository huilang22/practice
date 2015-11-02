/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtUrlFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CustomerDtUrlFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDtUrlFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDtUrlInputObjectFilter CustomerDtUrlFindIn;
/**
 *
 * Constructor to create a  CustomerDtUrlFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDtUrlFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDtUrlInputObjectFilter CustomerDtUrlFindInIn) {
    super(id, context, "CustomerDtUrlFind");
    CustomerDtUrlFindIn = CustomerDtUrlFindInIn;
  }

  public void translateToMap() {
    if (CustomerDtUrlFindIn != null) {
      Integer index =  CustomerDtUrlFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDtUrlFindIn", CustomerDtUrlInputObjectHelper.toMap(CustomerDtUrlFindIn, new HashMap(), "CustomerDtUrl").get("CustomerDtUrl"));
    }
  }


/**
 *
 * Sets the CustomerDtUrlFindIn
 * @param CustomerDtUrlFindInIn Value of the CustomerDtUrlFindIn
 *
 */

  public void setCustomerDtUrlFindIn(CustomerDtUrlInputObjectFilter CustomerDtUrlFindInIn) {
    CustomerDtUrlFindIn = CustomerDtUrlFindInIn;
  }

  public void translateFromMap() {
    CustomerDtUrlFindIn = CustomerDtUrlInputObjectHelper.fromMapFilter(inputMap, "CustomerDtUrlFindIn");
  }

/**
 *
 * Gets the CustomerDtUrlFindIn
 * @return Value of the CustomerDtUrlFindIn
 *
 */

  public CustomerDtUrlInputObjectFilter getCustomerDtUrlFindIn( ) {
    return CustomerDtUrlFindIn;
  }

}
