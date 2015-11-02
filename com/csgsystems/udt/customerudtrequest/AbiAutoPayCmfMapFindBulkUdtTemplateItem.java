/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapFindBulkUdtTemplateItem.java
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
 * Class used to create a AbiAutoPayCmfMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiAutoPayCmfMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn;
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiAutoPayCmfMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindInIn) {
    super(id, context, "AbiAutoPayCmfMapFind");
    AbiAutoPayCmfMapFindIn = AbiAutoPayCmfMapFindInIn;
  }

  public void translateToMap() {
    if (AbiAutoPayCmfMapFindIn != null) {
      Integer index =  AbiAutoPayCmfMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapFindIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }


/**
 *
 * Sets the AbiAutoPayCmfMap
 * @param AbiAutoPayCmfMapFindInIn Value of the AbiAutoPayCmfMapFindIn
 *
 */

  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindInIn) {
    AbiAutoPayCmfMapFindIn = AbiAutoPayCmfMapFindInIn;
  }

  public void translateFromMap() {
    AbiAutoPayCmfMapFindIn = AbiAutoPayCmfMapObjectHelper.fromMapFilter(inputMap, "AbiAutoPayCmfMap");
  }

/**
 *
 * Gets the AbiAutoPayCmfMap
 * @return Value of the AbiAutoPayCmfMap
 *
 */

  public AbiAutoPayCmfMapObjectFilter getAbiAutoPayCmfMap( ) {
    return AbiAutoPayCmfMapFindIn;
  }

}
