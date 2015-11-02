/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditGetBulkUdtTemplateItem.java
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
 * Class used to create a ContractUnitCreditGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractUnitCreditGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractUnitCreditObjectKeyData getIn;
/**
 *
 * Constructor to create a  ContractUnitCreditGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractUnitCreditGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectKeyData getInIn) {
    super(id, context, "ContractUnitCreditGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ContractUnitCredit", ContractUnitCreditObjectKeyHelper.toMap(getIn, new HashMap(), "ContractUnitCreditObjectKeyData").get("ContractUnitCreditObjectKeyData"));
    }
  }


/**
 *
 * Sets the ContractUnitCredit
 * @param getInIn Value of the getIn
 *
 */

  public void setContractUnitCredit(ContractUnitCreditObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ContractUnitCreditObjectKeyHelper.fromMap(inputMap, "ContractUnitCredit");
  }

/**
 *
 * Gets the ContractUnitCredit
 * @return Value of the ContractUnitCredit
 *
 */

  public ContractUnitCreditObjectKeyData getContractUnitCredit( ) {
    return getIn;
  }

}
