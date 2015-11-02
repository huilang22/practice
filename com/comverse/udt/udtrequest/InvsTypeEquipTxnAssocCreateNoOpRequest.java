/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocCreateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a InvsTypeEquipTxnAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeEquipTxnAssocCreateNoOpRequest extends InvsTypeEquipTxnAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocCreateNoOpRequest(String id, InvsTypeEquipTxnAssocObjectData noOpIn) {
    super(id, "InvsTypeEquipTxnAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsTypeEquipTxnAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnAssocObjectData getOutput() {
    return InvsTypeEquipTxnAssocObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
}
