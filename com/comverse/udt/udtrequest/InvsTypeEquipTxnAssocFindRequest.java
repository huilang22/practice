/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocFindRequest.java
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
 * Class used to create a InvsTypeEquipTxnAssocFindRequest Udt Request
 *
 */

public class InvsTypeEquipTxnAssocFindRequest extends InvsTypeEquipTxnAssocRequest {
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocFindRequest
 * @param id Unique request name
 * @param ITETAFindIn InvsTypeEquipTxnTablesObjectFilter for InvsTypeEquipTxnAssocFindRequest
 *
 */
@JsonCreator
  public InvsTypeEquipTxnAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeEquipTxnAssoc")InvsTypeEquipTxnTablesObjectFilter ITETAFindIn) {
    super(id, "InvsTypeEquipTxnAssocFind");
    if (ITETAFindIn != null) {
      Integer index =  ITETAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectHelper.toMap(ITETAFindIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsTypeEquipTxnTablesObjectDataList that results from the InvsTypeEquipTxnAssocFindRequest call
 * @return InvsTypeEquipTxnTablesObjectDataList resulting from udt call
 *
 */

  public InvsTypeEquipTxnTablesObjectDataList getOutput() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
}
