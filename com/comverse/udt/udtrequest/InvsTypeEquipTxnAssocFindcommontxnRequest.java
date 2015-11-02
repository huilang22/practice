/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocFindcommontxnRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeEquipTxnAssocFindcommontxnRequest Udt Request
 *
 */

public class InvsTypeEquipTxnAssocFindcommontxnRequest extends InvsTypeEquipTxnAssocRequest {
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocFindcommontxnRequest
 * @param id Unique request name
 * @param ITETAFindCommonIn ITETAInventoryTypeObjectData[] for InvsTypeEquipTxnAssocFindcommontxnRequest
 *
 */
@JsonCreator
  public InvsTypeEquipTxnAssocFindcommontxnRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeEquipTxnAssoc")ITETAInventoryTypeObjectData[] ITETAFindCommonIn) {
    super(id, "InvsTypeEquipTxnAssocFindcommontxn");
    if (ITETAFindCommonIn != null) {
      Object[] list = new Object[ITETAFindCommonIn.length];
      for (int i = 0; i < ITETAFindCommonIn.length; i++) {
        list[i] = ITETAInventoryTypeObjectHelper.getMap(ITETAFindCommonIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvsTypeEquipTxnAssoc");
      }
      addInput("InvsTypeEquipTxnAssocList", list);
    }
  }

/**
 *
 * Retrieves the ITETAEquipmentTransactionIdObjectDataList that results from the InvsTypeEquipTxnAssocFindcommontxnRequest call
 * @return ITETAEquipmentTransactionIdObjectDataList resulting from udt call
 *
 */

  public ITETAEquipmentTransactionIdObjectDataList getOutput() {
    return ITETAEquipmentTransactionIdObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
}
