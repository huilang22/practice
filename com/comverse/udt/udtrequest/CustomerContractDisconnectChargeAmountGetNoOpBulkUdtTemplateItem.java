/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDisconnectChargeAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerContractDisconnectChargeAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractDisconnectChargeAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractDisconnectChargeAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   CustomerContractDisconnectChargeAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractDisconnectChargeAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractDisconnectChargeAmountGetOutputData noOpInIn) {
    super(id, context, "CustomerContractDisconnectChargeAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerContractDisconnectChargeAmountGetOutputData", CustomerContractDisconnectChargeAmountGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  CustomerContractDisconnectChargeAmountGetOutputData
 * @param noOpInIn CustomerContractDisconnectChargeAmountGetOutputData to set
 *
 */
  public void setCustomerContractDisconnectChargeAmountGetOutputData(CustomerContractDisconnectChargeAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContractDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractDisconnectChargeAmountGetOutputData getCustomerContractDisconnectChargeAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractDisconnectChargeAmountGetOutputHelper.fromMap(inputMap);
  }
}
