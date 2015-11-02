/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapUpdateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a AbiAutoPayCmfMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiAutoPayCmfMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn;
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiAutoPayCmfMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateInIn) {
    super(id, context, "AbiAutoPayCmfMapUpdate");
    AbiAutoPayCmfMapUpdateIn = AbiAutoPayCmfMapUpdateInIn;
  }

  public void translateToMap() {
    if (AbiAutoPayCmfMapUpdateIn != null) {
      AbiAutoPayCmfMapUpdateIn.resetFlags(true, true);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapUpdateIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }


/**
 *
 * Sets the AbiAutoPayCmfMap
 * @param AbiAutoPayCmfMapUpdateInIn Value of the AbiAutoPayCmfMapUpdateIn
 *
 */

  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateInIn) {
    AbiAutoPayCmfMapUpdateIn = AbiAutoPayCmfMapUpdateInIn;
  }

  public void translateFromMap() {
    AbiAutoPayCmfMapUpdateIn = AbiAutoPayCmfMapObjectHelper.fromMap(inputMap, "AbiAutoPayCmfMap");
  }

/**
 *
 * Gets the AbiAutoPayCmfMap
 * @return Value of the AbiAutoPayCmfMap
 *
 */

  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMap( ) {
    return AbiAutoPayCmfMapUpdateIn;
  }

}
