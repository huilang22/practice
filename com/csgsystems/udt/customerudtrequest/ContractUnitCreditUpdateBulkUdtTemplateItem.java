/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ContractUnitCreditUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractUnitCreditUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractUnitCreditObjectData ContractUnitCreditUpdateIn;
/**
 *
 * Constructor to create a  ContractUnitCreditUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractUnitCreditUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectData ContractUnitCreditUpdateInIn) {
    super(id, context, "ContractUnitCreditUpdate");
    ContractUnitCreditUpdateIn = ContractUnitCreditUpdateInIn;
  }

  public void translateToMap() {
    if (ContractUnitCreditUpdateIn != null) {
      ContractUnitCreditUpdateIn.resetFlags(true, true);
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(ContractUnitCreditUpdateIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }


/**
 *
 * Sets the ContractUnitCredit
 * @param ContractUnitCreditUpdateInIn Value of the ContractUnitCreditUpdateIn
 *
 */

  public void setContractUnitCredit(ContractUnitCreditObjectData ContractUnitCreditUpdateInIn) {
    ContractUnitCreditUpdateIn = ContractUnitCreditUpdateInIn;
  }

  public void translateFromMap() {
    ContractUnitCreditUpdateIn = ContractUnitCreditObjectHelper.fromMap(inputMap, "ContractUnitCredit");
  }

/**
 *
 * Gets the ContractUnitCredit
 * @return Value of the ContractUnitCredit
 *
 */

  public ContractUnitCreditObjectData getContractUnitCredit( ) {
    return ContractUnitCreditUpdateIn;
  }

}
