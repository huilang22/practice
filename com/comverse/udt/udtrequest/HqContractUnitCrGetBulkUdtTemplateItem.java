/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrGetBulkUdtTemplateItem.java
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
 * Class used to create a HqContractUnitCrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqContractUnitCrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqContractUnitCrObjectKeyData HqContractUnitCrGetIn;
/**
 *
 * Constructor to create a  HqContractUnitCrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqContractUnitCrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectKeyData HqContractUnitCrGetInIn) {
    super(id, context, "HqContractUnitCrGet");
    HqContractUnitCrGetIn = HqContractUnitCrGetInIn;
  }

  public void translateToMap() {
    if (HqContractUnitCrGetIn != null) {
      HqContractUnitCrGetIn.resetFlags(true, true);
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(HqContractUnitCrGetIn, new HashMap(), "HqContractUnitCrObjectKeyData").get("HqContractUnitCrObjectKeyData"));
    }
  }


/**
 *
 * Sets the HqContractUnitCr
 * @param HqContractUnitCrGetInIn Value of the HqContractUnitCrGetIn
 *
 */

  public void setHqContractUnitCr(HqContractUnitCrObjectKeyData HqContractUnitCrGetInIn) {
    HqContractUnitCrGetIn = HqContractUnitCrGetInIn;
  }

  public void translateFromMap() {
    HqContractUnitCrGetIn = HqContractUnitCrObjectKeyHelper.fromMap(inputMap, "HqContractUnitCr");
  }

/**
 *
 * Gets the HqContractUnitCr
 * @return Value of the HqContractUnitCr
 *
 */

  public HqContractUnitCrObjectKeyData getHqContractUnitCr( ) {
    return HqContractUnitCrGetIn;
  }

}
