/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationCreateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GenericEnumerationCreateNoOpRequest Udt Request/Response
 *
 */
public class GenericEnumerationCreateNoOpRequest extends GenericEnumerationSubRequestParent {
/**
 *
 * Constructor to create a   GenericEnumerationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GenericEnumerationCreateNoOpRequest(String id, GEObjectData noOpIn) {
    super(id, "GenericEnumerationCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(noOpIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
/**
 *
 * Retrieves the GEObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GEObjectData getOutput() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
