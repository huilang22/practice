/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a AbiAutoPayCmfMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiAutoPayCmfMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn;
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiAutoPayCmfMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateInIn) {
    super(id, context, "AbiAutoPayCmfMapCreate");
    AbiAutoPayCmfMapCreateIn = AbiAutoPayCmfMapCreateInIn;
  }

  public void translateToMap() {
    if (AbiAutoPayCmfMapCreateIn != null) {
      AbiAutoPayCmfMapCreateIn.resetFlags(true, true);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapCreateIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }


/**
 *
 * Sets the AbiAutoPayCmfMap
 * @param AbiAutoPayCmfMapCreateInIn Value of the AbiAutoPayCmfMapCreateIn
 *
 */

  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateInIn) {
    AbiAutoPayCmfMapCreateIn = AbiAutoPayCmfMapCreateInIn;
  }

  public void translateFromMap() {
    AbiAutoPayCmfMapCreateIn = AbiAutoPayCmfMapObjectHelper.fromMap(inputMap, "AbiAutoPayCmfMap");
  }

/**
 *
 * Gets the AbiAutoPayCmfMap
 * @return Value of the AbiAutoPayCmfMap
 *
 */

  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMap( ) {
    return AbiAutoPayCmfMapCreateIn;
  }

}
