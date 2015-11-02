/*
 * Generated code DO NOT EDIT
 * Generated file: CmfBonusPointCreateBulkUdtTemplateItem.java
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
 * Class used to create a CmfBonusPointCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfBonusPointCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfBonusPointObjectData CRBDCreateIn;
/**
 *
 * Constructor to create a  CmfBonusPointCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfBonusPointCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectData CRBDCreateInIn) {
    super(id, context, "CmfBonusPointCreate");
    CRBDCreateIn = CRBDCreateInIn;
  }

  public void translateToMap() {
    if (CRBDCreateIn != null) {
      CRBDCreateIn.resetFlags(true, true);
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDCreateIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }


/**
 *
 * Sets the CmfBonusPoint
 * @param CRBDCreateInIn Value of the CRBDCreateIn
 *
 */

  public void setCmfBonusPoint(CmfBonusPointObjectData CRBDCreateInIn) {
    CRBDCreateIn = CRBDCreateInIn;
  }

  public void translateFromMap() {
    CRBDCreateIn = CmfBonusPointObjectHelper.fromMap(inputMap, "CmfBonusPoint");
  }

/**
 *
 * Gets the CmfBonusPoint
 * @return Value of the CmfBonusPoint
 *
 */

  public CmfBonusPointObjectData getCmfBonusPoint( ) {
    return CRBDCreateIn;
  }

}
