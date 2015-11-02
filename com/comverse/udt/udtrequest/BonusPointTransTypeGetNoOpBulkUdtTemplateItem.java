/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointTransTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointTransTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BonusPointTransTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BonusPointTransTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointTransTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectData noOpInIn) {
    super(id, context, "BonusPointTransTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
/**
 *
 * Sets the  BonusPointTransType
 * @param noOpInIn BonusPointTransTypeObjectData to set
 *
 */
  public void setBonusPointTransType(BonusPointTransTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointTransType passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointTransTypeObjectData getBonusPointTransType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BonusPointTransTypeObjectHelper.fromMap(inputMap, "BonusPointTransType");
  }
}
