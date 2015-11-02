/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfBonusPointGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfBonusPointGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfBonusPointObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfBonusPointGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfBonusPointGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectData noOpInIn) {
    super(id, context, "CmfBonusPointGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(noOpIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
/**
 *
 * Sets the  CmfBonusPoint
 * @param noOpInIn CmfBonusPointObjectData to set
 *
 */
  public void setCmfBonusPoint(CmfBonusPointObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfBonusPoint passed into the constructor
 * @return Simulated response
 *
 */
  public CmfBonusPointObjectData getCmfBonusPoint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfBonusPointObjectHelper.fromMap(inputMap, "CmfBonusPoint");
  }
}
