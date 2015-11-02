/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusChgReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusChgReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusChgReasonObjectKeyData CSCRDeleteIn;
/**
 *
 * Constructor to create a  CmfStatusChgReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusChgReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRDeleteInIn) {
    super(id, context, "CmfStatusChgReasonDelete");
    CSCRDeleteIn = CSCRDeleteInIn;
  }

  public void translateToMap() {
    if (CSCRDeleteIn != null) {
      CSCRDeleteIn.resetFlags(true, true);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(CSCRDeleteIn, new HashMap(), "CmfStatusChgReasonObjectKeyData").get("CmfStatusChgReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfStatusChgReason
 * @param CSCRDeleteInIn Value of the CSCRDeleteIn
 *
 */

  public void setCmfStatusChgReason(CmfStatusChgReasonObjectKeyData CSCRDeleteInIn) {
    CSCRDeleteIn = CSCRDeleteInIn;
  }

  public void translateFromMap() {
    CSCRDeleteIn = CmfStatusChgReasonObjectKeyHelper.fromMap(inputMap, "CmfStatusChgReason");
  }

/**
 *
 * Gets the CmfStatusChgReason
 * @return Value of the CmfStatusChgReason
 *
 */

  public CmfStatusChgReasonObjectKeyData getCmfStatusChgReason( ) {
    return CSCRDeleteIn;
  }

}
