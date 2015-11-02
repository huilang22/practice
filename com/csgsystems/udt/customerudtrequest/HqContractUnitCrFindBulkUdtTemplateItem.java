/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrFindBulkUdtTemplateItem.java
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
 * Class used to create a HqContractUnitCrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HqContractUnitCrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqContractUnitCrObjectFilter HqContractUnitCrFindIn;
/**
 *
 * Constructor to create a  HqContractUnitCrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqContractUnitCrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectFilter HqContractUnitCrFindInIn) {
    super(id, context, "HqContractUnitCrFind");
    HqContractUnitCrFindIn = HqContractUnitCrFindInIn;
  }

  public void translateToMap() {
    if (HqContractUnitCrFindIn != null) {
      Integer index =  HqContractUnitCrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrFindIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }


/**
 *
 * Sets the HqContractUnitCr
 * @param HqContractUnitCrFindInIn Value of the HqContractUnitCrFindIn
 *
 */

  public void setHqContractUnitCr(HqContractUnitCrObjectFilter HqContractUnitCrFindInIn) {
    HqContractUnitCrFindIn = HqContractUnitCrFindInIn;
  }

  public void translateFromMap() {
    HqContractUnitCrFindIn = HqContractUnitCrObjectHelper.fromMapFilter(inputMap, "HqContractUnitCr");
  }

/**
 *
 * Gets the HqContractUnitCr
 * @return Value of the HqContractUnitCr
 *
 */

  public HqContractUnitCrObjectFilter getHqContractUnitCr( ) {
    return HqContractUnitCrFindIn;
  }

}
