/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationDetailAssocGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailAssocGetNoOpRequest extends InvsLocationDetailAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationDetailAssocGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailAssocGetNoOpRequest(String id, InvsLocationTablesObjectData noOpIn) {
    super(id, "InvsLocationDetailAssocGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsLocationTablesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationTablesObjectData getOutput() {
    return InvsLocationTablesObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
}
