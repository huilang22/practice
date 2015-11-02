/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorRateBandOverrideGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorRateBandOverrideGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CRBOObjectData noOpIn;

/**
 *
 * Constructor to create a   CorridorRateBandOverrideGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorRateBandOverrideGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CRBOObjectData noOpInIn) {
    super(id, context, "CorridorRateBandOverrideGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(noOpIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }
/**
 *
 * Sets the  CorridorRateBandOverride
 * @param noOpInIn CRBOObjectData to set
 *
 */
  public void setCorridorRateBandOverride(CRBOObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorRateBandOverride passed into the constructor
 * @return Simulated response
 *
 */
  public CRBOObjectData getCorridorRateBandOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CRBOObjectHelper.fromMap(inputMap, "CorridorRateBandOverride");
  }
}
