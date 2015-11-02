/*
 * Generated code DO NOT EDIT
 * Generated file: CmfBonusPointGetBulkUdtTemplateItem.java
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
 * Class used to create a CmfBonusPointGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfBonusPointGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfBonusPointObjectKeyData CRBDGetIn;
/**
 *
 * Constructor to create a  CmfBonusPointGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfBonusPointGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectKeyData CRBDGetInIn) {
    super(id, context, "CmfBonusPointGet");
    CRBDGetIn = CRBDGetInIn;
  }

  public void translateToMap() {
    if (CRBDGetIn != null) {
      CRBDGetIn.resetFlags(true, true);
      addInput("CmfBonusPoint", CmfBonusPointObjectKeyHelper.toMap(CRBDGetIn, new HashMap(), "CmfBonusPointObjectKeyData").get("CmfBonusPointObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfBonusPoint
 * @param CRBDGetInIn Value of the CRBDGetIn
 *
 */

  public void setCmfBonusPoint(CmfBonusPointObjectKeyData CRBDGetInIn) {
    CRBDGetIn = CRBDGetInIn;
  }

  public void translateFromMap() {
    CRBDGetIn = CmfBonusPointObjectKeyHelper.fromMap(inputMap, "CmfBonusPoint");
  }

/**
 *
 * Gets the CmfBonusPoint
 * @return Value of the CmfBonusPoint
 *
 */

  public CmfBonusPointObjectKeyData getCmfBonusPoint( ) {
    return CRBDGetIn;
  }

}
