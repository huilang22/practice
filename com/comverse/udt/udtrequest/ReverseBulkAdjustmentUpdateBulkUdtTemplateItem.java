/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ReverseBulkAdjustmentUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ReverseBulkAdjustmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ReverseBulkAdjustmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestObjectData ___BatchRequest;
  protected Integer _ReasonCode;
/**
 *
 * Constructor to create a  ReverseBulkAdjustmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ReverseBulkAdjustmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestObjectData ___BatchRequestIn, Integer _ReasonCodeIn) {
    super(id, context, "ReverseBulkAdjustmentUpdate");
    ___BatchRequest = ___BatchRequestIn;
    _ReasonCode = _ReasonCodeIn;
  }

  public void translateToMap() {
    if (___BatchRequest != null) {
      ___BatchRequest.resetFlags(true, true);
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___BatchRequest, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
    if (_ReasonCode != null) {
      addInput("ReasonCode", _ReasonCode);
    }
  }


/**
 *
 * Sets the BatchRequest
 * @param ___BatchRequestIn Value of the ___BatchRequest
 *
 */

  public void setBatchRequest(BatchRequestObjectData ___BatchRequestIn) {
    ___BatchRequest = ___BatchRequestIn;
  }

/**
 *
 * Sets the ReasonCode
 * @param _ReasonCodeIn Value of the _ReasonCode
 *
 */

  public void setReasonCode(Integer _ReasonCodeIn) {
    _ReasonCode = _ReasonCodeIn;
  }

  public void translateFromMap() {
    ___BatchRequest = BatchRequestObjectHelper.fromMap(inputMap, "BatchRequest");
    _ReasonCode = (Integer)inputMap.get("ReasonCode");
  }

/**
 *
 * Gets the BatchRequest
 * @return Value of the BatchRequest
 *
 */

  public BatchRequestObjectData getBatchRequest( ) {
    return ___BatchRequest;
  }

/**
 *
 * Gets the ReasonCode
 * @return Value of the ReasonCode
 *
 */

  public Integer getReasonCode( ) {
    return _ReasonCode;
  }

}
