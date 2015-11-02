/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseFilter CustomerContractFindIn;
/**
 *
 * Constructor to create a  CustomerContractFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseFilter CustomerContractFindInIn) {
    super(id, context, "CustomerContractFind");
    CustomerContractFindIn = CustomerContractFindInIn;
  }

  public void translateToMap() {
    if (CustomerContractFindIn != null) {
      Integer index =  CustomerContractFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractFindInIn Value of the CustomerContractFindIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseFilter CustomerContractFindInIn) {
    CustomerContractFindIn = CustomerContractFindInIn;
  }

  public void translateFromMap() {
    CustomerContractFindIn = CustomerContractObjectBaseHelper.fromMapFilter(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseFilter getCustomerContract( ) {
    return CustomerContractFindIn;
  }

}
