/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDefaultCreateNoOpRequest.java
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
 * NoOp class used to simulate a CustomerIdEquipMapDefaultCreateNoOpRequest Udt Request/Response
 *
 */
public class CustomerIdEquipMapDefaultCreateNoOpRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a   CustomerIdEquipMapDefaultCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerIdEquipMapDefaultCreateNoOpRequest(String id, CustomerIdEquipMapObjectData noOpIn) {
    super(id, "CustomerIdEquipMapDefaultCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(noOpIn, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
/**
 *
 * Retrieves the CustomerIdEquipMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}
