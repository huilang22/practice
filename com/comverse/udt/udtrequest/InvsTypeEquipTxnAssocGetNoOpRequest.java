/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypeEquipTxnAssocGetNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeEquipTxnAssocGetNoOpRequest extends InvsTypeEquipTxnAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocGetNoOpRequest(String id, InvsTypeEquipTxnTablesObjectData noOpIn) {
    super(id, "InvsTypeEquipTxnAssocGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsTypeEquipTxnTablesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnTablesObjectData getOutput() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
}
