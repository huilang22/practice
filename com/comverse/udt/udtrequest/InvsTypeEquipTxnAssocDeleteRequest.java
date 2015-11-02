/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocDeleteRequest.java
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
 * Class used to create a InvsTypeEquipTxnAssocDeleteRequest Udt Request
 *
 */

public class InvsTypeEquipTxnAssocDeleteRequest extends InvsTypeEquipTxnAssocRequest {
/**
 *
 * Constructor to create a  InvsTypeEquipTxnAssocDeleteRequest
 * @param id Unique request name
 * @param ITETADeleteIn InvsTypeEquipTxnAssocObjectKeyData for InvsTypeEquipTxnAssocDeleteRequest
 *
 */
@JsonCreator
  public InvsTypeEquipTxnAssocDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeEquipTxnAssoc")InvsTypeEquipTxnAssocObjectKeyData ITETADeleteIn) {
    super(id, "InvsTypeEquipTxnAssocDelete");
    if (ITETADeleteIn != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectKeyHelper.toMap(ITETADeleteIn, new HashMap(), "InvsTypeEquipTxnAssocObjectKeyData").get("InvsTypeEquipTxnAssocObjectKeyData"));
    }
  }

}
