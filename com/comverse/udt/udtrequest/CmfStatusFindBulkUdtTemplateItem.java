/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectFilter CSFindIn;
/**
 *
 * Constructor to create a  CmfStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectFilter CSFindInIn) {
    super(id, context, "CmfStatusFind");
    CSFindIn = CSFindInIn;
  }

  public void translateToMap() {
    if (CSFindIn != null) {
      Integer index =  CSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSFindIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSFindInIn Value of the CSFindIn
 *
 */

  public void setCmfStatus(CmfStatusObjectFilter CSFindInIn) {
    CSFindIn = CSFindInIn;
  }

  public void translateFromMap() {
    CSFindIn = CmfStatusObjectHelper.fromMapFilter(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectFilter getCmfStatus( ) {
    return CSFindIn;
  }

}
