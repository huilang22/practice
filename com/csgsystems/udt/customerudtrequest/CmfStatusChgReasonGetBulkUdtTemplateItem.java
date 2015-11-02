/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusChgReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusChgReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusChgReasonObjectKeyData CSCRGetIn;
/**
 *
 * Constructor to create a  CmfStatusChgReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusChgReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectKeyData CSCRGetInIn) {
    super(id, context, "CmfStatusChgReasonGet");
    CSCRGetIn = CSCRGetInIn;
  }

  public void translateToMap() {
    if (CSCRGetIn != null) {
      CSCRGetIn.resetFlags(true, true);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(CSCRGetIn, new HashMap(), "CmfStatusChgReasonObjectKeyData").get("CmfStatusChgReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the CmfStatusChgReason
 * @param CSCRGetInIn Value of the CSCRGetIn
 *
 */

  public void setCmfStatusChgReason(CmfStatusChgReasonObjectKeyData CSCRGetInIn) {
    CSCRGetIn = CSCRGetInIn;
  }

  public void translateFromMap() {
    CSCRGetIn = CmfStatusChgReasonObjectKeyHelper.fromMap(inputMap, "CmfStatusChgReason");
  }

/**
 *
 * Gets the CmfStatusChgReason
 * @return Value of the CmfStatusChgReason
 *
 */

  public CmfStatusChgReasonObjectKeyData getCmfStatusChgReason( ) {
    return CSCRGetIn;
  }

}
