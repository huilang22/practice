/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocGetRequest.java
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
 * Class used to create a InvsTypeEquipTxnAssocGetRequest Udt Request
 *
 */

public class InvsTypeEquipTxnAssocGetRequest extends InvsTypeEquipTxnAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocGetRequest
 * @param id Unique request name
 * @param ITETAGetIn InvsTypeEquipTxnTablesObjectKeyData for InvsTypeEquipTxnAssocGetRequest
 *
 */
@JsonCreator
  public InvsTypeEquipTxnAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeEquipTxnAssoc")InvsTypeEquipTxnTablesObjectKeyData ITETAGetIn) {
    super(id, "InvsTypeEquipTxnAssocGet");
    if (ITETAGetIn != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectKeyHelper.toMap(ITETAGetIn, new HashMap(), "InvsTypeEquipTxnTablesObjectKeyData").get("InvsTypeEquipTxnTablesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsTypeEquipTxnTablesObjectData that results from the InvsTypeEquipTxnAssocGetRequest call
 * @return InvsTypeEquipTxnTablesObjectData resulting from udt call
 *
 */

  public InvsTypeEquipTxnTablesObjectData getOutput() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
}
