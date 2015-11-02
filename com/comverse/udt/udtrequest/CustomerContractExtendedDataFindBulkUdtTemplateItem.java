/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseKeyData ccedfIn;
/**
 *
 * Constructor to create a  CustomerContractExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseKeyData ccedfInIn) {
    super(id, context, "CustomerContractExtendedDataFind");
    ccedfIn = ccedfInIn;
  }

  public void translateToMap() {
    if (ccedfIn != null) {
      ccedfIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(ccedfIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ccedfInIn Value of the ccedfIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseKeyData ccedfInIn) {
    ccedfIn = ccedfInIn;
  }

  public void translateFromMap() {
    ccedfIn = CustomerContractObjectBaseKeyHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseKeyData getCustomerContract( ) {
    return ccedfIn;
  }

}
