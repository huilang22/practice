/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfBonusPointFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfBonusPointFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfBonusPointObjectFilter CRBDFindIn;
/**
 *
 * Constructor to create a  CmfBonusPointFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfBonusPointFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectFilter CRBDFindInIn) {
    super(id, context, "CmfBonusPointFind");
    CRBDFindIn = CRBDFindInIn;
  }

  public void translateToMap() {
    if (CRBDFindIn != null) {
      Integer index =  CRBDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(CRBDFindIn, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }


/**
 *
 * Sets the CmfBonusPoint
 * @param CRBDFindInIn Value of the CRBDFindIn
 *
 */

  public void setCmfBonusPoint(CmfBonusPointObjectFilter CRBDFindInIn) {
    CRBDFindIn = CRBDFindInIn;
  }

  public void translateFromMap() {
    CRBDFindIn = CmfBonusPointObjectHelper.fromMapFilter(inputMap, "CmfBonusPoint");
  }

/**
 *
 * Gets the CmfBonusPoint
 * @return Value of the CmfBonusPoint
 *
 */

  public CmfBonusPointObjectFilter getCmfBonusPoint( ) {
    return CRBDFindIn;
  }

}
