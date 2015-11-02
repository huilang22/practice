/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractCreateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData CustomerContractCreateExternalIn;
/**
 *
 * Constructor to create a  CustomerContractCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData CustomerContractCreateExternalInIn) {
    super(id, context, "CustomerContractCreate");
    CustomerContractCreateExternalIn = CustomerContractCreateExternalInIn;
  }

  public void translateToMap() {
    if (CustomerContractCreateExternalIn != null) {
      CustomerContractCreateExternalIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(CustomerContractCreateExternalIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractCreateExternalInIn Value of the CustomerContractCreateExternalIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData CustomerContractCreateExternalInIn) {
    CustomerContractCreateExternalIn = CustomerContractCreateExternalInIn;
  }

  public void translateFromMap() {
    CustomerContractCreateExternalIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return CustomerContractCreateExternalIn;
  }

}
