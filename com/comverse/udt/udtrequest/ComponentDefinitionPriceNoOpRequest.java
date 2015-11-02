/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionPriceNoOpRequest.java
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
 * NoOp class used to simulate a ComponentDefinitionPriceNoOpRequest Udt Request/Response
 *
 */
public class ComponentDefinitionPriceNoOpRequest extends ComponentDefinitionRequest {
/**
 *
 * Constructor to create a   ComponentDefinitionPriceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentDefinitionPriceNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "ComponentDefinitionPriceNoOpRequest");
    if (noOpIn != null) {
      addInput("CdPrice", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("CdPrice");
  }
}
