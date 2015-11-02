/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionPriceNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageDefinitionPriceNoOpRequest Udt Request/Response
 *
 */
public class PackageDefinitionPriceNoOpRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a   PackageDefinitionPriceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageDefinitionPriceNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "PackageDefinitionPriceNoOpRequest");
    if (noOpIn != null) {
      addInput("PdPrice", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("PdPrice");
  }
}
