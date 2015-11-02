/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditConfigGetBulkUdtTemplateItem.java
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
 * Class used to create a ContractUnitCreditConfigGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractUnitCreditConfigGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractUnitCreditConfigData ConfigObjectIn;
/**
 *
 * Constructor to create a  ContractUnitCreditConfigGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractUnitCreditConfigGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditConfigData ConfigObjectInIn) {
    super(id, context, "ContractUnitCreditConfigGet");
    ConfigObjectIn = ConfigObjectInIn;
  }

  public void translateToMap() {
    if (ConfigObjectIn != null) {
      ConfigObjectIn.resetFlags(true, true);
      addInput("ContractUnitCreditConfig", ContractUnitCreditConfigHelper.toMap(ConfigObjectIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }


/**
 *
 * Sets the ContractUnitCreditConfig
 * @param ConfigObjectInIn Value of the ConfigObjectIn
 *
 */

  public void setContractUnitCreditConfig(ContractUnitCreditConfigData ConfigObjectInIn) {
    ConfigObjectIn = ConfigObjectInIn;
  }

  public void translateFromMap() {
    ConfigObjectIn = ContractUnitCreditConfigHelper.fromMap(inputMap, "ContractUnitCreditConfig");
  }

/**
 *
 * Gets the ContractUnitCreditConfig
 * @return Value of the ContractUnitCreditConfig
 *
 */

  public ContractUnitCreditConfigData getContractUnitCreditConfig( ) {
    return ConfigObjectIn;
  }

}
