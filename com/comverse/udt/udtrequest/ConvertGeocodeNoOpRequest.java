/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConvertGeocodeNoOpRequest.java
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
 * NoOp class used to simulate a ConvertGeocodeNoOpRequest Udt Request/Response
 *
 */
public class ConvertGeocodeNoOpRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a   ConvertGeocodeNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConvertGeocodeNoOpRequest(String id, String noOpIn) {
    super(id, "ConvertGeocodeNoOpRequest");
    if (noOpIn != null) {
      addInput("FXgeocode", noOpIn);
    }
  }
/**
 *
 * Retrieves the String passed into the constructor
 * @return Simulated response
 *
 */
  public String getOutput() {
    return  (String)outputMap.get("FXgeocode");
  }
}
