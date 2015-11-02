/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusObjectData CSUpdateIn;
/**
 *
 * Constructor to create a  CmfStatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectData CSUpdateInIn) {
    super(id, context, "CmfStatusUpdate");
    CSUpdateIn = CSUpdateInIn;
  }

  public void translateToMap() {
    if (CSUpdateIn != null) {
      CSUpdateIn.resetFlags(true, true);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(CSUpdateIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }


/**
 *
 * Sets the CmfStatus
 * @param CSUpdateInIn Value of the CSUpdateIn
 *
 */

  public void setCmfStatus(CmfStatusObjectData CSUpdateInIn) {
    CSUpdateIn = CSUpdateInIn;
  }

  public void translateFromMap() {
    CSUpdateIn = CmfStatusObjectHelper.fromMap(inputMap, "CmfStatus");
  }

/**
 *
 * Gets the CmfStatus
 * @return Value of the CmfStatus
 *
 */

  public CmfStatusObjectData getCmfStatus( ) {
    return CSUpdateIn;
  }

}
