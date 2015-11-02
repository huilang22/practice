/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractHqFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractHqFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractHqFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseFilter CustomerContractHqFindIn;
/**
 *
 * Constructor to create a  CustomerContractHqFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractHqFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseFilter CustomerContractHqFindInIn) {
    super(id, context, "CustomerContractHqFind");
    CustomerContractHqFindIn = CustomerContractHqFindInIn;
  }

  public void translateToMap() {
    if (CustomerContractHqFindIn != null) {
      Integer index =  CustomerContractHqFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractHqFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractHqFindInIn Value of the CustomerContractHqFindIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseFilter CustomerContractHqFindInIn) {
    CustomerContractHqFindIn = CustomerContractHqFindInIn;
  }

  public void translateFromMap() {
    CustomerContractHqFindIn = CustomerContractObjectBaseHelper.fromMapFilter(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseFilter getCustomerContract( ) {
    return CustomerContractHqFindIn;
  }

}
