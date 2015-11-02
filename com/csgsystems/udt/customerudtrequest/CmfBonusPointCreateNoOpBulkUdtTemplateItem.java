/*
 * Generated code DO NOT EDIT
 * Generated file: CmfBonusPointCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfBonusPointCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfBonusPointCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfBonusPointObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfBonusPointCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfBonusPointCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectData noOpInIn) {
    super(id, context, "CmfBonusPointCreate");
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
