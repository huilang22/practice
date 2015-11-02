/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditCreateBulkUdtTemplateItem.java
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
 * Class used to create a ContractUnitCreditCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractUnitCreditCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractUnitCreditObjectData ContractUnitCreditCreateIn;
/**
 *
 * Constructor to create a  ContractUnitCreditCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractUnitCreditCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectData ContractUnitCreditCreateInIn) {
    super(id, context, "ContractUnitCreditCreate");
    ContractUnitCreditCreateIn = ContractUnitCreditCreateInIn;
  }

  public void translateToMap() {
    if (ContractUnitCreditCreateIn != null) {
      ContractUnitCreditCreateIn.resetFlags(true, true);
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(ContractUnitCreditCreateIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }


/**
 *
 * Sets the ContractUnitCredit
 * @param ContractUnitCreditCreateInIn Value of the ContractUnitCreditCreateIn
 *
 */

  public void setContractUnitCredit(ContractUnitCreditObjectData ContractUnitCreditCreateInIn) {
    ContractUnitCreditCreateIn = ContractUnitCreditCreateInIn;
  }

  public void translateFromMap() {
    ContractUnitCreditCreateIn = ContractUnitCreditObjectHelper.fromMap(inputMap, "ContractUnitCredit");
  }

/**
 *
 * Gets the ContractUnitCredit
 * @return Value of the ContractUnitCredit
 *
 */

  public ContractUnitCreditObjectData getContractUnitCredit( ) {
    return ContractUnitCreditCreateIn;
  }

}
