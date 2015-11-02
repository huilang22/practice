/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupContractsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupContractsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupContractsObjectData HQGroupContractscreateIn;
/**
 *
 * Constructor to create a  HqGroupContractsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupContractsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractscreateInIn) {
    super(id, context, "HqGroupContractsCreate");
    HQGroupContractscreateIn = HQGroupContractscreateInIn;
  }

  public void translateToMap() {
    if (HQGroupContractscreateIn != null) {
      HQGroupContractscreateIn.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractscreateIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }


/**
 *
 * Sets the HqGroupContracts
 * @param HQGroupContractscreateInIn Value of the HQGroupContractscreateIn
 *
 */

  public void setHqGroupContracts(HqGroupContractsObjectData HQGroupContractscreateInIn) {
    HQGroupContractscreateIn = HQGroupContractscreateInIn;
  }

  public void translateFromMap() {
    HQGroupContractscreateIn = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
  }

/**
 *
 * Gets the HqGroupContracts
 * @return Value of the HqGroupContracts
 *
 */

  public HqGroupContractsObjectData getHqGroupContracts( ) {
    return HQGroupContractscreateIn;
  }

}
