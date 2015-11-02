/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusChgReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusChgReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusChgReasonObjectData CSCRUpdateIn;
/**
 *
 * Constructor to create a  CmfStatusChgReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusChgReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectData CSCRUpdateInIn) {
    super(id, context, "CmfStatusChgReasonUpdate");
    CSCRUpdateIn = CSCRUpdateInIn;
  }

  public void translateToMap() {
    if (CSCRUpdateIn != null) {
      CSCRUpdateIn.resetFlags(true, true);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRUpdateIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }


/**
 *
 * Sets the CmfStatusChgReason
 * @param CSCRUpdateInIn Value of the CSCRUpdateIn
 *
 */

  public void setCmfStatusChgReason(CmfStatusChgReasonObjectData CSCRUpdateInIn) {
    CSCRUpdateIn = CSCRUpdateInIn;
  }

  public void translateFromMap() {
    CSCRUpdateIn = CmfStatusChgReasonObjectHelper.fromMap(inputMap, "CmfStatusChgReason");
  }

/**
 *
 * Gets the CmfStatusChgReason
 * @return Value of the CmfStatusChgReason
 *
 */

  public CmfStatusChgReasonObjectData getCmfStatusChgReason( ) {
    return CSCRUpdateIn;
  }

}
