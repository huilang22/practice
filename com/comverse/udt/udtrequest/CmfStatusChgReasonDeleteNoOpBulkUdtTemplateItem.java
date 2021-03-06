/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfStatusChgReasonDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfStatusChgReasonDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfStatusChgReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfStatusChgReasonDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfStatusChgReasonDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectData noOpInIn) {
    super(id, context, "CmfStatusChgReasonDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(noOpIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
/**
 *
 * Sets the  CmfStatusChgReason
 * @param noOpInIn CmfStatusChgReasonObjectData to set
 *
 */
  public void setCmfStatusChgReason(CmfStatusChgReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfStatusChgReason passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusChgReasonObjectData getCmfStatusChgReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfStatusChgReasonObjectHelper.fromMap(inputMap, "CmfStatusChgReason");
  }
}
