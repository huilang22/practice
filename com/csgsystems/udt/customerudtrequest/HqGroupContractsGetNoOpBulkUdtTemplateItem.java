/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupContractsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupContractsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupContractsObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupContractsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupContractsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData noOpInIn) {
    super(id, context, "HqGroupContractsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
/**
 *
 * Sets the  HqGroupContracts
 * @param noOpInIn HqGroupContractsObjectData to set
 *
 */
  public void setHqGroupContracts(HqGroupContractsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupContracts passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupContractsObjectData getHqGroupContracts() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
  }
}
