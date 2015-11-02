/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerContractUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   CustomerContractUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData noOpInIn) {
    super(id, context, "CustomerContractUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(noOpIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
/**
 *
 * Sets the  CustomerContract
 * @param noOpInIn CustomerContractObjectBaseData to set
 *
 */
  public void setCustomerContract(CustomerContractObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContract passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectBaseData getCustomerContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }
}
