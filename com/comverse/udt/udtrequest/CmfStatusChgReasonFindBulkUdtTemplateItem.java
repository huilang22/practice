/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a CmfStatusChgReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CmfStatusChgReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfStatusChgReasonObjectFilter CSCRFindIn;
/**
 *
 * Constructor to create a  CmfStatusChgReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CmfStatusChgReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectFilter CSCRFindInIn) {
    super(id, context, "CmfStatusChgReasonFind");
    CSCRFindIn = CSCRFindInIn;
  }

  public void translateToMap() {
    if (CSCRFindIn != null) {
      Integer index =  CSCRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(CSCRFindIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }


/**
 *
 * Sets the CmfStatusChgReason
 * @param CSCRFindInIn Value of the CSCRFindIn
 *
 */

  public void setCmfStatusChgReason(CmfStatusChgReasonObjectFilter CSCRFindInIn) {
    CSCRFindIn = CSCRFindInIn;
  }

  public void translateFromMap() {
    CSCRFindIn = CmfStatusChgReasonObjectHelper.fromMapFilter(inputMap, "CmfStatusChgReason");
  }

/**
 *
 * Gets the CmfStatusChgReason
 * @return Value of the CmfStatusChgReason
 *
 */

  public CmfStatusChgReasonObjectFilter getCmfStatusChgReason( ) {
    return CSCRFindIn;
  }

}
