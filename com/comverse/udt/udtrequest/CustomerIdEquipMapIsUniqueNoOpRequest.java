/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapIsUniqueNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerIdEquipMapIsUniqueNoOpRequest Udt Request/Response
 *
 */
public class CustomerIdEquipMapIsUniqueNoOpRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a   CustomerIdEquipMapIsUniqueNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerIdEquipMapIsUniqueNoOpRequest(String id, Integer noOpIn) {
    super(id, "CustomerIdEquipMapIsUniqueNoOpRequest");
    if (noOpIn != null) {
      addInput("IsUnique", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("IsUnique");
  }
}
