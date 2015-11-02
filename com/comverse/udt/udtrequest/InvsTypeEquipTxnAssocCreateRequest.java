/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocCreateRequest.java
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
 * Class used to create a InvsTypeEquipTxnAssocCreateRequest Udt Request
 *
 */

public class InvsTypeEquipTxnAssocCreateRequest extends InvsTypeEquipTxnAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocCreateRequest
 * @param id Unique request name
 * @param ITETACreateIn InvsTypeEquipTxnAssocObjectData for InvsTypeEquipTxnAssocCreateRequest
 *
 */
@JsonCreator
  public InvsTypeEquipTxnAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeEquipTxnAssoc")InvsTypeEquipTxnAssocObjectData ITETACreateIn) {
    super(id, "InvsTypeEquipTxnAssocCreate");
    if (ITETACreateIn != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(ITETACreateIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsTypeEquipTxnAssocObjectData that results from the InvsTypeEquipTxnAssocCreateRequest call
 * @return InvsTypeEquipTxnAssocObjectData resulting from udt call
 *
 */

  public InvsTypeEquipTxnAssocObjectData getOutput() {
    return InvsTypeEquipTxnAssocObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
}
