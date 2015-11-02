/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CmfBonusPointUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfBonusPointUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfBonusPointObjectData CRBDUpdateIn;
/**
 *
 * Constructor to create a  CmfBonusPointUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfBonusPointUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectData CRBDUpdateInIn) {
    super(id, context, "CmfBonusPointUpdate");
    CRBDUpdateIn = CRBDUpdateInIn;
  }

  public void translateToMap() {
    if (CRBDUpdateIn != null) {
      CRBDUpdateIn.resetFlags(true, true);
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDUpdateIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }


/**
 *
 * Sets the CmfBonusPoint
 * @param CRBDUpdateInIn Value of the CRBDUpdateIn
 *
 */

  public void setCmfBonusPoint(CmfBonusPointObjectData CRBDUpdateInIn) {
    CRBDUpdateIn = CRBDUpdateInIn;
  }

  public void translateFromMap() {
    CRBDUpdateIn = CmfBonusPointObjectHelper.fromMap(inputMap, "CmfBonusPoint");
  }

/**
 *
 * Gets the CmfBonusPoint
 * @return Value of the CmfBonusPoint
 *
 */

  public CmfBonusPointObjectData getCmfBonusPoint( ) {
    return CRBDUpdateIn;
  }

}
