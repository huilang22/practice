/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectFilter ContractXIDFindIn;
/**
 *
 * Constructor to create a  CustomerContractExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectFilter ContractXIDFindInIn) {
    super(id, context, "CustomerContractExternalFind");
    ContractXIDFindIn = ContractXIDFindInIn;
  }

  public void translateToMap() {
    if (ContractXIDFindIn != null) {
      Integer index =  ContractXIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ContractXIDFindIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ContractXIDFindInIn Value of the ContractXIDFindIn
 *
 */

  public void setCustomerContract(CustomerContractObjectFilter ContractXIDFindInIn) {
    ContractXIDFindIn = ContractXIDFindInIn;
  }

  public void translateFromMap() {
    ContractXIDFindIn = CustomerContractObjectHelper.fromMapFilter(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectFilter getCustomerContract( ) {
    return ContractXIDFindIn;
  }

}
