/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqContractUnitCrCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqContractUnitCrCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqContractUnitCrObjectData HqContractUnitCrCreateIn;
/**
 *
 * Constructor to create a  HqContractUnitCrCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqContractUnitCrCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectData HqContractUnitCrCreateInIn) {
    super(id, context, "HqContractUnitCrCreate");
    HqContractUnitCrCreateIn = HqContractUnitCrCreateInIn;
  }

  public void translateToMap() {
    if (HqContractUnitCrCreateIn != null) {
      HqContractUnitCrCreateIn.resetFlags(true, true);
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(HqContractUnitCrCreateIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }


/**
 *
 * Sets the HqContractUnitCr
 * @param HqContractUnitCrCreateInIn Value of the HqContractUnitCrCreateIn
 *
 */

  public void setHqContractUnitCr(HqContractUnitCrObjectData HqContractUnitCrCreateInIn) {
    HqContractUnitCrCreateIn = HqContractUnitCrCreateInIn;
  }

  public void translateFromMap() {
    HqContractUnitCrCreateIn = HqContractUnitCrObjectHelper.fromMap(inputMap, "HqContractUnitCr");
  }

/**
 *
 * Gets the HqContractUnitCr
 * @return Value of the HqContractUnitCr
 *
 */

  public HqContractUnitCrObjectData getHqContractUnitCr( ) {
    return HqContractUnitCrCreateIn;
  }

}
