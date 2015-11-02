/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupContractsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupContractsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupContractsObjectData HQGroupContractsDeleteIn;
  protected Integer ContractViewId;
/**
 *
 * Constructor to create a  HqGroupContractsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupContractsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsDeleteInIn, Integer ContractViewIdIn) {
    super(id, context, "HqGroupContractsDelete");
    HQGroupContractsDeleteIn = HQGroupContractsDeleteInIn;
    ContractViewId = ContractViewIdIn;
  }

  public void translateToMap() {
    if (HQGroupContractsDeleteIn != null) {
      HQGroupContractsDeleteIn.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsDeleteIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
    if (ContractViewId != null) {
      addInput("ContractViewId", ContractViewId);
    }
  }


/**
 *
 * Sets the HqGroupContracts
 * @param HQGroupContractsDeleteInIn Value of the HQGroupContractsDeleteIn
 *
 */

  public void setHqGroupContracts(HqGroupContractsObjectData HQGroupContractsDeleteInIn) {
    HQGroupContractsDeleteIn = HQGroupContractsDeleteInIn;
  }

/**
 *
 * Sets the ContractViewId
 * @param ContractViewIdIn Value of the ContractViewId
 *
 */

  public void setContractViewId(Integer ContractViewIdIn) {
    ContractViewId = ContractViewIdIn;
  }

  public void translateFromMap() {
    HQGroupContractsDeleteIn = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
    ContractViewId = (Integer)inputMap.get("ContractViewId");
  }

/**
 *
 * Gets the HqGroupContracts
 * @return Value of the HqGroupContracts
 *
 */

  public HqGroupContractsObjectData getHqGroupContracts( ) {
    return HQGroupContractsDeleteIn;
  }

/**
 *
 * Gets the ContractViewId
 * @return Value of the ContractViewId
 *
 */

  public Integer getContractViewId( ) {
    return ContractViewId;
  }

}
