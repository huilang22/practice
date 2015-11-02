/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapGetBulkUdtTemplateItem.java
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
 * Class used to create a AbiAutoPayCmfMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiAutoPayCmfMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn;
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiAutoPayCmfMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetInIn) {
    super(id, context, "AbiAutoPayCmfMapGet");
    AbiAutoPayCmfMapGetIn = AbiAutoPayCmfMapGetInIn;
  }

  public void translateToMap() {
    if (AbiAutoPayCmfMapGetIn != null) {
      AbiAutoPayCmfMapGetIn.resetFlags(true, true);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectKeyHelper.toMap(AbiAutoPayCmfMapGetIn, new HashMap(), "AbiAutoPayCmfMapObjectKeyData").get("AbiAutoPayCmfMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the AbiAutoPayCmfMap
 * @param AbiAutoPayCmfMapGetInIn Value of the AbiAutoPayCmfMapGetIn
 *
 */

  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetInIn) {
    AbiAutoPayCmfMapGetIn = AbiAutoPayCmfMapGetInIn;
  }

  public void translateFromMap() {
    AbiAutoPayCmfMapGetIn = AbiAutoPayCmfMapObjectKeyHelper.fromMap(inputMap, "AbiAutoPayCmfMap");
  }

/**
 *
 * Gets the AbiAutoPayCmfMap
 * @return Value of the AbiAutoPayCmfMap
 *
 */

  public AbiAutoPayCmfMapObjectKeyData getAbiAutoPayCmfMap( ) {
    return AbiAutoPayCmfMapGetIn;
  }

}
