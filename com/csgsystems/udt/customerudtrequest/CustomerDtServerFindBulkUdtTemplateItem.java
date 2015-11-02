/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtServerFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerDtServerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerDtServerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerDtServerObjectFilter CusDocServerFindIn;
/**
 *
 * Constructor to create a  CustomerDtServerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerDtServerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerDtServerObjectFilter CusDocServerFindInIn) {
    super(id, context, "CustomerDtServerFind");
    CusDocServerFindIn = CusDocServerFindInIn;
  }

  public void translateToMap() {
    if (CusDocServerFindIn != null) {
      Integer index =  CusDocServerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDtServer", CustomerDtServerObjectHelper.toMap(CusDocServerFindIn, new HashMap(), "CustomerDtServer").get("CustomerDtServer"));
    }
  }


/**
 *
 * Sets the CustomerDtServer
 * @param CusDocServerFindInIn Value of the CusDocServerFindIn
 *
 */

  public void setCustomerDtServer(CustomerDtServerObjectFilter CusDocServerFindInIn) {
    CusDocServerFindIn = CusDocServerFindInIn;
  }

  public void translateFromMap() {
    CusDocServerFindIn = CustomerDtServerObjectHelper.fromMapFilter(inputMap, "CustomerDtServer");
  }

/**
 *
 * Gets the CustomerDtServer
 * @return Value of the CustomerDtServer
 *
 */

  public CustomerDtServerObjectFilter getCustomerDtServer( ) {
    return CusDocServerFindIn;
  }

}
