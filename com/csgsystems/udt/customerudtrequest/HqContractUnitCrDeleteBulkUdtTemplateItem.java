/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HqContractUnitCrDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HqContractUnitCrDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqContractUnitCrObjectKeyData HqContractUnitCrdelete_In;
/**
 *
 * Constructor to create a  HqContractUnitCrDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqContractUnitCrDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrdelete_InIn) {
    super(id, context, "HqContractUnitCrDelete");
    HqContractUnitCrdelete_In = HqContractUnitCrdelete_InIn;
  }

  public void translateToMap() {
    if (HqContractUnitCrdelete_In != null) {
      HqContractUnitCrdelete_In.resetFlags(true, true);
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(HqContractUnitCrdelete_In, new HashMap(), "HqContractUnitCrObjectKeyData").get("HqContractUnitCrObjectKeyData"));
    }
  }


/**
 *
 * Sets the HqContractUnitCr
 * @param HqContractUnitCrdelete_InIn Value of the HqContractUnitCrdelete_In
 *
 */

  public void setHqContractUnitCr(HqContractUnitCrObjectKeyData HqContractUnitCrdelete_InIn) {
    HqContractUnitCrdelete_In = HqContractUnitCrdelete_InIn;
  }

  public void translateFromMap() {
    HqContractUnitCrdelete_In = HqContractUnitCrObjectKeyHelper.fromMap(inputMap, "HqContractUnitCr");
  }

/**
 *
 * Gets the HqContractUnitCr
 * @return Value of the HqContractUnitCr
 *
 */

  public HqContractUnitCrObjectKeyData getHqContractUnitCr( ) {
    return HqContractUnitCrdelete_In;
  }

}
