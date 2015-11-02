/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusChgReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusChgReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusChgReasonObjectData CSCRCreateIn;
/**
 *
 * Constructor to create a  CmfStatusChgReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusChgReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRCreateInIn) {
    super(id, context, "CmfStatusChgReasonCreate");
    CSCRCreateIn = CSCRCreateInIn;
  }

  public void translateToMap() {
    if (CSCRCreateIn != null) {
      CSCRCreateIn.resetFlags(true, true);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRCreateIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }


/**
 *
 * Sets the CmfStatusChgReason
 * @param CSCRCreateInIn Value of the CSCRCreateIn
 *
 */

  public void setCmfStatusChgReason(CmfStatusChgReasonObjectData CSCRCreateInIn) {
    CSCRCreateIn = CSCRCreateInIn;
  }

  public void translateFromMap() {
    CSCRCreateIn = CmfStatusChgReasonObjectHelper.fromMap(inputMap, "CmfStatusChgReason");
  }

/**
 *
 * Gets the CmfStatusChgReason
 * @return Value of the CmfStatusChgReason
 *
 */

  public CmfStatusChgReasonObjectData getCmfStatusChgReason( ) {
    return CSCRCreateIn;
  }

}
