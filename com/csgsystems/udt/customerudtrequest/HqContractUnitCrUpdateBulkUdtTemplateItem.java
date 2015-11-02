/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HqContractUnitCrUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqContractUnitCrUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqContractUnitCrObjectData HqContractUnitCrupdate_In;
/**
 *
 * Constructor to create a  HqContractUnitCrUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqContractUnitCrUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrupdate_InIn) {
    super(id, context, "HqContractUnitCrUpdate");
    HqContractUnitCrupdate_In = HqContractUnitCrupdate_InIn;
  }

  public void translateToMap() {
    if (HqContractUnitCrupdate_In != null) {
      HqContractUnitCrupdate_In.resetFlags(true, true);
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrupdate_In, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }


/**
 *
 * Sets the HqContractUnitCr
 * @param HqContractUnitCrupdate_InIn Value of the HqContractUnitCrupdate_In
 *
 */

  public void setHqContractUnitCr(HqContractUnitCrObjectData HqContractUnitCrupdate_InIn) {
    HqContractUnitCrupdate_In = HqContractUnitCrupdate_InIn;
  }

  public void translateFromMap() {
    HqContractUnitCrupdate_In = HqContractUnitCrObjectHelper.fromMap(inputMap, "HqContractUnitCr");
  }

/**
 *
 * Gets the HqContractUnitCr
 * @return Value of the HqContractUnitCr
 *
 */

  public HqContractUnitCrObjectData getHqContractUnitCr( ) {
    return HqContractUnitCrupdate_In;
  }

}
