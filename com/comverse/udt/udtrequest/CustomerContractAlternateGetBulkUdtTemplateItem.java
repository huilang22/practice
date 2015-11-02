/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractAlternateGetBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractAlternateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractAlternateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData CustomerContractAlternateGetIn;
/**
 *
 * Constructor to create a  CustomerContractAlternateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractAlternateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData CustomerContractAlternateGetInIn) {
    super(id, context, "CustomerContractAlternateGet");
    CustomerContractAlternateGetIn = CustomerContractAlternateGetInIn;
  }

  public void translateToMap() {
    if (CustomerContractAlternateGetIn != null) {
      CustomerContractAlternateGetIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractAlternateGetIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractAlternateGetInIn Value of the CustomerContractAlternateGetIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData CustomerContractAlternateGetInIn) {
    CustomerContractAlternateGetIn = CustomerContractAlternateGetInIn;
  }

  public void translateFromMap() {
    CustomerContractAlternateGetIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return CustomerContractAlternateGetIn;
  }

}
